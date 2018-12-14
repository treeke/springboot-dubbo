package com.treeke.consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.treeke.common.HelloService;

@RequestMapping("dubbo")
@RestController
public class HelloController {
	
	@Reference(interfaceClass = HelloService.class)
	private HelloService helloService;

	@RequestMapping("hello")
	public String hello() {
		return helloService.hello();
	}
}
