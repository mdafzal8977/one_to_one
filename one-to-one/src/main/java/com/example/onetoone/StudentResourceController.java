package com.example.onetoone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentResourceController {
	@Autowired
	private StudentRepository studentRepository;
	@GetMapping("/students")
	public List<Student> retrieveStudents(){
		return studentRepository.findAll();
	}
	@PostMapping("/students")
	public void createStudent(@RequestBody Student student) {
		studentRepository.save(student);
		
	}

}
