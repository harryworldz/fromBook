package com.atguigu.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.ssm.mapper.EmployeeMapper;
import com.atguigu.ssm.pojo.Employee;

@Service
public class HelloService {
	@Autowired
	EmployeeMapper epMapper;
	public Employee hello(Integer id) {
		System.out.println("Do service");
		return epMapper.getEmployeeById(id);
	}
}
