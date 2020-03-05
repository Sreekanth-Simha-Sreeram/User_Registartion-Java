package com.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.UserDao;


import com.spring.model.User;

@Component
@Service ("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userdao;
	
	@Transactional
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean signIn(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean changePassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
