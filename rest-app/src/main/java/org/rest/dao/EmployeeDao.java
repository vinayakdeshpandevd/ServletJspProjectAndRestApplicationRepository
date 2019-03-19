package org.rest.dao;

import java.util.ArrayList;
import java.util.List;

import org.rest.model.Employee;
import org.rest.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
public List<Employee> getEmployees(){
	List l=new ArrayList<>();
	Employee e1=new Employee();
	e1.setId(1);
	e1.setFirstname("srikanth");
	e1.setLastname("mergu");
	e1.setDept("java");
	e1.setMentor("koti reddy");
	e1.setSal(10000);
	l.add(e1);
	Employee e2=new Employee();
	e2.setId(2);
	e2.setFirstname("saran");
	e2.setLastname("donepudi");
	e2.setDept("java");
	e2.setMentor("swetha reddy");
	e2.setSal(12000);
	
	l.add(e2);
	Employee e3=new Employee();
	e3.setId(3);
	e3.setFirstname("jeevan");
	e3.setLastname("boyini");
	e3.setDept("java");
	e3.setMentor("teja");
	e3.setSal(10000);
	l.add(e3);
	Employee e4=new Employee();
	e4.setId(4);
	e4.setFirstname("vinayak");
	e4.setLastname("deshpande");
	e4.setDept("java");
	e2.setMentor("bala murali");
	e4.setSal(10000);
	l.add(e4);
	Employee e5=new Employee();
	e5.setId(5);
	e5.setFirstname("riyazur");
	e5.setLastname("rahmaan");
	e5.setDept("UI");
	e5.setMentor("chandresh");
	e5.setSal(10000);
	l.add(e5);
	return l;
	
}
public List getDepts(){
	List l=new ArrayList();
	Employee e1=new Employee();
 e1.setDept("CSE");
 l.add(e1.getDept());
 Employee e2=new Employee();
 e2.setDept("ECE");
 l.add(e2.getDept());
 Employee e3=new Employee();
 e3.setDept("CE");
 l.add(e3.getDept());
 Employee e4=new Employee();
 e4.setDept("ME");
 l.add(e4.getDept());
	return l;
	
	
	
}
}
