package com.iacsd.Etour.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class userRegistration {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long customerId;
	String customerName;
	String email;

	
	String password;
    String customerAddress;
    String city;
    String state;
    long pincode;
    long mobile;
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "userRegistration [customerId=" + customerId + ", customerName=" + customerName + ", email=" + email
				+ ", password=" + password + ", customerAddress=" + customerAddress + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + ", mobile=" + mobile + "]";
	}
	
}	