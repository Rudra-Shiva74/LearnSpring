package com.theme.model;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class ThymleafUser {
	@NotBlank(message = "User name Can not be null")
	@Size(min = 3, max = 12, message = "User name must be between 3 - 12 char!")
	private String name;
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email!")
	private String email;
	@AssertTrue
	private boolean agree;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAgree() {
		return agree;
	}

	public void setAgree(boolean agree) {
		this.agree = agree;
	}

	@Override
	public String toString() {
		return "ThymleafUser [name=" + name + ", email=" + email + "]";
	}

}
