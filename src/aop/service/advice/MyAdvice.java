package aop.service.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Repository;

/**
 * Created by zuoyao on 2018/7/23.
 * 这是我的自定义通知
 */

public class MyAdvice {
    public void before(){
        System.out.println("这是方法执行之前需要执行的方法");
    }
    public void after(){
        System.out.println("这是方法执行之后执行，出现也会执行");
    }
    public void afterReturn(){
        System.out.println("方法执行后，出现异常不会执行");
    }
    public Object around(ProceedingJoinPoint pjp){
        System.out.println("这里是环绕通知qian");
        Object proceed=null;
        try {
            proceed=pjp.proceed();//调用目标方法
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("这里是环绕通知后");
        return proceed;
    }
    public void afterException(){
        System.out.println("出现异常后执行");
    }


}
