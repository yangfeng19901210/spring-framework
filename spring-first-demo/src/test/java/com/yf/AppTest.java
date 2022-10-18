package com.yf;

import com.yf.config.AppConfig;
import com.yf.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName AppTest
 * @Description TODO
 * @Author @yangfeng
 * @Date 2022/10/18 14:23
 * @Version 1.0
 */
public class AppTest {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		TestService testService = ac.getBean(TestService.class);
		testService.sayHello("张三");

	}
}
