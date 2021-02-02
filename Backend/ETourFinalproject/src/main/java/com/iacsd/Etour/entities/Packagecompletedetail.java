package com.iacsd.Etour.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Packagecompletedetail {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int packageid;
	private String tourname;
	private String tourimage;
	private int catsubid;
	
	private String description;
	
	
	public Packagecompletedetail() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getPackageid() {
		return packageid;
	}

	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}

	public String getTourname() {
		return tourname;
	}

	public void setTourname(String tourname) {
		this.tourname = tourname;
	}

	public String getTourimage() {
		return tourimage;
	}

	public void setTourimage(String tourimage) {
		this.tourimage = tourimage;
	}

	public int getCatsubid() {
		return catsubid;
	}

	public void setCatsubid(int catsubid) {
		this.catsubid = catsubid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
