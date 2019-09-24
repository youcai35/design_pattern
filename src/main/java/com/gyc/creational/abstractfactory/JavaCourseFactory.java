package com.gyc.creational.abstractfactory;

public class JavaCourseFactory implements CourseFactory {
    @Override
    public Article getArticle() {
        return new JavaArticle();
    }

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
