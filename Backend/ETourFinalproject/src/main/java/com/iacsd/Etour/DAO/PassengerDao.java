package com.iacsd.Etour.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iacsd.Etour.entities.PassengerEntity;



public interface PassengerDao extends JpaRepository< PassengerEntity, Long>
{
	public PassengerEntity save(PassengerEntity passenger);
}
