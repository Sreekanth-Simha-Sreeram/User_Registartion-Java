package com.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.AdminDao;
import com.spring.dao.AdminDaoImpl;
import com.spring.model.User;

public class AdminServiceImpl implements AdminService {
@Autowired
AdminDaoImpl admindaoimpl;


	public List<User> userList() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteUser(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean makeAdmin(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
