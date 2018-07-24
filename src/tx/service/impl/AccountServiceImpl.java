package tx.service.impl;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;
import tx.dao.AccountDao;
import tx.service.AccountService;

import java.math.BigDecimal;

/**
 * Created by zuoyao on 2018/7/24.
 */
//aop事务加在类上表示类中所以方法都有事务
@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = true)
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;
    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
    public void updateTranfer(Integer from, Integer to, BigDecimal money) {
        accountDao.decreaseMoney(from,money);
//        int i=1/0;
        accountDao.increaseMoney(to,money);
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

}
