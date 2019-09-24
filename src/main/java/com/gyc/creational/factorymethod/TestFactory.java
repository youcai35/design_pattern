package com.gyc.creational.factorymethod;
import org.junit.Test;

public class TestFactory {

    @Test
    public void test(){
        VideoFactory factory = new JavaVideoFactory();
        Video video = factory.getVideo();
        video.produce();
    }
}
