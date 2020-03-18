package org.lili.principles.srp.refactor;

/**
 * Created by lili on 2017/7/8.
 */
public class DAOImp {
    //进行数据操作
    public void save(String username,String upassword) {
        System.out.println("将" + username + "保存到了数据库");
        System.out.println("将" + upassword + "保存到了数据库");
    }
}

