package com.example.onetoone;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	public class LaptopResourceController {
		@Autowired
		private LaptopRepository laptopRepository;
		@Autowired
		private StudentRepository studentRepository;
		@GetMapping("/laptops")
		public List<Laptop> retrieveAllLaptops(){
			return laptopRepository.findAll();
		}
		@PostMapping("/students/{id}/laptops")
		public void createStudent( @RequestBody Laptop laptop,@PathVariable int id) {
			Optional<Student> student=studentRepository.findById(id);
			laptop.setStudent(student.get());
			laptopRepository.save(laptop);
		}

	}


