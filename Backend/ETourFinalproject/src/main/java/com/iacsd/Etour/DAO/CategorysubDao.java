package com.iacsd.Etour.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.iacsd.Etour.entities.Categorysub;

public interface CategorysubDao extends JpaRepository<Categorysub, Integer> {
	
	@Query("from Categorysub cs where cs.subcategoryid is null")
	public List<Categorysub> catsubsave();
	
	@Query("from Categorysub cs where cs.subcategoryid = :catName")
	public List<Categorysub> findByCatName(String catName);

}