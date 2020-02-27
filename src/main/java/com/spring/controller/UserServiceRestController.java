package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.User;
import com.spring.services.UserServiceImpl;

@RestController
public class UserServiceRestController {

	@Autowired 
UserServiceImpl userserviceimpl;
	
	@PostMapping(value = "/register")
	public ResponseEntity<?> register(@RequestBody User user)
	{
		// TODO Auto-generated method stub
		return null;
}
	@PostMapping(value = "{password}/signIn/{username}")
	public ResponseEntity<?>signIn(@PathVariable("username")String username,@PathVariable("password")String password)
	{
		// TODO Auto-generated method stub
		return null;
		
	}
	@PostMapping(value = "/changePassword/{password}")
	public ResponseEntity<?> changePassword(@PathVariable("password")String password){
		// TODO Auto-generated method stub
		return null;
	}
}