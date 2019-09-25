package com.gyc.structural;

/**
 * 描述：积分支付
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        System.out.println("支付"+pointsGift.getName()+"积分成功");
        return true;
    }
}
