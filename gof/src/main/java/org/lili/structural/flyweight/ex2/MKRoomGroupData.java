package org.lili.structural.flyweight.ex2;

import java.math.BigDecimal;

/**
 * Created by lili on 2017/7/9.
 */
public class MKRoomGroupData {

    private String roomCode;
    private BigDecimal saleAmountTotal;
    private String name;
    private Integer sort;
    private Long qtyTotal;

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public BigDecimal getSaleAmountTotal() {
        return saleAmountTotal;
    }

    public void setSaleAmountTotal(BigDecimal saleAmountTotal) {
        this.saleAmountTotal = saleAmountTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Long getQtyTotal() {
        return qtyTotal;
    }

    public void setQtyTotal(Long qtyTotal) {
        this.qtyTotal = qtyTotal;
    }


    /*public MKRoomGroupData(String roomCode) {
        this.roomCode = roomCode;
    }

    public MKRoomGroupData(String roomCode, String name, Integer sort) {
        this.roomCode = roomCode;
        this.name = name;
        this.sort = sort;
    }*/

    public MKRoomGroupData(){

    }

    public void display(){
        System.out.println(this.roomCode);
    }
}
