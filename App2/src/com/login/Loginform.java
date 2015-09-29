package com.login;

import org.hibernate.validator.Email;
import org.hibernate.validator.NotEmpty;
import org.hibernate.validator.Size;

public class Loginform {
	@NotEmpty(message="Email should not be empty")
	@Email
private String email;
	@NotEmpty
	@Size(max=15, min=5, message="password lenth shoud be 5 to 15 charecters")
private String password;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
