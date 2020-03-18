package org.lili.creational.nullobject;

/**
 * Created by lili on 2017/7/14.
 */
public class NullCustomer extends AbstractCustomer {
    public boolean isNil() {
        return true;
    }

    public String getName() {
        return "Not Available in Customer Database";
    }
}
