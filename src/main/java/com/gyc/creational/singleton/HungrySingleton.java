package com.gyc.creational.singleton;

import java.io.Serializable;

/**
 * 描述 : 饿汉式单例模式
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton instance ;
    static {
        instance = new HungrySingleton();
    }
    private HungrySingleton(){
        if (instance!=null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public static HungrySingleton getInstance(){
        return instance;
    }

    public Object readResolve(){
        return instance;
    }

}
