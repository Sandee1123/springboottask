package com.task.main.service;

import java.util.List;

import com.task.main.model.Employees;


public interface EmployeeService {

	 void save(Employees emp);

	 Employees getEmployeesBydeptNo(int deptNo);

	 Employees getByName(String name);

}

