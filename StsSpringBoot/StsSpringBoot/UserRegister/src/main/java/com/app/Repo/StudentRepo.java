package com.app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}