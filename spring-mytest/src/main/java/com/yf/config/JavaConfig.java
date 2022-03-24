package com.yf.config;

import com.yf.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangfeng
 * @version 1.0
 * @date 2022-03-24 10:56
 */
@Configuration
@ComponentScan("com.yf")
public class JavaConfig {
	@Bean
	public User user(){
		return new User("001","smart哥");
	}

}
