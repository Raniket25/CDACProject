package com.iacsd.Etour.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iacsd.Etour.entities.PriceDetail;

public interface PriceDetailRepo extends JpaRepository<PriceDetail,Integer> {
	public PriceDetail findByPackageid(int id);
}
