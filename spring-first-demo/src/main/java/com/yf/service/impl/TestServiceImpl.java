package com.yf.service.impl;

import com.yf.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestServiceImpl
 * @Description TODO
 * @Author @yangfeng
 * @Date 2022/10/18 14:22
 * @Version 1.0
 */
@Service
public class TestServiceImpl implements TestService {
	@Override
	public void sayHello(String name) {
		System.out.println(name+" 正在上说你好");
	}
}
