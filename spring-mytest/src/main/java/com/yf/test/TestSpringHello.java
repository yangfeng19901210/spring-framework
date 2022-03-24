package com.yf.test;

import com.yf.config.JavaConfig;
import com.yf.pojo.User;
import com.yf.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yangfeng
 * @version 1.0
 * @date 2022-03-24 10:58
 */
public class TestSpringHello {

	public static void main(String[] args) {
		System.out.println("hah");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				JavaConfig.class);
		User user = (User)context.getBean("user");
		System.out.println(user.toString());
		StudentService studentService = context.getBean(StudentService.class);
		studentService.study();

	}

}
