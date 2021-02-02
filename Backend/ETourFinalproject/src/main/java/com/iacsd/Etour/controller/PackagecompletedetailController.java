package com.iacsd.Etour.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.iacsd.Etour.entities.Packagecompletedetail;
import com.iacsd.Etour.services.PackagecompletedetailService;


@CrossOrigin("http://localhost:4200")
@RestController
public class PackagecompletedetailController 
{
	@Autowired
	PackagecompletedetailService ps;
	
	@GetMapping("/packcompdetails")
	public List<Packagecompletedetail> getAllPackDetails(Packagecompletedetail csc)
	{
		return ps.getPackDetails(csc);
	}
	
	@GetMapping("/packcompdetail/{packageid}")
	public Packagecompletedetail getPackage(@PathVariable int packageid) {
		return this.ps.getPackage(packageid);
	}

}
