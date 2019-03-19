package org.rest.service;

import java.util.List;

import org.rest.dao.EmployeeDao1;
import org.rest.dao.EmployeeDaoImplementation;
import org.rest.model.Employee1;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Override
	public int addEmployee(Employee1 emp, JdbcTemplate jdbc) {
		// TODO Auto-generated method stub
		
		EmployeeDao1 employeedao = new EmployeeDaoImplementation();
		
		employeedao.addEmployee(emp,jdbc);
		
		
		return 0;
		 
	}

	@Override
	public Employee1 getEmployeeById(int id, JdbcTemplate jdbc) {
		// TODO Auto-generated method stub
EmployeeDao1 ed = new EmployeeDaoImplementation();
		Employee1 emp=new Employee1();
		emp=ed.getEmployeeById(id,jdbc);
		return emp;
	}

	}
