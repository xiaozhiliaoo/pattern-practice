package org.lili.creational.builder.ex2;

/**
 * Created by lili on 2017/7/16.
 */
public class Car {
    private String partFirst;
    private String partMiddle;
    private String partEnd;

    public void setPartFirst(String partFirst) {
        this.partFirst = partFirst;
    }

    public void setPartMiddle(String partMiddle) {
        this.partMiddle = partMiddle;
    }

    public void setPartEnd(String partEnd) {
        this.partEnd = partEnd;
    }

    public String getPartFirst() {
        return partFirst;
    }

    public String getPartMiddle() {
        return partMiddle;
    }

    public String getPartEnd() {
        return partEnd;
    }
}
