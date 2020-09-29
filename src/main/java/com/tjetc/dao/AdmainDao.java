package com.tjetc.dao;

import com.tjetc.domain.Admain;

import java.util.List;

public interface AdmainDao {
    List<Admain> findAllUser();
    int  addUser(Admain admin);
    int  delUser(int id);
    int  update(Admain admin);
}
