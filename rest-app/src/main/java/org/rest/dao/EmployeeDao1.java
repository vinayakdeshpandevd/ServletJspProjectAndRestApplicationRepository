package org.rest.dao;

import org.rest.model.Employee1;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao1 {
	public void addEmployee(Employee1 emp, JdbcTemplate jdbc);
	public Employee1 getEmployeeById(int id,JdbcTemplate jdbc);

}
