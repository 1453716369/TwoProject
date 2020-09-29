package com.tjetc.dao;

import com.tjetc.domain.User;

import java.util.List;

public interface UserDao {

    List<User> findAllUser();
    int  addUser(User user);
    int  delUser(String account);
    int  update(User user);
}
