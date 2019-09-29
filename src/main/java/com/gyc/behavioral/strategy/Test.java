package com.gyc.behavioral.strategy;


import org.apache.commons.lang3.StringUtils;

public class Test {


    @org.junit.Test
    public void test1() {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();
    }


    @org.junit.Test
    public void test2() {
        PromotionActivity promotionActivity = null;
        String promotionKey = "LIJIAN";
        if (StringUtils.equals(promotionKey, "LIJIAN")) {
            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
        } else if (StringUtils.equals(promotionKey, "FANXIAN")) {
            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
        }//......
        promotionActivity.executePromotionStrategy();
    }
    @org.junit.Test
    public void test3() {
        String promotionKey = "MANJIANxxx";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }
}

