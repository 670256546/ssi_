package com.sc.test.dao;

import com.sc.dao.UserDao;
import com.sc.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2018/7/9 17:07
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserDaoTest {


    @Autowired
    private UserDao userDao;


    @Test
    public void testAddUser(){

        User user = new User();
        user.setName("李雷");

        int row = userDao.addUser(user);
        System.out.println(row);

    }

    @Test
    public void testQueryUserlist(){

        List<User> users = userDao.queryUserlist();
        System.out.println(users);

    }

}
