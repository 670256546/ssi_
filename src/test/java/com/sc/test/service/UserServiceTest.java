package com.sc.test.service;

import com.sc.dao.UserDao;
import com.sc.entity.User;
import com.sc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2018/7/9 17:15
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testQueryUserlist(){

        List<User> users = userService.queryUserlist();
        System.out.println(users);

    }


}
