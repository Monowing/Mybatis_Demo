package com.example.mybatis.service;

import com.example.mybatis.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    List<User> findByName(String name);
}
