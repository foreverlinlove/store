package com.lin.controller;

import com.lin.entity.UserPO;
import com.lin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * forever create on 19:22
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("userServer")
    private UserService userService;
    @RequestMapping(value = "/getUsers")
    public List<UserPO> getAllUser() throws Exception{
        List<UserPO> userList = userService.getUsers();
        return userList;
    }

}
