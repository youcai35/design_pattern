package com.gyc.structural.adapter.objectadapter;

/**
 * 描述：适配器
 */
public class Adapter implements Target {
    Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
