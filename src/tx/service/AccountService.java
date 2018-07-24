package tx.service;

import java.math.BigDecimal;

/**
 * Created by zuoyao on 2018/7/24.
 */
public interface AccountService {
    //转账方法
    void updateTranfer(Integer from, Integer to, BigDecimal money);
}
