package com.gdl.Grace.Dental.Orders.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gdl.Grace.Dental.Orders.DAO.Doctors_Registration_dao;
import com.gdl.Grace.Dental.Orders.Entity.Doctor_Registration_Entity;

@Service
public class Doctor_Registration_Service {

	@Autowired
	private Doctors_Registration_dao dao;

	public String InserData(Doctor_Registration_Entity d) {

		if (d.getPassword().equals(d.getConfirm_password())) {
			return dao.InsertData(d);
		} else {
			return "Password and Confirm Password Not Matched";
		}
	}
}
