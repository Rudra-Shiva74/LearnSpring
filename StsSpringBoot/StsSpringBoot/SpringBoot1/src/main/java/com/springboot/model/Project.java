//package com.springboot.model;
//
//import java.util.List;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToMany;
//
//@Entity
//public class Project {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	private String name;
//	private String description;
//
//	@ManyToMany(mappedBy = "projects", fetch = FetchType.LAZY)
//	private List<Employee> employees;
//
//	public List<Employee> getEmployees() {
//		return employees;
//	}
//
//	public void setEmployees(List<Employee> employees) {
//		this.employees = employees;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//}
