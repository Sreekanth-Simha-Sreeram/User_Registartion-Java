package com.spring.dao;

import com.spring.model.User;

public interface UserDao {
	boolean register(User user);
	boolean signUp(String username,String password);
	boolean changePassword(String password);
	User getUser(int userId);
}
