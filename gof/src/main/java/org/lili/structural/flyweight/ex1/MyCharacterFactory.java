package org.lili.structural.flyweight.ex1;


import java.util.*;

/**
 * Created by lili on 2017/7/9.
 */

//享元工厂
public class MyCharacterFactory {

    private Map<Character,MyCharacter> pool;

    public MyCharacterFactory() {
        this.pool = new HashMap<Character, MyCharacter>();
    }

    /**
     * MyCharacter myChar11 = factory.getMyCharacter('a');
       MyCharacter myChar22 = factory.getMyCharacter('b');
       MyCharacter myChar33 = factory.getMyCharacter('a');
       MyCharacter myChar44 = factory.getMyCharacter('d');
     * @param character
     * @return
     */
    public MyCharacter getMyCharacter(Character character){
        MyCharacter myCharacter = pool.get(character);
        if(myCharacter==null){
            myCharacter = new MyCharacter(character);
            pool.put(character,myCharacter);
        }
        return myCharacter;
    }
}
