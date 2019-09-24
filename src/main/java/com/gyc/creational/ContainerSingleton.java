package com.gyc.creational;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述： 容器单例模式(此种模式需要考虑实际业务场景) 线程不安全
 */
public class ContainerSingleton {
    //不建议使用HashNap
    private static Map<String,Object> singletonMap = new HashMap<>();

    public static void putInstance(String key,Object instance){
        if (StringUtils.isNotBlank(key)&& instance!=null){
            if (!singletonMap.containsKey(key)){
                singletonMap.put(key,instance);
            }
        }
    }

    public static Object  getInstance(String key){
        return singletonMap.get(key);
    }

    public ContainerSingleton(){

    }
}
