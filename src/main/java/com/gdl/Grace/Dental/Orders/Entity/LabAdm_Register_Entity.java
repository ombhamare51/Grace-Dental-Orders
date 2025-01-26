package com.gdl.Grace.Dental.Orders.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LabAdm_Register_Entity {

	@Id
	private String admin_name;
	private String email;
	private String password;
	private String confirm_password;

	public LabAdm_Register_Entity() {
		super();
	}
	

	public LabAdm_Register_Entity(String admin_name, String email, String password, String confirm_password) {
		super();
		this.admin_name = admin_name;
		this.email = email;
		this.password = password;
		this.confirm_password = confirm_password;
	}
	

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

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

	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

	@Override
	public String toString() {
		return "LabAdm_Register_Entity [admin_name=" + admin_name + ", email=" + email + ", password=" + password
				+ ", confirm_password=" + confirm_password + "]";
	}
}
