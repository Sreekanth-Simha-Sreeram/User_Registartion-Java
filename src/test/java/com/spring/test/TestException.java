package com.spring.test;

import static org.junit.Assert.assertNotEquals;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.User;
import com.spring.services.AdminService;
import com.spring.services.UserService;



public class TestException {
	
	@Test
	public void testEmptyUserList() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("emart-application.xml");
		User use=new User();
		AdminService adminservice = (AdminService) context.getBean("adminservice");
		User user = adminservice.getUser(0);
		Assert.assertNotNull(user);
		
	}
	
	@Test
	public void testWrongRepeatPassword()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("emart-application.xml");
		User user=new User();
		UserService userservice = (UserService) context.getBean("userservice");
		 user.setUserId(1);
	 		user.setUsername("meghana");
	 		user.setPassword("meghana1234");
	 		user.setEmail("meghana6116@gmail.com");
	 		user.setRepeatPassword("james123");
	 		
	 		user.setPhoto("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
	 		assertNotEquals(user.getRepeatPassword(),user.getPassword());
	}

}
