package com.sn;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.sn.beans.User;
import com.sn.repos.UserDAO;


@SpringBootApplication
public class SocialNetworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SocialNetworkApplication.class, args);
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		addSomeUsers(ac);
		
		
		//UserDAO gd=(UserDAO)ac.getBean("userDAO");
		//List<User> glist=gd.findUserByUsername("Gibson");
		//System.out.println(glist);s
		//((AbstractApplicationContext) ac).close();
	}
	
	static void addSomeUsers(ApplicationContext ac) {
		User u1= new User ("Andres", "Aparicio", "andresap", "andresap", "a@ft.com", "ff");

	
	
		UserDAO gd=(UserDAO)ac.getBean("userDAO");
		gd.save(u1);

}
	

}
