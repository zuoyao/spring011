package anonation.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by zuoyao on 2018/5/30.
 */
@Repository("user")
@Scope(scopeName = "singleton")//singleton|prototype
public class User {
    @Value("tom")
    private String name;
    @Value("18")
    private Integer age;
    @Resource(name = "car")
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public User() {
    }
    public User(String name, Integer age){
        System.out.println("User(String name,Integer age)");
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
    @PostConstruct
    public void init(){
        System.out.println("这是初始化方法");
    }
    @PreDestroy
    public void destory(){
        System.out.println("这是销毁方法");
    }

}
