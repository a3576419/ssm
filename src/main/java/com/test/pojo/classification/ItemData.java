package com.test.pojo.classification;

import java.util.List;

public class ItemData {
    //private ItemData itemData;
    private String class_title;

    public ItemData() {

    }

    public ItemData(String class_title) {
        setClass_title(class_title);
    }

    public ItemData(List<Item> item, String class_title) {

        setItemList(item);
        setClass_title(class_title);
    }

    public String getClass_title() {
        return class_title;
    }

    public void setClass_title(String class_title) {
        this.class_title = class_title;
    }

    private List<Item>itemList;


    public ItemData(List<Item> item) {
        setItemList(item);
    }


    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

//    public ItemData getItemData() {
//        return itemData;
//    }
//
//    public void setItemData(ItemData itemData) {
//        this.itemData = itemData;
//    }
}
