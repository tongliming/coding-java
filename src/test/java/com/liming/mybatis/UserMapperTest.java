package com.liming.mybatis;

import com.liming.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testMybatis() {
        List<User> users = userMapper.queryUserList();
        log.info("user number: {}", users.size());
    }
}
