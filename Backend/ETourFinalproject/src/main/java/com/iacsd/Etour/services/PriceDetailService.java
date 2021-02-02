package com.iacsd.Etour.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iacsd.Etour.DAO.PriceDetailRepo;
import com.iacsd.Etour.entities.PriceDetail;

@Service
public class PriceDetailService {
	@Autowired
	private PriceDetailRepo repo;
	
	public List<PriceDetail> getAllPrices() {
		return repo.findAll();
	}
	
	public PriceDetail getPriceDetail(int priceid) {
		return repo.findByPackageid(priceid);
	}
	
}
