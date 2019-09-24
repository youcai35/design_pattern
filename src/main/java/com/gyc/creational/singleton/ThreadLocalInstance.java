package com.gyc.creational.singleton;

/**
 * 描述：此种方式不能保证全局唯一，但是能够保证线程单一
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> instance = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };
    private ThreadLocalInstance(){

    }
    public static ThreadLocalInstance getInstance(){
        return instance.get();
    }
}
