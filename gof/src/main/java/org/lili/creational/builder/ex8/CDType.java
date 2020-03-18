package org.lili.creational.builder.ex8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lili on 2017/7/16.
 */
public class CDType {
    private List<Packing> items = new ArrayList<Packing>();

    public void addItems(Packing packs) {
        items.add(packs);
    }

    public void getCost() {
        for (Packing packing : items) {
            packing.pack();
        }
    }

    public void showItems() {
        for (Packing packing : items) {
            System.out.print("CD name : " + packing.pack());
            System.out.println(", Price : " + packing.price());
        }
    }
}
