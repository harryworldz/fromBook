package com.atguigu.ssm.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.ssm.pojo.Employee;
import com.atguigu.ssm.service.HelloService;

@Controller
public class HelloHandler {
	@Autowired
	private HelloService service;
	
	@RequestMapping(value="/hello" )
	//传参数数据，处理调用   转发到显示页面
	public String handle(Integer id, Model model){
		Employee employee = service.hello(id);
		model.addAttribute("employee",employee);
		return "result";
	}
	

}
