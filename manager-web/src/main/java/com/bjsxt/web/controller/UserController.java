package com.bjsxt.web.controller;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: gao
 * @Date: 2019/4/18 14:43
 * @Description: com.bjsxt.web.controller
 * @version:
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private UserService userService;
    @RequestMapping("/addUser")
    public String addUser(Users users){
        userService.addUser(users);
        System.out.println("添加Users成功！");
        return "ok";
    }
}
