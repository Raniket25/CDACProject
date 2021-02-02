package com.iacsd.Etour.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.iacsd.Etour.entities.Datepackagedetail;
import com.iacsd.Etour.entities.Packagecompletedetail;
import com.iacsd.Etour.services.datepackagedetailService;

@CrossOrigin("http://localhost:4200")
@RestController
public class datepackagedetailController {

	@Autowired
	private datepackagedetailService service;
	
	@GetMapping("/datepackdetails")
	public List<Datepackagedetail> getpackagedetail()
	{
		return this.service.getdatepackagedetails();
	}
	
	@GetMapping("/datepackdetail/{datepackageid}")
	public Datepackagedetail getPackDetail(@PathVariable int datepackageid)
	{
		return this.service.getDatePackDetail(datepackageid);
	}
	
}
