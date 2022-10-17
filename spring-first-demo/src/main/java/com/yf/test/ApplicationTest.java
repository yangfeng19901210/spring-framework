package com.yf.test;

import com.yf.config.AppConfig;
import com.yf.service.TestService;
import com.yf.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * @ClassName ApplicationTest
 * @Description spring 容器测试类
 * @Author @yangfeng
 * @Date 2022/10/15 21:43
 * @Version 1.0
 */
public class ApplicationTest {

	public static void main(String[] args) {
		//实例化spring容器
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		//获取注册到spring容器中的bean实例
		TestService testService = ac.getBean(TestService.class);
		UserService userService = ac.getBean(UserService.class);
		//执行方法
		testService.sayHello();
		userService.getUser();
	}
}
