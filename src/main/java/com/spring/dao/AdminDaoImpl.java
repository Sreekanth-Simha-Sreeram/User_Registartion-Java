package com.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.User;
@Component
public class AdminDaoImpl implements AdminDao {

	
	@Autowired
	SessionFactory sessionfactory;
	@Transactional
	public List<User> userList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public boolean deleteUser(int userId) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean makeAdmin(int userId) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public boolean updatedUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
