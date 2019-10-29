package com.task.main.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.task.main.model.Employees;

@Repository
public interface EmployeesRepository extends CrudRepository<Employees, Integer> {
	
	
	Employees findByDeptNo(Integer deptNo);
	
	 @Query("SELECT t FROM Employees t WHERE t.firstName =:firstName or t.lastName=:firstName")
	    public Employees findByName(String firstName);

	List<List<Employees>> save(List<List<Employees>> emp);
	
}
