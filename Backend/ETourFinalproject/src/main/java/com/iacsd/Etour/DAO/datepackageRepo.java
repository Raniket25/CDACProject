package com.iacsd.Etour.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iacsd.Etour.entities.Datepackagedetail;

public interface datepackageRepo extends JpaRepository<Datepackagedetail, Integer> {
	public Datepackagedetail findByPackageid(int packageid);
}
