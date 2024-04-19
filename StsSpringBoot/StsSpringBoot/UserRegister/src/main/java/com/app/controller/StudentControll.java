package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.Model.Student;
import com.app.Repo.StudentRepo;

@RestController
public class StudentControll {

	@Autowired
	private StudentRepo studentRepo;

	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student) {
		return this.studentRepo.save(student);
	}

	@GetMapping("/student")
	public List<Student> getAllStudents() {
		return this.studentRepo.findAll();
	}

	@GetMapping("/student/{id}")
	public Optional<Student> getStudent(@PathVariable("id") int id) {
		return this.studentRepo.findById(id);
	}

	@DeleteMapping("/student{id}")
	public String deleteBook(@PathVariable("id") int id) {
		this.studentRepo.deleteById(id);
		return "Student id " + id + " is deleted";
	}

}