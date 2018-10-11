package com.dubbo.provider.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

import com.dubbo.entity.UserEntity;
import com.dubbo.service.DemoService;
import com.user.mapper.UserMapper;
import com.user.model.User;


@Service(interfaceClass = DemoService.class,version = "1.0.0")
@Component
public class DemoServiceImpl implements DemoService{
	
	@Resource
	private UserMapper userMapper;

	
	@Override
	public UserEntity sayHello(UserEntity user) {
		// TODO Auto-generated method stub
		user.setUsername("Hello " + user.getUsername());
		user.setPassword("123");
		return user;
	}

	@Override
	public UserEntity getUser() {
		User user = userMapper.selectByPrimaryKey(1);
		UserEntity userEntity = new UserEntity();
		userEntity.setId(user.getId());
		userEntity.setUsername(user.getUsername());
		userEntity.setPassword(user.getPassword());
		return userEntity;
	}
	
	
	

}
