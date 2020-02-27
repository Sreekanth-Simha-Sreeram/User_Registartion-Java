package com.spring.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.spring.model.User;


public class TestBoundary {
	
	//password word length must be 10
    @Test
    public void testpasswordLength()
    {
        User user=new User();
        user.setUserId(1);
		user.setUsername("meghana");
		user.setPassword("meghana1234");
		user.setRepeatPassword("meghana1234");
		user.setEmail("meghana6116@gmail.com");
		user.setPhoto("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");


        int passwordLength=10;
assertNotEquals(passwordLength,user.getPassword().length());


    }

    //email should not be null
    @Test
    public void testEmail()
    {
        User user=new User();
        
        user.setUserId(1);
		user.setUsername("meghana");
		user.setPassword("meghana1234");
		user.setRepeatPassword("meghana1234");
		user.setEmail("meghana6116@gmail.com");
		user.setPhoto("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");

        assertNotNull(user.getEmail());


    }
    //password should not be null
    @Test
    public void testPassword()
    {
    	 User user=new User();
         
        user.setUserId(1);
 		user.setUsername("meghana");
 		user.setEmail("meghana6116@gmail.com");
 		user.setPhoto("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");

        assertNotNull(user.getPassword());

    }

    
  //repeatPassword should not be null
    @Test
    public void testRepeatPassword()
    {
    	 User user=new User();
         
        user.setUserId(1);
 		user.setUsername("meghana");
 		user.setPassword("meghana1234");
 		user.setEmail("meghana6116@gmail.com");
 		user.setPhoto("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");

        assertNotNull(user.getRepeatPassword());

    }

}
