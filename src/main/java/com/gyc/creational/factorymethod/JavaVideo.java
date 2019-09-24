package com.gyc.creational.factorymethod;

/**
 * 描述： Java视频类
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
