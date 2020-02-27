package com.spring.dao;

import java.util.List;

import com.spring.model.User;

public interface AdminDao {
	List <User> userList();
	boolean deleteUser(int userId);
	boolean makeAdmin(int userId);
	User getUser(int userId);
	boolean updatedUser(User user);
}
