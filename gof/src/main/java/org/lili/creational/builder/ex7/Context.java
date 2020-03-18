package org.lili.creational.builder.ex7;

/**
 * Created by lili on 2017/7/16.
 */
public class Context {
    private String firstName = "li";
    private String lastName = "li";
    private String sex = "man";
    private String address = "beijing";

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
