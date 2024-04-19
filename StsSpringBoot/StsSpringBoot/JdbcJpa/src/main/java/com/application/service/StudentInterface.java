package com.application.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.application.model.Student;

@Service
public interface StudentInterface {

	public Student saveStudent(Student Student);

	public Student updateStudent(Student Student);

	public Student getStudent(int Studentid);

	public List<Student> getAllStudents();

	public void deleteStudent(int Studentid);
}
