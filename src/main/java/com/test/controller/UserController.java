package com.test.controller;

import com.test.pojo.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping("test")
    public List test(){

        List<User> users = userService.selectUser();
        return users;
    }

}
