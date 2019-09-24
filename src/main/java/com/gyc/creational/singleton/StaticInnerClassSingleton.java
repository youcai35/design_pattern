package com.gyc.creational.singleton;

/**
 * 静态内部类实现单例模式
 */
public class StaticInnerClassSingleton {
    private static class InnerClass{
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.instance;
    }

    private StaticInnerClassSingleton(){
        if (InnerClass.instance!=null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
}

/***
 *  单例-静态内部类
 *      -- 基于类初始化的延迟加载解决方案
 *
 *      线程0 ------>                                       1.分配对象的内存空间
 *                      Class对象的初始化锁---------->      2.设置instance指向内存空间
 *      线程1 ------>                                       3.初始化对象
 *
 *  JVM在类的初始化阶段，也就是class加载后，被线程使用之前都是类的初始化阶段，在这个阶段会执行类的初始化，在执行初始化的时候jvm会获取
 *  锁，这个锁可以同步多个线程对一个类的初始化。基于这个特性可以实现基于静态内部类，并且是线程安全的、延迟的初始化方案。
 *  非构造线程是不可以看到重排序的
 *  初始化一个类包括以下：
 *      首次发生一个类会被立即初始化(这里边的类时泛指包括接口)
 *          1.A类型实例被创建
 *          2.A类中声明的静态方法被调用
 *          3.A类中声明的成员变量被赋值
 *          4.A类中成名的成员被使用并且成员不是常量成员
 *          5.A类是顶级类会被立刻初始化
 *
 */
