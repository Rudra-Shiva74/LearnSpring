package com.react.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.react.model.StudentInfo;
import com.react.repo.StudentRepo;

@Component
public class StudentServiceimp implements StudentService {

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public StudentInfo saveStudentInfo(StudentInfo studentInfo) {
		return this.studentRepo.save(studentInfo);

	}

	@Override
	public List<StudentInfo> getAllStudentInfos() {
		List<StudentInfo> studentInfos = this.studentRepo.findAll();
		return studentInfos;
	}

	@Override
	public StudentInfo getoneStudentInfo(int id) {
		Optional<StudentInfo> studentInfo = this.studentRepo.findById(id);
		return studentInfo.get();
	}

	@Override
	public void deleteOneStudent(int id) {
		this.studentRepo.deleteById(id);

	}

	@Override
	public void deleteAllStudent() {
		this.studentRepo.deleteAll();
	}

	@Override
	public StudentInfo getOneStudent(int id) {
		Optional<StudentInfo> st = this.studentRepo.findById(id);
		return st.get();

	}

	@Override
	public StudentInfo updateStudent(StudentInfo st) {
		return this.studentRepo.saveAndFlush(st);
	}

}
