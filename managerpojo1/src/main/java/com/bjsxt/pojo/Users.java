package com.bjsxt.pojo;

/**
 * @Auther: gao
 * @Date: 2019/4/17 17:36
 * @Description: com.bjsxt.pojo
 * @version:
 */
public class Users {
    private Integer userId;
    private String username;
    private Integer userage;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public Integer getUserage() {
        return userage;
    }
}