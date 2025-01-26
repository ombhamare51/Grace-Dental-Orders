package com.gdl.Grace.Dental.Orders.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gdl.Grace.Dental.Orders.Entity.LabAdmin;
import com.gdl.Grace.Dental.Orders.Model.LoginRequest;
import com.gdl.Grace.Dental.Orders.Service.LabAdm_Service;

@RestController
public class LabAdm_Controller {

	@Autowired
	private LabAdm_Service ls;

	@PostMapping("/admin/signup")
	public String adminSignup(@RequestBody LabAdmin le) {
		String msg = ls.adminSignup(le);
		return msg;
	}
	
	@PostMapping("/admin/login")
	public String adminLogin(@RequestBody LoginRequest lr) {
		return ls.adminLogin(lr);
	}
}
