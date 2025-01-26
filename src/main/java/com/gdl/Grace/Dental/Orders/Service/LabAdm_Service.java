package com.gdl.Grace.Dental.Orders.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdl.Grace.Dental.Orders.DAO.LabAdm_Dao;
import com.gdl.Grace.Dental.Orders.Entity.LabAdmin;
import com.gdl.Grace.Dental.Orders.Model.LoginRequest;

@Service
public class LabAdm_Service {

	@Autowired
	private LabAdm_Dao ld;

	public String adminSignup(LabAdmin le) {
		if (le.getPassword().equals(le.getConfirm_password())) {
			return ld.AdminSignup(le);
		} else {
			return "Password and Confirm Password do not match!";
		}
	}

	public String adminLogin(LoginRequest lr) {
		LabAdmin admin = ld.AdminLogin(lr);

		if (admin != null) {
			if (admin.getPassword().equals(lr.getPassword())) {
				return "Admin Login Successful";
			} else {
				return "Incorrect password. Please try again.";
			}
		} else {
			return "No account found with the provided email.";
		}
	}
}
