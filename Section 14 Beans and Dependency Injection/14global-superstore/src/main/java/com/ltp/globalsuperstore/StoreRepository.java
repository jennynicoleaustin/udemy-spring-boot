package com.ltp.globalsuperstore;

import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StoreRepository {
    private final List<Item> items;

    public StoreRepository(List<Item> items) {
        this.items = items;
    }

    public Item getItem(int index) {
        return items.get(index);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void updateItem(Item item, int index) {
        items.set(index, item);
    }
    
    public List<Item> getItems() {
        return items;
    }


}
