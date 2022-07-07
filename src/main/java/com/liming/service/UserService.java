package com.liming.service;

import com.liming.entity.User;
import com.liming.mybatis.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

//    @Transactional
    public List<User> getAllUsers() {
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
