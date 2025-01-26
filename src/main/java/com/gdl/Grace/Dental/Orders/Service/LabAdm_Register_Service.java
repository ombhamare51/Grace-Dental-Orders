package com.gdl.Grace.Dental.Orders.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdl.Grace.Dental.Orders.DAO.LabAdm_Register_Dao;
import com.gdl.Grace.Dental.Orders.Entity.LabAdm_Register_Entity;

@Service
public class LabAdm_Register_Service {

	@Autowired
	private LabAdm_Register_Dao lrd;

	public String Lab_signup(LabAdm_Register_Entity lre) {

		if (lre.getPassword().equals(lre.getConfirm_password())) {
			return lrd.Lab_signup(lre);
		} else {
			return "Password and Confirm Password do not match!";
		}

	}
}
