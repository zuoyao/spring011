package tx.test;

import com.zy.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tx.service.AccountService;

import java.math.BigDecimal;

/**
 * Created by zuoyao on 2018/5/30.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("tx/applicationContext4.xml");
        AccountService accountService =(AccountService)applicationContext.getBean("accountService");
        BigDecimal bigDecimal=new BigDecimal(500);
        accountService.updateTranfer(1,2,bigDecimal);

    }
}
