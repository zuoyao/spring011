package aop.service;

import org.springframework.stereotype.Repository;

/**
 * Created by zuoyao on 2018/7/23.
 */
@Repository
public interface UserService {
     void save();
     void delete();
     void update();
     void find();
}
