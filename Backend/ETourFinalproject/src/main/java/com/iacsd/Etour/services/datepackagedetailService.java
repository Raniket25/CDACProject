package com.iacsd.Etour.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.iacsd.Etour.DAO.datepackageRepo;
import com.iacsd.Etour.entities.Datepackagedetail;

@Service
public class datepackagedetailService {

	@Autowired
	private datepackageRepo repo;
	
	
	public List<Datepackagedetail> getdatepackagedetails()
	{
		return repo.findAll();
	}
	 
	public Datepackagedetail getDatePackDetail(int datepackageid)
	{
		return repo.findByPackageid(datepackageid);
	}
}
