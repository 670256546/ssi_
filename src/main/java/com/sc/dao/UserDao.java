package com.sc.dao;

import com.sc.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2018/7/9 17:03
 * @Description:
 */
@Repository
public interface UserDao {

    int addUser(User user);

    List<User> queryUserlist();

}
