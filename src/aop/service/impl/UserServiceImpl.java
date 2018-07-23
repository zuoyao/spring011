package aop.service.impl;

import aop.service.UserService;
import org.springframework.stereotype.Repository;

/**
 * Created by zuoyao on 2018/7/23.
 * 这是需要加通知的连接点或切入点
 */

public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        System.out.println("保存");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }

    @Override
    public void update() {
        System.out.println("跟新");
    }

    @Override
    public void find() {
        System.out.println("查找");
    }
}
