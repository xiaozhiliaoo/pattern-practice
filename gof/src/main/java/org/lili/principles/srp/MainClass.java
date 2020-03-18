package org.lili.principles.srp;

/**
 * Created by lili on 2017/7/8.
 */
public class MainClass {

    public static void main(String[] args) {
        //SaveToDB职责太多了，新增客户端输入，新加属性，改变校验，长度规范的话，又要改saveToDB
        SaveToDB saveToDB = new SaveToDB();
        saveToDB.clientInput();
        if(saveToDB.validate()){
            saveToDB.getConnection();
            saveToDB.save();
        }
    }
}
