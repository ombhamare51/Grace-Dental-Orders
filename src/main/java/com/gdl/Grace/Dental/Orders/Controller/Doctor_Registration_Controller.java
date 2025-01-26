package com.gdl.Grace.Dental.Orders.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gdl.Grace.Dental.Orders.Entity.Doctor_Registration_Entity;
import com.gdl.Grace.Dental.Orders.Service.Doctor_Resistration_Service;

@RestController
public class Doctor_Registration_Controller {
	
	@Autowired
	Doctor_Resistration_Service service;

	@PostMapping("/doctor_register")
	public String InsertData(@RequestBody Doctor_Registration_Entity d) {
		String msg = service.InserData(d);
		return msg;

	}

}
