package com.learn.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String fname;
	private String lname;
	private String language;
	@JsonBackReference
	@OneToOne(mappedBy = "author")
	private Books books;
	

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
