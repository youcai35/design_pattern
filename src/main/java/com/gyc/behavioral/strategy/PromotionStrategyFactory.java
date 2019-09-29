package com.gyc.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {
    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();
    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN,new FanXianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN,new LiJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN,new ManJianPromotionStrategy());
    }
    private static final PromotionStrategy NOT_PROMOTION = new EmptyPromotionStrategy();
    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NOT_PROMOTION : promotionStrategy;
    }
    private interface PromotionKey{
        String LIJIAN = "LIJIAN";
        String FANXIAN = "FANXIAN";
        String MANJIAN = "MANJIAN";
    }
}
