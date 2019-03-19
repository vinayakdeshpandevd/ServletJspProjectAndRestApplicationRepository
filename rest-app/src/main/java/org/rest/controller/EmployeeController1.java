package org.rest.controller;

import org.rest.model.Employee1;
import org.rest.service.EmployeeService;
import org.rest.service.EmployeeServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController1 {
	
@Autowired
JdbcTemplate jdbc;

@RequestMapping(value = "/addEmployees" , method = RequestMethod.POST)
public Employee1 addEmployee(@RequestParam("id") int id , @RequestParam("firstname") String firstname , @RequestParam("lastname") String lastname , @RequestParam("dept") String dept , @RequestParam("mentor") String mentor , @RequestParam("sal") int sal)
{
	
	EmployeeService empservice = new EmployeeServiceImplementation();
	Employee1 emp = new Employee1();
	emp.setId(id);
	emp.setFirstname(firstname);
	emp.setLastname(lastname);
	emp.setDept(dept);
	emp.setMentor(mentor);
	emp.setSal(sal);
	
	
	empservice.addEmployee(emp,jdbc);
	
	return emp;
	
}
@RequestMapping(value = "/getEmployeeById" , method = RequestMethod.POST)
public Employee1 getEmployeeById(@RequestParam("id") int id) {
	EmployeeService empservice = new EmployeeServiceImplementation();
	Employee1 emp = new Employee1();
//	emp.setId(id);
	emp=empservice.getEmployeeById(id,jdbc);
	return emp;
	
}
}
