package org.lili.structural.flyweight.ex2;

import java.util.*;

/**
 * Created by lili on 2017/7/9.
 */
public class MainClass {


    private static class RoomGroupComparator implements Comparator<MKRoomGroupData>{

        public int compare(MKRoomGroupData roomGroup1, MKRoomGroupData roomGroup2) {
            int r1 = roomGroup1.getSort();
            int r2 = roomGroup2.getSort();
            int diff = r1 - r2;
            if (diff != 0) {
                return diff;
            }
            return diff;
//			return roomGroup1.getSort()-roomGroup2.getSort();
        }
    }


    public static void main(String[] args) {
       /* MKRoomGroupData d1 = new MKRoomGroupData("1");
        MKRoomGroupData d2 = new MKRoomGroupData("1");
        MKRoomGroupData d3 = new MKRoomGroupData("2");
        MKRoomGroupData d4 = new MKRoomGroupData("2");
        MKRoomGroupData d5 = new MKRoomGroupData("3");
        MKRoomGroupData d6 = new MKRoomGroupData("4");
        MKRoomGroupData d7 = new MKRoomGroupData("4");
        MKRoomGroupData d8 = new MKRoomGroupData("4");
        MKRoomGroupData d9 = new MKRoomGroupData("4");
        System.out.println(d1==d2);*/

        MKRoomGroupDataFactory factory = new MKRoomGroupDataFactory();
        MKRoomGroupData d11 = factory.getMKRoomGroupData("1","餐厅",1);
        MKRoomGroupData d12 = factory.getMKRoomGroupData("1","餐厅",1);
        MKRoomGroupData d21 = factory.getMKRoomGroupData("2","客厅",2);
        MKRoomGroupData d22 = factory.getMKRoomGroupData("2","客厅",2);
        MKRoomGroupData d31 = factory.getMKRoomGroupData("3","卧室",3);
        MKRoomGroupData d32 = factory.getMKRoomGroupData("3","卧室",3);

        Map<MKRoomGroupData,List> mmap = new TreeMap<MKRoomGroupData, List>(new RoomGroupComparator());
        List<String> l = new ArrayList<String>();
        l.add("11111111");
        l.add("111111111111111");
        l.add("111111111111111111111");
        l.add("11111111111111111111111111111");
        List<String> l2 = new ArrayList<String>();
        l2.add("2222222");
        l2.add("2222222");
        l2.add("222222222222");
        l2.add("222222222222222222");
        List<String> l3 = new ArrayList<String>();
        l3.add("3333333333333333");
        l3.add("3333333333");
        l3.add("333333333333");
        l3.add("333333333333333");
//        List<String> l4 = new ArrayList<String>();
//        l3.add("44444");
//        l3.add("44444444");
//        l3.add("44444444444444");
//        l3.add("44444444444444444444444");
        mmap.put(d11,l);
        mmap.put(d11,l2);
        mmap.put(d21,l2);
        mmap.put(d31,l3);
//        mmap.put(new MKRoomGroupData(),l4);
        for (Map.Entry<MKRoomGroupData,List> entry:mmap.entrySet()){
            System.out.println(entry.getKey().getName()+"-----"+entry.getValue());
        }

//        System.out.println(mmap.get(d11));
        System.out.println(d11==d12);
        System.out.println(d21==d22);
        System.out.println(d31==d32);
    }
}
