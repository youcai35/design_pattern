package com.gyc.creational.abstractfactory;

public class PythonCourseFactory implements CourseFactory {
    @Override
    public Article getArticle() {
        return new PythonArticle();
    }

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
