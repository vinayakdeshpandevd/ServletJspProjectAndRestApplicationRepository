package org.rest.controller;

import java.util.List;

import org.rest.dao.StudentDao;
import org.rest.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentDao studentdao;

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public List<Student> getAllStudents() {
		return studentdao.getStudents();
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public Student addStudent(@RequestParam(value="firstname") String firstname,
			@RequestParam(value = "lastname") String lastname, @RequestParam(value = "id") int id,
			@RequestParam(value = "stream") String stream) {
		Student s = new Student();
		s.setFirstname(firstname);
		s.setLastname(lastname);
		s.setId(id);
		s.setStream(stream);
		return s;
	}

	@RequestMapping(value = "/streams", method = RequestMethod.GET)
	public List<Student> getAllBranches() {
		return studentdao.getBranch();
	}
}
