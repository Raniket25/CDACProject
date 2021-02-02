package com.iacsd.Etour.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.iacsd.Etour.entities.PriceDetail;
import com.iacsd.Etour.services.PriceDetailService;

@CrossOrigin("http://localhost:4200")
@RestController
public class PricedetailController {
	
	@Autowired
	private PriceDetailService service;
	
	@GetMapping("/pricedetail/{priceid}") 
	public PriceDetail getPrice(@PathVariable int priceid) {
		return service.getPriceDetail(priceid);
	}
	
	@GetMapping("/price")
	public List<PriceDetail> getpr() {
		return service.getAllPrices();
	}
}
