package com.iacsd.Etour.DAO;
import org.springframework.data.jpa.repository.JpaRepository;

import com.iacsd.Etour.entities.userRegistration;

public interface userDao extends JpaRepository< userRegistration, Long>
{
	public userRegistration save(userRegistration user);
	public userRegistration findByEmail(String email);
}
