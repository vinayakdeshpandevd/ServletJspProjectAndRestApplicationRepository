package org.rest.service;

import org.rest.model.Employee1;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService 
{
	
public int addEmployee(Employee1 emp,JdbcTemplate jdbc);
public Employee1 getEmployeeById(int id,JdbcTemplate jdbc);

}