 package com.iacsd.Etour.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iacsd.Etour.entities.userRegistration;
import com.iacsd.Etour.services.RegistrationService;

@CrossOrigin("http://localhost:4200")
@RestController
public class RegistrationController {
	
	@Autowired
	private RegistrationService userservice;
	@PostMapping("/registerUser")
	public void addUser(@RequestBody  userRegistration user)
	{
		this.userservice.addUser(user);
		System.out.println(user);
	}
	
	@GetMapping("/login/{id}")
	public userRegistration verifyUser(@PathVariable("id")  String user)
	{
		return this.userservice.verifyUser(user);
	}
}
