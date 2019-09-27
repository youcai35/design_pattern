package com.gyc.structural.proxy.staticproxy;

import com.gyc.structural.proxy.IOrderService;
import com.gyc.structural.proxy.Order;
import com.gyc.structural.proxy.OrderServiceImpl;
import com.gyc.structural.proxy.db.DataSourceContextHolder;

public class OrderServiceStaticProxy {
    private IOrderService orderService;

    public int saveOrder(Order order){
        beforeMethod(order);
        orderService = new OrderServiceImpl();
        int result = orderService.saveOrder(order);
        afterMethod(order);
        return result;
    }

    private void beforeMethod(Order order){
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db"+dbRouter+"】处理数据");
        // TODO 设置dataSource
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));
        System.out.println("静态代理 before code");
    }
    private void afterMethod(Order order){
        System.out.println("静态代理 after code ");
    }
}
