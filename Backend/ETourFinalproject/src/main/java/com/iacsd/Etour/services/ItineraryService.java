package com.iacsd.Etour.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iacsd.Etour.DAO.ItineraryRepo;
import com.iacsd.Etour.entities.Itinerary;

@Service
public class ItineraryService {
	
	@Autowired
	private ItineraryRepo repo;

	public List<Itinerary> getItineraryAll()
	{
		return repo.findAll();
	}
	
	public List<Itinerary> getAllRelatedItinerary(int id){
		return this.repo.findByPackageid(id);
	}
	
	
}
