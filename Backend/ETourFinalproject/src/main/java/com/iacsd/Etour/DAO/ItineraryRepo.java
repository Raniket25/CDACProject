package com.iacsd.Etour.DAO;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iacsd.Etour.entities.Itinerary;



public interface ItineraryRepo extends JpaRepository<Itinerary,Integer >{
	
	public List<Itinerary> findByPackageid(int id);
}
