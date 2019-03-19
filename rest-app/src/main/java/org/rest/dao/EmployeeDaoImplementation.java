package org.rest.dao;

import java.util.List;

import org.rest.model.Employee1;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDaoImplementation implements EmployeeDao1{

	

	@Override
	public void addEmployee(Employee1 emp , JdbcTemplate jdbc) {
		// TODO Auto-generated method stub
		
		
		String sql = "INSERT INTO employee (id,firstname,lastname,dept,mentor,sal)VALUES (?,?,?,?,?,?)";
	//	System.out.println("Hello World before"+jdbc);
		//System.out.println(emp.getDept());
		
		jdbc.update(sql, emp.getId() ,emp.getFirstname(),emp.getLastname(),emp.getDept(),emp.getMentor(),emp.getSal());

	
	}

	@Override
	public Employee1 getEmployeeById(int id, JdbcTemplate jdbc) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM employee WHERE id=?";
		Employee1 emp = new Employee1();
		emp = jdbc.queryForObject(sql,new Employee1RowMapper(),id);
		return emp;

	}
	

	
	

}
