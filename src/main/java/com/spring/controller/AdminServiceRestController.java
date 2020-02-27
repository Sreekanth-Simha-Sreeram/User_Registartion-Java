package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.User;
import com.spring.services.AdminServiceImpl;



@RestController
public class AdminServiceRestController {

	@Autowired 
	AdminServiceImpl adminservice;
	
	@GetMapping("/userList")
	public ResponseEntity<?> userList()
	{
		// TODO Auto-generated method stub
	return null;
    }
	
	@DeleteMapping("/updateTask/{userId}")
	public ResponseEntity<?>deleteUser(@PathVariable ("userId")int userId)
	{
		// TODO Auto-generated method stub
		return null;
		
	}
	

	@PostMapping(value = "/createTask/{userId}")
	public ResponseEntity<?>makeAdmin(@PathVariable("userId") int userId)
	{
		// TODO Auto-generated method stub
		return null;
		
	}
	@GetMapping("/userList/{userId}")
	public ResponseEntity<?> getUser(@PathVariable("userId") int userId) {
		return null;
	}
	
	@PutMapping("/makeAdmin/{userId}")
	public ResponseEntity<?> updateUser(@RequestBody User user)
	{
		return null;
		
}
}