package com.yf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * @ClassName AppConfig
 * @Description 自定义模块配置类
 * @Configuration 这个注解的作用是告诉spring这是一个配置类
 * @ComponentScan 这个注解的作用是扫描带有@Component、@Repository、@Service、@Controller等注解的类，注册到spring容器中
 * @Author @yangfeng
 * @Date 2022/10/16 8:15
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.yf")
public class AppConfig {
}
