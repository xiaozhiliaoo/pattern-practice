package org.lili.principles.srp.refactor;

/**
 * Created by lili on 2017/7/8.
 */
public class MainClass {
    public static void main(String[] args) {

        //改变一个职责，不会对另一职责进行改变
        Input input = new Input();
        input.clientInput();
        Validator validator = new Validator();
        if(validator.validate(input.getUsername(),input.getUpassword())){
            DBManager.getConnection();
            DAOImp dao = new DAOImp();
            dao.save(input.getUsername(), input.getUpassword());
        }
    }
}
