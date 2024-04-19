package com.app.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SecondaryTable;

@Entity
@SecondaryTable(name = "library", pkJoinColumns = @PrimaryKeyJoinColumn(name = "stid"))
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String name;
	private int age;
	private char gender;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
