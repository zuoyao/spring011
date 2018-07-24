package tx.dao;

import java.math.BigDecimal;

/**
 * Created by zuoyao on 2018/7/24.
 */
public interface AccountDao {
    //加钱
    void increaseMoney(Integer id, BigDecimal money);
    //减钱
    void decreaseMoney(Integer id,BigDecimal money);
}
