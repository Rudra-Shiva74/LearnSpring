package com.react.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.react.model.StudentInfo;
import com.react.service.StudentService;

@RestController
@CrossOrigin
public class StudentController {
	@Autowired
	private StudentService studentService;

	@PostMapping("/student")
	public StudentInfo saveStudentInfo(@RequestBody StudentInfo studentInfo) {
		return studentService.saveStudentInfo(studentInfo);
	}

	@GetMapping("/student")
	public List<StudentInfo> getoneStudentInfo() {
		return this.studentService.getAllStudentInfos();
	}

	@DeleteMapping("/student/{id}")
	public void deleteoneUser(@PathVariable("id") int id) {

		this.studentService.deleteOneStudent(id);
	}

	@GetMapping("/student/{id}")
	public StudentInfo getoneStundet(@PathVariable("id") int id) {
		return this.studentService.getOneStudent(id);
	}

	@PutMapping("/student/{id}")
	public StudentInfo updateStundent(@PathVariable("id") int id, @RequestBody StudentInfo st) {
		System.out.println(st);
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setStid(id);
		studentInfo.setStname(st.getStname());
		studentInfo.setStmobile(st.getStmobile());
		studentInfo.setStAddress(st.getStAddress());
		studentInfo.setStemail(st.getStemail());
		studentInfo.setStregno(st.getStregno());
		System.out.println("str" + studentInfo);
		return this.studentService.updateStudent(studentInfo);

	}

	@DeleteMapping("/student")
	public void deleteAllStudent() {
		this.studentService.deleteAllStudent();
	}
}
