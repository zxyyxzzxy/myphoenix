package com.zxy.phoenix.entity.extend;

import com.zxy.phoenix.entity.Order;

import java.math.BigDecimal;

/**
 * Created by ZhouXinyu on 2019/9/20 17:31.
 */
public class OrderExtend extends Order {
    private String ItemName;
    private String customerName;
    private String price;

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
