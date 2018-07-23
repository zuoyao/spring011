package anonation.test;


import anonation.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zuoyao on 2018/5/30.
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("anonation/applicationContext2.xml");
        User user =(User)applicationContext.getBean("user");
        System.out.println(user);
        applicationContext.close();

    }
}
