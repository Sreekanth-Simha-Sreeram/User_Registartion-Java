package com.spring.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.spring.model.User;
import com.spring.services.AdminService;
import com.spring.services.UserService;



public class TestFunctional {
	
	public void testDeleteUser() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
		User user = new User();

		user.setUserId(1);
		user.setUsername("meghana");
		user.setPassword("meghana1234");
		user.setRepeatPassword("meghana1234");
		user.setEmail("meghana6116@gmail.com");
		user.setPhoto("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		AdminService adminservice=(AdminService) context.getBean("adminservice");
		boolean userdeleted =adminservice.deleteUser(user.getUserId());
		assertEquals("1",userdeleted,"should delete from db");
	}
	
	public void testGetUser() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Stock-application.xml");
		User user = new User();

		user.setUserId(1);
		user.setUsername("meghana");
		user.setPassword("meghana1234");
		user.setRepeatPassword("meghana1234");
		user.setEmail("meghana6116@gmail.com");
		user.setPhoto("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		AdminService adminservice=(AdminService) context.getBean("adminservice");
		User userfromdb =adminservice.getUser(user.getUserId());
		assertEquals(user,userfromdb);
	}

	@Test
	public void testUpdateContent()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("pixogram-application.xml");

		User user = new User();

		user.setUserId(1);
		user.setUsername("meghanaGowda");
		user.setPassword("meghana1234");
		user.setRepeatPassword("meghana1234");
		user.setEmail("meghana6116@gmail.com");
		user.setPhoto("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		
		AdminService adminservice=(AdminService) context.getBean("adminservice");
		boolean isUpdated =adminservice.updateUser(user);
		assertEquals("1",isUpdated,"should be updated");	
	}
	
	@Test
	public void testRegister()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("pixogram-application.xml");

		User user = new User();

		user.setUserId(1);
		user.setUsername("meghanaGowda");
		user.setPassword("meghana1234");
		user.setRepeatPassword("meghana1234");
		user.setEmail("meghana6116@gmail.com");
		user.setPhoto("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		
		UserService userservice=(UserService) context.getBean("userservice");
		userservice.register(user);
		boolean userfromdb =userservice.register(user);
		assertNotSame(user,userfromdb);
	}
	
	@Test
	public void testUserList()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("pixogram-application.xml");
		
		User user = new User();
		user.setUserId(1);
		user.setUsername("meghanaGowda");
		user.setPassword("meghana1234");
		user.setRepeatPassword("meghana1234");
		user.setEmail("meghana6116@gmail.com");
		user.setPhoto("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		
		
		AdminService adminservice=(AdminService) context.getBean("adminservice");
		 //List tasks=projectManagerService.viewTask(task);
		 //assertNotNull(tasks);
		List<User> Userfromdb = adminservice.userList();
		assertSame(user,Userfromdb);

	}

}
