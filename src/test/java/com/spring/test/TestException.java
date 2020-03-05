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
	
	 @Test(expected = NullPointerException.class)
	    public void testEmptyUserException() 
	    {
	        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Spring-application.xml");
	           
	           User user=new User();

	           user.setUserId(1);
		 		user.setUsername("meghana");
		 		user.setPassword("meghana1234");
		 		user.setEmail("app@gmail.com");
		 		user.setRepeatPassword("james123");
	           UserService userservice = (UserService) context.getBean("UserService");
	           User userdata=userservice.getUser(user.getUserId());
	           //userservice.login(user.getUserName(), user.getUserPassword());
	           Assert.assertNull(userdata);
	           throw new NullPointerException();
	    }
	    
	
	@Test
	public void testWrongRepeatPassword()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Spring-application.xml");
		User user=new User();
		
		 user.setUserId(1);
	 		user.setUsername("meghana");
	 		user.setPassword("meghana1234");
	 		user.setEmail("app@gmail.com");
	 		user.setRepeatPassword("james123");
	 		
	 		user.setPhoto("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
	 		UserService userservice = (UserService) context.getBean("userservice");
	 		assertNotEquals(user.getRepeatPassword(),user.getPassword());
	}

	@Test
	public void testDeleteUser() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Spring-application.xml");
		
		
		User user=new User();
		
		 user.setUserId(1);
	 		user.setUsername("meghana");
	 		user.setPassword("meghana1234");
	 		user.setEmail("app@gmail.com");
	 		user.setRepeatPassword("james123");
			AdminService adminservice=(AdminService) context.getBean("adminService");
		boolean result = false;
		if(!adminservice.deleteUser(111))
			result = true;
		Assert.assertEquals(true, result);
		
		
	}
	
	@Test(expected = NullPointerException.class)
	public void testEmptyPasswordException() 
	{
	    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Spring-application.xml");
	  
	    User user=new User();
	    user.setUserId(1);
 		user.setUsername("meghana");
 		user.setPassword("meghana1234");
 		user.setEmail("app@gmail.com");
 		user.setRepeatPassword("james123");
	       Assert.assertEquals("1234",user.getPassword(),"password empty exception");
	       throw new NullPointerException();
	}
}
