package org.rest.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.rest.model.Employee1;
import org.springframework.jdbc.core.RowMapper;

public class Employee1RowMapper implements RowMapper<Employee1> {

	public Employee1 mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee1 e=new Employee1();
		
		e.setId(rs.getInt("id"));
		e.setFirstname(rs.getString("firstname"));
		e.setLastname(rs.getString("lastname"));
		e.setDept(rs.getString("dept"));
		e.setMentor(rs.getString("mentor"));
		e.setSal(rs.getInt("sal"));
		return e;
	}

}
