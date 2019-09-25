package com.gyc.structural.adapter.classadapter;

/**
 * 描述：适配器
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
