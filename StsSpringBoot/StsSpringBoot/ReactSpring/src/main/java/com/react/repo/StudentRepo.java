package com.react.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.react.model.StudentInfo;

@Repository
public interface StudentRepo extends JpaRepository<StudentInfo, Integer> {

}
