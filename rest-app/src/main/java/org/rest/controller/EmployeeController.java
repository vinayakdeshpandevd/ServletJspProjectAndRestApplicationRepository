package org.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.rest.dao.EmployeeDao;
import org.rest.dao.StudentDao;
import org.rest.model.Employee;
import org.rest.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeDao ed;

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public List<Employee> getAllEmployees() 
	{
		return ed.getEmployees();
	}
	@RequestMapping(value = "/dept", method = RequestMethod.GET)
	public List<Employee> getAllDepts() {
		return ed.getDepts();
	}
	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public Employee addEmployee(@RequestParam(value = "id") int id, @RequestParam(value = "firstname") String firstname,
			@RequestParam(value = "lastname") String lastname, @RequestParam(value = "dept") String dept,
			@RequestParam(value = "mentor") String mentor, @RequestParam(value = "sal") int sal) {
		Employee e = new Employee();
		e.setId(id);
		e.setFirstname(firstname);
		e.setLastname(lastname);
		e.setDept(dept);
		e.setMentor(mentor);
		e.setSal(sal);
		return e;

	}
	@RequestMapping(value = "/id", method = RequestMethod.POST)
	public List getName(@RequestParam(value = "id") int id) {
		List l=new ArrayList<>();
		Employee e1=new Employee();
		e1.setId(1);
		e1.setFirstname("srikanth");
		e1.setLastname("mergu");
		e1.setDept("java");
		e1.setMentor("koti reddy");
		e1.setSal(10000);
		l.add(e1);
		
		return l;
		
	}

}
