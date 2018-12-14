package com.treeke.provider.serviceImpl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.treeke.common.HelloService;



@Service(interfaceClass = HelloService.class)
@Component
public class HelloServiceImpl implements HelloService{

	@Override
	public String hello() {
		System.out.println("------------------------------");
		return "Hello";
	}

}
