package com.atguigu.ssm.mapper;

import org.springframework.stereotype.Repository;

import com.atguigu.ssm.pojo.Employee;
@Repository
public interface EmployeeMapper {
	
	Employee getEmployeeById(Integer id);

}
