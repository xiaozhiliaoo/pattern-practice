package org.lili.creational.builder.ex8;

/**
 * Created by lili on 2017/7/16.
 */
public class CDBuilder {

    public CDType buildSonyCD(){
        CDType cds = new CDType();
        cds.addItems(new Sony());
        return cds;
    }

    public CDType buildSamsungCD(){
        CDType cds=new CDType();
        cds.addItems(new Samsung());
        return cds;
    }

    public static void main(String[] args) {
        //封装意义就是不想看到不属于自己的东西
        CDBuilder builder = new CDBuilder();
        builder.buildSonyCD().showItems();
        builder.buildSamsungCD().showItems();
        builder.buildSonyCD().showItems();
        builder.buildSamsungCD().showItems();
    }
}
