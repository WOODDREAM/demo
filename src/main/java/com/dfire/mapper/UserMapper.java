package com.dfire.mapper;

import com.dfire.bean.User;

/**
 * User:huangtao
 * Date:2015-07-24
 * description：
 */

public interface UserMapper {
    public User getUserByName(String userName);
    public User getUserList();
    public void addUser(User user);
    public void deleteByUserName(String userName);
    public void updateByUserID(int userID);
}
