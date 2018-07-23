package com.zy.fzzhuru;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zuoyao on 2018/7/12.
 */
public class TestComplex {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("com/zy/fzzhuru/applicationContext.xml");
        Complex complex =(Complex) ac.getBean("complex");
        System.out.println(complex);
    }
}
