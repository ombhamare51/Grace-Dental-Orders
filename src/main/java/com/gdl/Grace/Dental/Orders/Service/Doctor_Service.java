package com.gdl.Grace.Dental.Orders.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdl.Grace.Dental.Orders.DAO.Doctor_Dao;
import com.gdl.Grace.Dental.Orders.Entity.Doctor;
import com.gdl.Grace.Dental.Orders.Model.LoginRequest;

@Service
public class Doctor_Service {

	@Autowired
	private Doctor_Dao dd;

	public String doctorSignup(Doctor de) {
		if (de.getPassword().equals(de.getConfirm_password())) {
			return dd.doctorSignup(de);
		} else {
			return "Password and Confirm Password Not Matched";
		}
	}

	public String doctorLogin(LoginRequest lr) {
		Doctor doctor = dd.checkDoctorLogin(lr);

		if (doctor != null) {
			if (doctor.getPassword().equals(lr.getPassword())) {
				return "Doctor Login Successful";
			} else {
				return "Incorrect password. Please try again.";
			}
		} else {
			return "No account found with the provided email.";
		}
	}
}
