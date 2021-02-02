package com.iacsd.Etour.entities;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "PassengerDetails")
public class PassengerEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  passengerid;
	private String passengername;
	private Date dOb;

	@Column(name="userPassportNo",columnDefinition="char(8)",unique=true)
    String userPassportNo;
	
	
	public int getPassengerid() {
		return passengerid;
	}
	public void setPassengerid(int passengerid) {
		this.passengerid = passengerid;
	}
	public String getPassengername() {
		return passengername;
	}
	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}
	public Date getdOb() {
		return dOb;
	}
	public void setdOb(Date dOb) {
		this.dOb = dOb;
	}
	public String getUserPassportNo() {
		return userPassportNo;
	}
	public void setUserPassportNo(String userPassportNo) {
		this.userPassportNo = userPassportNo;
	}
	
	@Override
	public String toString() {
		return "PassengerEntity [passengerid=" + passengerid + ", passengername=" + passengername + ", dOb=" + dOb
				+ ", userPassportNo=" + userPassportNo + ", email=" + email + ", packageid=" + packageid + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPackageid() {
		return packageid;
	}
	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}
	private String email;
	 private int packageid;
}