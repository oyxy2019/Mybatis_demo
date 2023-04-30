package com.example.service;

import com.example.pojo.User;

import java.util.List;
import java.util.Map;


public interface UserService {
    List<User> userList();
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
}
