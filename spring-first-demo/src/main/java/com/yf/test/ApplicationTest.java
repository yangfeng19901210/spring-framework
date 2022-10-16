package com.yf.test;

import com.yf.config.AppConfig;
import com.yf.service.TestService;
import com.yf.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		TestService testService = ac.getBean(TestService.class);
		UserService userService = ac.getBean(UserService.class);
		testService.sayHello();
		userService.getUser();
	}
}
