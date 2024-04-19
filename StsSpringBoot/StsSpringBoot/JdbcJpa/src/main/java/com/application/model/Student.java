package com.application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;

@Entity
@SecondaryTable(name = "student1", pkJoinColumns = @PrimaryKeyJoinColumn(name = "stid"))
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String fname;
	private String lname;

	@Column(table = "student1")
	private String address;
	@Column(table = "student1")
	private String phone;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getPhone() {
//		return phone;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}

//	@OneToMany(targetEntity = Books.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "student_id", referencedColumnName = "id")
//	private List<Books> books;
//
//	public List<Books> getBooks() {
//		return books;
//	}
//
//	public void setBooks(List<Books> books) {
//		this.books = books;
//	}

}
