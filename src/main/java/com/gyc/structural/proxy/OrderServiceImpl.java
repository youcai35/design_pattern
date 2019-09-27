package com.gyc.structural.proxy;

public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;
    @Override
    public int saveOrder(Order order) {
        //Spring会自己注入，此处就直接new了
        iOrderDao= new OrderDaoImpl();
        System.out.println("Service 层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
