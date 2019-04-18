package com.bjsxt.mapper;

import com.bjsxt.pojo.Users;

import java.util.List;

/**
 * @Auther: gao
 * @Date: 2019/4/17 17:17
 * @Description: com.bjsxt.mapper
 * @version:
 */

public interface UsersMapper {
    public void insertUser(Users user);
    public List<Users> selectUserAll();
}
