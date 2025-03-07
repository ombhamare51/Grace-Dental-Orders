package com.gdl.Grace.Dental.Orders.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gdl.Grace.Dental.Orders.Entity.Doctor;
import com.gdl.Grace.Dental.Orders.Model.LoginRequest;
import com.gdl.Grace.Dental.Orders.Service.Doctor_Service;

@RestController
@CrossOrigin("http://localhost:4200/")

public class Doctor_Controller {

	@Autowired
	private Doctor_Service ds;

	@PostMapping("/signup-doctor")
	public String doctorSignup(@RequestBody Doctor de) {
		String msg = ds.doctorSignup(de);
		return msg;
	}

	@PostMapping("/doctor-login")
	public String doctorLogin(@RequestBody LoginRequest lr) {
		String msg = ds.doctorLogin(lr);
		return msg;
	}
}
