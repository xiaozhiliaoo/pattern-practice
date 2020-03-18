
package org.lili.creational.builder.ex7;

/**
 * Created by lili on 2017/7/16.
 */
public class Customer {
    private Context context = new Context();
    public Customer fristName(String firstName){
        context.setFirstName(firstName);
        return this;
    }

    public Customer lastName(String lastName){
        context.setLastName(lastName);
        return this;
    }

    public Customer sex(String sex){
        context.setSex(sex);
        return this;
    }

    public Customer address(String address){
        context.setAddress(address);
        return this;
    }

    public void print(){
        System.out.println(
                context.getFirstName()+"---"+
                context.getLastName()+"----"+
                context.getAddress()+"----"+
                context.getSex()
        );
    }

    public static void main(String[] args) {
        Customer c = new Customer();
        c.fristName("li").lastName("li").address("Beijing").print();
    }

}
