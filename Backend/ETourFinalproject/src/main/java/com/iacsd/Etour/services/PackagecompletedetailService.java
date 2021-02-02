package com.iacsd.Etour.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.iacsd.Etour.DAO.PackagecompletedetailRepo;
import com.iacsd.Etour.entities.Packagecompletedetail;

@Service
public class PackagecompletedetailService 
{
	@Autowired
	PackagecompletedetailRepo repo;

	public List<Packagecompletedetail> getPackDetails(Packagecompletedetail csc)
	{
		return repo.findAll();
	}
	
	public Packagecompletedetail getPackage(int packageid) {
		return repo.findByCatsubid(packageid);
	}

	
}
