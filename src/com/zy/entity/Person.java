package com.zy.entity;

/**
 * Created by zuoyao on 2018/7/12.
 */
public class Person {
    private String name;
    private String age;

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
