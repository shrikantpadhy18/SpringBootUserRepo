package com.loginpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.loginpage.dao.UserRepository;
import com.loginpage.entities.User;

@SpringBootApplication
public class LoginpageApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(LoginpageApplication.class, args);//it will retern the context
		UserRepository userRepository=context.getBean(UserRepository.class);
		User user=new User();
		user.setName("shrikant");
		user.setPassword("123");
		User user1=userRepository.save(user);
		System.out.print(user1);
		
	}

}
