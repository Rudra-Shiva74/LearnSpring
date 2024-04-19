package com.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String sallary;
	private String email;
	private String position;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSallary() {
		return sallary;
	}

	public void setSallary(String sallary) {
		this.sallary = sallary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Employee(int id, String name, String sallary, String email, String position) {
		super();
		this.id = id;
		this.name = name;
		this.sallary = sallary;
		this.email = email;
		this.position = position;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sallary=" + sallary + ", email=" + email + ", position="
				+ position + "]";
	}

//	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinTable(name = "emppro", joinColumns = {
//			@JoinColumn(name = "empid", referencedColumnName = "id") }, inverseJoinColumns = {
//					@JoinColumn(name = "proid", referencedColumnName = "id") })
//	private List<Project> projects;
//
//	public List<Project> getProjects() {
//		return projects;
//	}
//
//	public void setProjects(List<Project> projects) {
//		this.projects = projects;
//	}
}
