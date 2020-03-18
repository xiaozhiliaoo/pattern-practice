package org.lili.structural.flyweight.ex2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lili on 2017/7/9.
 */
public class MKRoomGroupDataFactory {

    private Map<String,MKRoomGroupData> pool;

    public MKRoomGroupDataFactory() {
        this.pool = new HashMap<String, MKRoomGroupData>();
    }

    public MKRoomGroupData getMKRoomGroupData(String roomcode,String name,Integer sort){

        MKRoomGroupData groupData = pool.get(roomcode);

        if(groupData==null){
            groupData = new MKRoomGroupData();
            groupData.setRoomCode(roomcode);
            groupData.setName(name);
            groupData.setSort(sort);
            pool.put(roomcode,groupData);
        }
        return groupData;
    }
}
