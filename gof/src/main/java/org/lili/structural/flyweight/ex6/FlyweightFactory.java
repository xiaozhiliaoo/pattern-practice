package org.lili.structural.flyweight.ex6;


import java.awt.*;
import java.util.*;

/**
 * Created by lili on 2017/7/10.
 */
public class FlyweightFactory {

    private static Map treeMap = new TreeMap();
    private static int sharedButtons = 0;
    private static ButtonListener listener = new ButtonListener();

    public static Button makeButton(String num){
        Button button ;
        if(treeMap.containsKey(num)){
            /**
             * // 1. Identify intrinsic state (Button label)
             //   2. Return an existing object   [The same Button cannot be added
             //    multiple times to a container, and, Buttons cannot be cloned.
             //    So - this is only simulating the sharing that the Flyweight
             //    pattern provides.]
             */
            button = new Button(((Button) treeMap.get(num)).getLabel());
            sharedButtons++;
        }else{
            button = new Button(num);
            treeMap.put(num,button);
        }
        button.addActionListener(listener);
        return button;
    }

    public static void report(){
        System.out.print("new Buttons - " + treeMap.size() + ", \"shared\" Buttons - " + sharedButtons + ", ");
        for(Object o:treeMap.keySet()){
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
