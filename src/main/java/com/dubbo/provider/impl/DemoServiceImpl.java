package com.dubbo.provider.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.entity.User;
import com.dubbo.service.DemoService;

@Service(interfaceClass = DemoService.class,version = "1.0.0")
@Component
public class DemoServiceImpl implements DemoService{

	@Override
	public User sayHello(User user) {
		// TODO Auto-generated method stub
		user.setName("Hello " + user.getName());
		user.setPassword("123");
		return user;
	}
	

}
