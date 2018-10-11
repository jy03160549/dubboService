package com.dubbo.service;

import com.dubbo.entity.UserEntity;

public interface DemoService {
	
	UserEntity sayHello(UserEntity user);
	
	UserEntity getUser();

}