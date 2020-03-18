package org.lili.principles.srp;

import java.util.Scanner;

/**
 * Created by lili on 2017/7/8.
 */
public class SaveToDB {

    private String username;
    private String password;

    //获得客户端输入
    public void clientInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        username = scanner.nextLine();
        System.out.println("请输入密码：");
        password = scanner.nextLine();
    }

    //进行数据校验
    public boolean validate(){
        if(username==null || "".equals(username.trim())){
            System.out.println("用户名不能为空");
            return false;
        }
        if(password==null || "".equals(password.trim())){
            System.out.println("密码不能为空");
            return false;
        }
        return true;
    }

    //连接数据库
    public void getConnection(){
        System.out.println("获取数据库连接");
    }

    //进行数据操作
    public void save() {
        System.out.println("将" + username + "保存到了数据库");
        System.out.println("将" + password + "保存到了数据库");
    }
}
