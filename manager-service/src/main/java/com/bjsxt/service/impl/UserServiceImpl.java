package com.bjsxt.service.impl;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: gao
 * @Date: 2019/4/18 14:47
 * @Description: com.bjsxt.service.impl
 * @version:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private UsersMapper usersMapper;
    @Override
    public void addUser(Users users) {
        usersMapper.insertUser(users);
    }
}
