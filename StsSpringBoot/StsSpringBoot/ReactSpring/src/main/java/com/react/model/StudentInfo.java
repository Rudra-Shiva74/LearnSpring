package com.react.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stid;
	private String stname;
	private String stmobile;
	private String stAddress;
	private String stregno;
	private String stemail;

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public String getStmobile() {
		return stmobile;
	}

	public void setStmobile(String stmobile) {
		this.stmobile = stmobile;
	}

	public String getStAddress() {
		return stAddress;
	}

	public void setStAddress(String stAddress) {
		this.stAddress = stAddress;
	}

	public String getStregno() {
		return stregno;
	}

	public void setStregno(String stregno) {
		this.stregno = stregno;
	}

	public String getStemail() {
		return stemail;
	}

	public void setStemail(String stemail) {
		this.stemail = stemail;
	}

	@Override
	public String toString() {
		return "StudentInfo [stid=" + stid + ", stname=" + stname + ", stmobile=" + stmobile + ", stAddress="
				+ stAddress + ", stregno=" + stregno + ", stemail=" + stemail + "]";
	}

}
