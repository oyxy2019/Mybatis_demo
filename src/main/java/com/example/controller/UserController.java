package com.example.controller;

import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        System.out.println("################################");
        List<User> userList = userService.userList();
        return userList;
    }

    @GetMapping("/addUser")
    public String addUser(){
        userService.addUser(new User(5, "阿毛", "456789"));
        return "ok";
    }

    @GetMapping("/updateUser")
    public String updateUser(){
        userService.updateUser(new User(5, "阿毛", "421319"));
        return "ok";
    }

    @GetMapping("/deleteUser")
    public String deleteUser(){
        userService.deleteUser(5);
        return "ok";
    }


}
