package com.spring.services;

import java.util.List;

import com.spring.model.User;

public interface AdminService {
	
	List <User> userList();
	boolean deleteUser(int userId);
	boolean makeAdmin(int userId);
	User getUser(int userId);
	boolean updateUser(User user);

}
