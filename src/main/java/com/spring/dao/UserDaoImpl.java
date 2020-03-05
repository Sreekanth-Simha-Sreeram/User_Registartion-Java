package com.spring.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.User;
@Component
public class UserDaoImpl implements UserDao {
	
	@Autowired
	SessionFactory sessionfactory;
	@Transactional
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean signUp(String username, String password) {
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
