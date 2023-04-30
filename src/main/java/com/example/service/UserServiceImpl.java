package com.example.service;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> userList() {
        return userMapper.queryUserList();
    }

    @Override
    public int addUser(User user) {
        userMapper.addUser(new User(5, "阿毛", "456789"));
        return 200;
    }

    @Override
    public int updateUser(User user) {
        userMapper.updateUser(new User(5, "阿毛", "421319"));
        return 200;
    }

    @Override
    public int deleteUser(int id) {
        userMapper.deleteUser(5);
        return 200;
    }
}
