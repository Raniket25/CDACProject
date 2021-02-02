package com.iacsd.Etour.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.iacsd.Etour.entities.Itinerary;
import com.iacsd.Etour.services.ItineraryService;

@CrossOrigin("http://localhost:4200")
@RestController
public class ItineraryController {

	@Autowired
	private ItineraryService service;
	
	@GetMapping("/itinerary")
	public List<Itinerary> getItinerary() {
		return this.service.getItineraryAll();
	}

	@GetMapping("/itinerary/{packageid}")
	public List<Itinerary> getAllRelatedItinerary(@PathVariable int packageid){
		return this.service.getAllRelatedItinerary(packageid);
	}
}

