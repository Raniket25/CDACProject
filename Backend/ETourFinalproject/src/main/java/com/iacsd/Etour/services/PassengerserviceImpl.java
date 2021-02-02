package com.iacsd.Etour.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iacsd.Etour.DAO.PassengerDao;
import com.iacsd.Etour.entities.PassengerEntity;


@Service
public class PassengerserviceImpl implements  PassengerSevice {

	@Autowired
	private PassengerDao passdao;
	@Override
	public List<PassengerEntity> addpassenger(List<PassengerEntity> passenger) {
		// TODO Auto-generated method stub
		return this.passdao.saveAll(passenger);
	}

}
