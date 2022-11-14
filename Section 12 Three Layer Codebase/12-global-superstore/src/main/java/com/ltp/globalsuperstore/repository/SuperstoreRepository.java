package com.ltp.globalsuperstore.repository;

import com.ltp.globalsuperstore.Item;

import java.util.ArrayList;
import java.util.List;

public class SuperstoreRepository {
    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public Item getItem(int index) {
        return items.get(index);
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public void updateItem (Item item, int index) {
        items.set(index, item);
    }
}
