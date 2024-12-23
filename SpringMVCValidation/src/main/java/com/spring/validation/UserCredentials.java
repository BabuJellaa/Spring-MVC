package com.spring.validation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class UserCredentials {
	@NotNull(message = "Username is required")
	@Size(min = 2,max = 30,message = "Arey Bosidike Username should be in range of 2 to 30 characters.")
	private String username;
	@NotNull(message = "Password is required")
	@Size(min = 4,message = "it should minimum of 4 letters..")
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
