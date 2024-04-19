package com.learn.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	private String bname;
	private String btitle;
	@JsonManagedReference
	@OneToOne(cascade = CascadeType.ALL)
	private Author author;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}
