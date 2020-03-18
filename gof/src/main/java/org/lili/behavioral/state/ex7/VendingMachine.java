package org.lili.behavioral.state.ex7;

import java.util.EnumMap;
import java.util.Iterator;

import static org.lili.behavioral.state.ex7.Input.*;

/**
 * Created by lili on 2017/8/6
 */



enum Category{

    MONEY(NICKEL, DIME, QUARTER, DOLLAR),
    ITEM_SELECTION(TOOTHPASTE,CHIPS,SOAP,SODA),
    QUIT_TRANSACTION(ABORT_TRANSACTION),
    SHUT_DOWN(STOP);

    private Input[] values;

    Category(Input... types){
        values = types;
    }

    private static EnumMap<Input,Category> categories = new EnumMap<Input, Category>(Input.class);

    static {
        for(Category c:Category.class.getEnumConstants()){
            for(Input type:c.values){
                categories.put(type,c);
            }
        }
    }

    public static Category categorize(Input input){
        return categories.get(input);
    }
}

interface Generator<T> {T next();}

public class VendingMachine {

    private static State state = State.RESTING;
    private static int amount = 0;
    private static Input selection = null;

    enum StateDuration{
        TRANSIENT
    };

    enum State{
        RESTING{

        },

        ADDING_MONEY{

        },

        DISPENSING(StateDuration.TRANSIENT){

        },

        GIVING_CHANGE(StateDuration.TRANSIENT){

        },

        TERMINAL{
            void output(){
                System.out.println("Halted");
            }
        };

        private boolean isTransient = false;

        State(){}

        State(StateDuration trans){
            isTransient = true;
        }

        void next(Input input){
            throw new RuntimeException("Only Call next(Input input) for non-transient states");
        }

        void next(){
            throw new RuntimeException("Only Call next() for StateDuration.TRANSIENT states");
        }

        void output(){
            System.out.println(amount);
        }


    }

    static void run(Generator<Input> gen){
        while(state!=State.TERMINAL){
            state.next(gen.next());
            while (state.isTransient){
                state.next();
            }
            state.output();
        }

    }



    public static void main(String[] args) {
        Generator<Input> gen = new RandomInputGenerator();
        if(args.length == 1){
            gen  = new FileInputGenerator(args[0]);
        }
        run(gen);
    }


}


 class RandomInputGenerator implements Generator<Input>{

    public Input next() {
        return Input.randomSelection();
    }
}

 class FileInputGenerator implements Generator<Input>{

    private Iterator<String> input;

     public FileInputGenerator(String fileName) {
//         input = new TextFile(fileName,";").iterator();
     }

     public Input next() {
        return null;
    }
}












