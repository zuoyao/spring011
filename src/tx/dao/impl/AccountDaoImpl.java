package tx.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import tx.dao.AccountDao;

import java.math.BigDecimal;

/**
 * Created by zuoyao on 2018/7/24.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Override
    public void increaseMoney(Integer id, BigDecimal money) {

        super.getJdbcTemplate().update("UPDATE account set money=money+? WHERE id=?",money,id);
    }

    @Override
    public void decreaseMoney(Integer id, BigDecimal money) {
        super.getJdbcTemplate().update("UPDATE account set money=money-? WHERE id=?",money,id);
    }
}
