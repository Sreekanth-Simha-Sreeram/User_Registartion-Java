package com.spring.services;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.AdminDao;
import com.spring.dao.AdminDaoImpl;
import com.spring.model.User;

@Component
@Service ("AdminService")
public class AdminServiceImpl implements AdminService {

@Autowired
AdminDao admindao;

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
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
