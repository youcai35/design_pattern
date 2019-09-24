package com.gyc.creational;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 描述:  懒汉式单例模式
 */
public class LazySingleton {
    private static LazySingleton instance = null;
    private static boolean flag = true;

    private LazySingleton() {
        if (flag){
            flag = false;
        }else {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
//    private LazySingleton() {
//        if (instance!=null){
//            throw new RuntimeException("单例构造器禁止反射调用");
//        }
//    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class objecClass = LazySingleton.class;
        Constructor constructor = objecClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        LazySingleton o1 = LazySingleton.getInstance();
        Field flag = o1.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(o1,true);

        LazySingleton o2 = (LazySingleton) constructor.newInstance();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1==o2);
    }
}
