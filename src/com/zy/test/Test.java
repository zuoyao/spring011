package com.zy.test;

import com.zy.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zuoyao on 2018/5/30.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user =(User)applicationContext.getBean("user7");
        System.out.println(user);
        /*ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user =(User)applicationContext.getBean("user3");
        System.out.println(user);*/

    }
}
