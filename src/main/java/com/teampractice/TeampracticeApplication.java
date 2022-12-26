package com.teampractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.teampractice.model.User;
import com.teampractice.service.UserServiceImpl;

@SpringBootApplication
public class TeampracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TeampracticeApplication.class, args);
	
		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
		
		User u1 = new User();
		u1.setId(1);
		u1.setName("Ashwini");
		u1.setPassword("123");
		u1.setAge(27);
		
		bean.Saveuser(u1);
	
	}

}
