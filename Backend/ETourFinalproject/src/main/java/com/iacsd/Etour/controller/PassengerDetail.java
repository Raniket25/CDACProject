package com.iacsd.Etour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iacsd.Etour.entities.PassengerEntity;
import com.iacsd.Etour.services.PassengerSevice;


@CrossOrigin("http://localhost:4200")
@RestController
public class PassengerDetail {

	@Autowired
	private PassengerSevice passangservice;
@PostMapping("/passuer")	
public List<PassengerEntity> addpassenger(@RequestBody  List<PassengerEntity> passenger)
{
	this.passangservice.addpassenger(passenger);
	System.out.println(passenger);
	//return passenger;
	return passenger;
	
}
}
