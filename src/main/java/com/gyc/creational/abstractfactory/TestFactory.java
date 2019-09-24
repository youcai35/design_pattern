package com.gyc.creational.abstractfactory;

import org.junit.Test;

public class TestFactory {

    @Test
    public void test(){
        CourseFactory factory = new JavaCourseFactory();
        factory.getArticle().produce();
        factory.getVideo().produce();
    }
}
