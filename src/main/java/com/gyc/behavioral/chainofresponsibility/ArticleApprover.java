package com.gyc.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotBlank(course.getArticle())){
            System.out.println(course.getName()+"含有手记，批准");
            if (approver!=null){
                approver.deploy(course);
            }
        }else {
            System.out.println(course.getName()+"不含有手记，不批准，流程结束");
            return;
        }
    }
}
