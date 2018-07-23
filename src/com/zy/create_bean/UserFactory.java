package com.zy.create_bean;

import com.zy.entity.User;

/**
 * Created by zuoyao on 2018/7/12.
 */
public class UserFactory {
    public static User createUser(){
        System.out.println("静态工厂创建对象");
        return new User();
    }
    public User createUser2(){
        System.out.println("通过实例创建对象");
        return new User();
    }


}
