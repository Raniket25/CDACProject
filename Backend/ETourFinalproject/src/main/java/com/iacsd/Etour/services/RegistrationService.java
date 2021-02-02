package com.iacsd.Etour.services;

import com.iacsd.Etour.entities.userRegistration;

public interface RegistrationService {
	public void addUser(userRegistration user);

	public userRegistration verifyUser(String user);

}
