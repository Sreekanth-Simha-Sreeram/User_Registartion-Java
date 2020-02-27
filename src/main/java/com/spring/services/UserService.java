package com.spring.services;

import com.spring.model.User;

public interface UserService {
	
	boolean register(User user);
	boolean signIn(String username,String password);
	boolean changePassword(String password);
	User getUser(int userId);
	

}
