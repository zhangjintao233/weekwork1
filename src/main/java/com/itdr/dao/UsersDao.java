package com.itdr.dao;

import com.itdr.pojo.Users;

public interface UsersDao {
    Users getUser(String username,String password);

    int addUser(String username,String password);

    int deleteUser(Integer id);

    int updateUser(Integer id ,String password);
}
