package com.sc.controller;

import com.sc.entity.User;
import com.sc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: hushuang
 * @Date: 2018/7/9 17:16
 * @Description:
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryUserList")
    public String queryUserList(Model model){
        List<User> users = userService.queryUserlist();
        System.out.println("=====usercontroller"+users);
        model.addAttribute("users",users);
        return "list";
    }

}
