package com.zxy.phoenix;

import com.zxy.phoenix.entity.Order;
import com.zxy.phoenix.mapper.OrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by ZhouXinyu on 2019/9/18 11:12.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void testGetOrders() {
        List<Order> orders = orderMapper.getOrders();
        orders.forEach(System.out::println);
    }

}
