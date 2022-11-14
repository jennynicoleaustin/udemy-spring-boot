package com.ltp.globalsuperstore.services;

import com.ltp.globalsuperstore.Constants;
import com.ltp.globalsuperstore.Item;
import com.ltp.globalsuperstore.repository.SuperstoreRepository;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SuperstoreServices {
    SuperstoreRepository superstoreRepository = new SuperstoreRepository();

    public int getItemIndex(String id) {
        for (int i = 0; i < superstoreRepository.getItems().size(); i++) {
            if (superstoreRepository.getItems().get(i).getId().equals(id)) return i;
        }
        return Constants.NOT_FOUND;
    }
    public boolean within5Days(Date newDate, Date oldDate) {
        long diff = Math.abs(newDate.getTime() - oldDate.getTime());
        return (int) (TimeUnit.MILLISECONDS.toDays(diff)) <= 5;
    }
    public List<Item> getItems() {
        return superstoreRepository.getItems();
    }
    public Item getItem(int index) {
        return superstoreRepository.getItems().get(index);
    }
    public void addItem(Item item) {
        superstoreRepository.getItems().add(item);
    }
    public void updateItem (Item item, int index) {
        superstoreRepository.getItems().set(index, item);
    }

    public Item getItemByID (String id) {
        int index = getItemIndex(id);
        return index == Constants.NOT_FOUND ? new Item() : getItems().get(index);
    }
    public Item status (Item item) {
        int index = getItemIndex(item.getId());
        String status = Constants.SUCCESS_STATUS;
        if (index == Constants.NOT_FOUND) {
            getItems().add(item);
        } else if (within5Days(item.getDate(), getItems().get(index).getDate())) {
            getItems().set(index, item);
        } else {
            status = Constants.FAILED_STATUS;
        }
        return null;
    }
}
