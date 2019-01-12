package com.hexin.service;

import com.hexin.entity.User;

import java.util.List;

public interface UserService {

	List<User> findAll();

	Integer insertUser(User user);

	List<User> findUserById3(Integer id);

	Integer delUserById(Integer id);

	Integer updateUserById(User user);

	List<User> viewTest();

	User login(String username);
}
