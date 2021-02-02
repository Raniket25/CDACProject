package com.iacsd.Etour.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iacsd.Etour.entities.Packagecompletedetail;

public interface PackagecompletedetailRepo extends JpaRepository<Packagecompletedetail, Integer>
{
	public Packagecompletedetail findByCatsubid(int packageid);
}
