package org.lili.creational.builder.ex9;

import java.io.IOException;

/**
 *
 * @author Ashwani
 */
public class BuilderDemo {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        OrderBuilder builder = new OrderBuilder();

        //创建复杂对象......
        OrderedItems orderedItems = builder.preparePizza();
        
        orderedItems.showItems();
        
        System.out.println("\n");
        System.out.println("Total Cost : "+ orderedItems.getCost());
        
    }
}
