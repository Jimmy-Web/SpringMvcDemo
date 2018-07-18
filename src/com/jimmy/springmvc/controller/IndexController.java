package com.jimmy.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	/**
	 * 1. 使用 @RequestMapping 注解来映射请求的 URL 2. 返回值会通过视图解析器解析为实际的物理视图, 对于
	 * InternalResourceViewResolver视图解析器, 会做如下的解析: 通过 prefix + returnVal + 后缀
	 * 这样的方式得到实际的物理视图, 然会做转发操作
	 * 
	 * /WEB-INF/views/success.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/loginPage")
	public String login() {
		System.out.println("正在跳转到login.jsp...");
		return "login";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("正在跳转到hello.jsp...");
		return "hello";
	}

}
