package org.lili.creational.nullobject;

/**
 * Created by lili on 2017/7/14.
 */
public class CustomerFactory {
    private static final String[] names = {"Rob","Joe","Julie"};
    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if(names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
