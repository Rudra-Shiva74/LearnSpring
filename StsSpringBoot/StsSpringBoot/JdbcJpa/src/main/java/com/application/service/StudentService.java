package com.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.application.model.Student;
import com.application.repo.StudentRepo;

@Component
public class StudentService implements StudentInterface {

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student saveStudent(Student student) {
		try {
			return this.studentRepo.save(student);
		} catch (Exception e) {
			throw new RuntimeException("Student Allready Exist");
		}
	}

	@Override
	public Student updateStudent(Student student) {
		if (studentRepo.existsById(student.getSid())) {
			return this.studentRepo.saveAndFlush(student);
		}
		throw new RuntimeException("No Student Availabe to this id : " + student.getSid());
	}

	@Override
	public Student getStudent(int Studentid) {
		if (studentRepo.existsById(Studentid)) {
			Optional<Student> student = this.studentRepo.findById(Studentid);
			return student.get();
		}
		throw new RuntimeException("No Student Available to this id : " + Studentid);
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students = this.studentRepo.findAll();
		if (students.size() != 0) {
			return students;
		}
		throw new RuntimeException("No Student Record Available");
	}

	@Override
	public void deleteStudent(int Studentid) {
		if (studentRepo.existsById(Studentid)) {
			this.studentRepo.deleteById(Studentid);
		}
		throw new RuntimeException("No Student Available to this id : " + Studentid);
	}

}
