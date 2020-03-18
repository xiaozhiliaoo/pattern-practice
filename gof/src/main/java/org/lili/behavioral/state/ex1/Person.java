package org.lili.behavioral.state.ex1;

/**
 * Created by lili on 2017/7/8.
 */
public class Person {

    private int hour;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void doSth(){
        if(hour == 7){
            System.out.println("吃早饭");
        }else if(hour == 12){
            System.out.println("吃午饭");
        }else if(hour == 18){
            System.out.println("吃晚饭");
        }else{
            System.out.println("......未定义");
        }
    }
}
