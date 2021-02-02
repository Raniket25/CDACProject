package com.iacsd.Etour.entities;

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
@Table(name="itinerary")
public class Itinerary {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int itineraryid;
	private String location;
	private int dayno;
	private String daywisedescription;
	
	 private int packageid;
	
	



	public int getItineraryid() {
		return itineraryid;
	}
	public void setItineraryid(int itineraryid) {
		this.itineraryid = itineraryid;
	}
	public int getPackageid() {
		return packageid;
	}
	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getDayNo() {
		return dayno;
	}
	public void setDayNo(int dayNo) {
		this.dayno = dayNo;
	}
	public String getDaywisedescription() {
		return daywisedescription;
	}
	public void setDaywisedescription(String daywisedescription) {
		this.daywisedescription = daywisedescription;
	}
		
}
