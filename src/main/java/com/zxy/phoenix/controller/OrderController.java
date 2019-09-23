package com.zxy.phoenix.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zxy.phoenix.entity.Order;
import com.zxy.phoenix.entity.extend.OrderExtend;
import com.zxy.phoenix.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    OrderMapper orderMapper;

    @RequestMapping("list")
    public List<Order> list(){
        return orderMapper.getOrders();
    }

    @GetMapping("get/{id}")
    public Order getById(@PathVariable("id") String id){
        return orderMapper.get(id);
    }

    @GetMapping("page/{pageNum}/{pageSize}")
    public List<Order> page(@PathVariable("pageNum") Integer pageNum,@PathVariable("pageSize") Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Order> orders = orderMapper.getOrders();
        PageInfo page=new PageInfo(orders);
        return page.getList();
    }

    @RequestMapping("upsert")
    public String add(Order order) {
        orderMapper.upsertOrder(order);
        return "upsert success";
    }

    @RequestMapping("delete/{id}")
    public String delete(@PathVariable String id) {
        orderMapper.delete(id);
        return "delete success";
    }

    @RequestMapping("test/list")
    public List<Map> testList(){
        return orderMapper.getTest();
    }

    @RequestMapping("listDetail")
    public List<OrderExtend> listDetail(){
        return orderMapper.getOrderDetailList();
    }

}
