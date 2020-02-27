package com.spring.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.UserDaoImpl;
import com.spring.model.User;

public class UserServiceImpl implements UserService {

	@Autowired
	UserDaoImpl userdaoimpl;
	
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean signIn(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean changePassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
