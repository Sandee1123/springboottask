package com.task.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.main.model.Employees;
import com.task.main.repository.EmployeesRepository;
import com.task.main.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeesRepository employeesRepository;

	
	public void save(Employees emp) {
		employeesRepository.save(emp);
	}

	
	public Employees getByName(String name) {
		return employeesRepository.findByName(name);
	}

	
	public Employees getEmployeesBydeptNo(int deptNo) {
		// TODO Auto-generated method stub
		return employeesRepository.findByDeptNo(deptNo);
	}

}
