package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;


@SpringBootApplication
@EnableDubboConfiguration
@MapperScan("com.*.mapper") 
public class ServiceApplication {

	 public static void main(String[] args) {

	        SpringApplication.run(ServiceApplication.class, args);

	 }	
	 
	
	 
}
