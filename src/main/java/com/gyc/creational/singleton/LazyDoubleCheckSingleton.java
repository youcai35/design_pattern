package com.gyc.creational.singleton;

/**
 * 描述：懒汉式双重检查单例模式
 *
 */
public class LazyDoubleCheckSingleton {
    private static volatile LazyDoubleCheckSingleton instance = null;

    private LazyDoubleCheckSingleton(){}
    public static LazyDoubleCheckSingleton getInstance() {
        if (instance ==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (instance ==null){
                    instance = new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置instance 指向刚分配的内存地址
                    //步骤2和3因为重排序的问题造成2和3的顺序颠倒，因此此处需要设法阻止重排序问题，使用关键子修饰volatile修饰实例变量
                }
            }
        }
        return instance;
    }
}
/**
 * 单线程初始化并访问对象步骤
 *  线程0
 *  1.分配对象的内存空间
 *  3.设置instance指向内存空间
 *  2.初始化对象
 *  4.初次访问对象
 *
 *  注意：2和3的位置颠倒是因为发生了重排序，发生重排序的目前是提高效率
 *
 * 多线程访问实例对象
 *      线程0                              线程1
 *   1.分配对象的内存空间
 *   3.设置instance指向内存空间
 *                                      判断instance是否为null
 *                                      线程1访问对象
 *   2.初始化对象
 *   4.线程0初次访问对象
 *
 *  注意：在多线程环境下由于2和3发生重排序，导致别的线程访问的时候会获取未完成初始化的实例对象造成异常，应该采取措施
 *      使得步骤2和3禁止发生重排序
 *
 */
