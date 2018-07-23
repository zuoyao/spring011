package aop.test;

import aop.service.UserService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zuoyao on 2018/5/30.
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("aop/applicationContext3.xml");
        UserService userServiceImpl=(UserService) applicationContext.getBean("userServiceImpl");
        userServiceImpl.save();
        userServiceImpl.delete();
        userServiceImpl.find();
        userServiceImpl.update();
    }
}
