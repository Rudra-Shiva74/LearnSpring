package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.model.Student;
import com.application.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/Student")
	public Student saveStudent(@RequestBody Student Student) {
		return this.studentService.saveStudent(Student);
	}

	@GetMapping("/Student/{id}")
	public Student getStudentbyId(@PathVariable("id") int id) {
		return this.studentService.getStudent(id);
	}

	@GetMapping("/Student")
	public List<Student> getAllStudents() {
		return this.studentService.getAllStudents();
	}

	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student Student) {
		return this.studentService.updateStudent(Student);
	}

	@DeleteMapping("/deleteStudent")
	public String deleteStudent(@PathVariable("id") int id) {
		return "Student Deleted with id : " + id;
	}
}
