package com.baizhi.cmfz.controller;

import com.baizhi.cmfz.entity.User;
import com.baizhi.cmfz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yx on 2018/7/4.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String UserLogin(String userName,String userPassword){
        User user = userService.queryUser(userName, userPassword);
        if(user!=null){
            return "success";
        }else{
            return "error";
        }
    }

    @RequestMapping("/regist")
    public String UserRegist(User user){
        userService.addUser(user);
        return "success";
    }
}
