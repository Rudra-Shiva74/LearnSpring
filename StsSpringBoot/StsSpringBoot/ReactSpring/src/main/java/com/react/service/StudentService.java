package com.react.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.react.model.StudentInfo;

@Service
public interface StudentService {
	public StudentInfo saveStudentInfo(StudentInfo studentInfo);

	public List<StudentInfo> getAllStudentInfos();

	public StudentInfo getoneStudentInfo(int id);

	public void deleteOneStudent(int id);

	public StudentInfo getOneStudent(int id);

	public StudentInfo updateStudent(StudentInfo st);

	public void deleteAllStudent();
}
