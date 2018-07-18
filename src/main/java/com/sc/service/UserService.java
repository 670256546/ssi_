package com.sc.service;

import com.sc.dao.UserDao;
import com.sc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2018/7/9 17:13
 * @Description:
 */
@Service
public class UserService {


    @Autowired
    private UserDao userDao;


    @Transactional
    public List<User> queryUserlist(){
        return userDao.queryUserlist();
    }


}
