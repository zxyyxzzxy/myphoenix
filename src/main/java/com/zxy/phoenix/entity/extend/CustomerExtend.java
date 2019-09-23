package com.zxy.phoenix.entity.extend;

import com.zxy.phoenix.entity.Item;

import java.util.List;

/**
 * Created by ZhouXinyu on 2019/9/20 18:05.
 */
public class CustomerExtend {
    private String id;
    private String name;
    List<Item> items;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
