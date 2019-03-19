package org.rest.dao;

import java.util.ArrayList;
import java.util.List;

import org.rest.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	public List<Student> getStudents()
	{
		List<Student> list = new ArrayList<>();
		Student s1 = new Student();
		s1.setId(1);
		s1.setFirstname("vinayak");
		s1.setLastname("deshpande");
		s1.setStream("CSE");
		list.add(s1);
		Student s2 = new Student();
		s2.setId(2);
		s2.setFirstname("srikanth");
		s2.setLastname("mergu");
		s2.setStream("CSE");
		list.add(s2);
		return list;
	}
	public List getBranch(){
		List l=new ArrayList();
		Student s1=new Student();
	 s1.setStream("CSE");
	 l.add(s1.getStream());
	 Student s2=new Student();
	 s2.setStream("ECE");
	 l.add(s2.getStream());
		return l;
		
		
		
	}
}
