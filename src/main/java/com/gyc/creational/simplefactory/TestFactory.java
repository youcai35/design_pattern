package com.gyc.creational.simplefactory;
import org.junit.Test;
public class TestFactory {

    @Test
    public void testByType(){
        VideoFactory factory = new VideoFactory();
        Video video = factory.getVideo("java");
        if (video==null)
            return;
        video.produce();
    }

    @Test
    public void testByClass(){
        VideoFactory factory = new VideoFactory();
        Video video = factory.getVideo(PythonVideo.class);
        if(video == null){
            return;
        }
        video.produce();
    }
}
