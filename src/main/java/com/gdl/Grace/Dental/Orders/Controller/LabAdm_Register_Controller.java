package com.gdl.Grace.Dental.Orders.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gdl.Grace.Dental.Orders.Entity.LabAdm_Register_Entity;
import com.gdl.Grace.Dental.Orders.Service.LabAdm_Register_Service;

@RestController
public class LabAdm_Register_Controller {

	@Autowired
	private LabAdm_Register_Service lrs;

	@PostMapping("/admin_register")
	public String InsertData(@RequestBody LabAdm_Register_Entity lre) {
		String msg = lrs.Lab_signup(lre);
		return msg;
	}
}
