package com.gyc.creational.simplefactory;

/**
 * 描述： Java视频类
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
