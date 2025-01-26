package com.gdl.Grace.Dental.Orders.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctor_Registration_Entity {

	@Id
	private String clinic_name;
	private String dr_name;
	private String email;
	private String password;
	private String confirm_password;

	public String getClinic_name() {
		return clinic_name;
	}

	public void setClinic_name(String clinic_name) {
		this.clinic_name = clinic_name;
	}

	public String getDr_name() {
		return dr_name;
	}

	public void setDr_name(String dr_name) {
		this.dr_name = dr_name;
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
		return "Doctor_Registration_Entity [clinic_name=" + clinic_name + ", dr_name=" + dr_name + ", email=" + email
				+ ", password=" + password + ", confirm_password=" + confirm_password + "]";
	}

	public Doctor_Registration_Entity(String clinic_name, String dr_name, String email, String password,
			String confirm_password) {
		super();
		this.clinic_name = clinic_name;
		this.dr_name = dr_name;
		this.email = email;
		this.password = password;
		this.confirm_password = confirm_password;
	}

	public Doctor_Registration_Entity() {

	}

}
