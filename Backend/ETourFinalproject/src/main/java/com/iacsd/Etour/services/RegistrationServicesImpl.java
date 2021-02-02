package com.iacsd.Etour.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iacsd.Etour.DAO.userDao;
import com.iacsd.Etour.entities.userRegistration;
@Service
public class RegistrationServicesImpl implements RegistrationService 
{

	@Autowired
	private userDao userdao;
	@Override
	public void addUser(userRegistration user) {
		// TODO Auto-generated method stub
		this.userdao.save(user);
		
	}
	@Override
	public userRegistration verifyUser(String user){
		// TODO Auto-generated method stub
		return this.userdao.findByEmail(user);
	}

}
