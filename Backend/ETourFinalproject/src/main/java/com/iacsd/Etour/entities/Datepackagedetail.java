package com.iacsd.Etour.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Datepackagedetail {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int datepackageid;
	private String startdate;
	private String enddate;
	
	
    
    private int packageid;
	
	

	public int getDatepackageid() {
		return datepackageid;
	}

	public void setDatepackageid(int datepackageid) {
		this.datepackageid = datepackageid;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public int getPackageid() {
		return packageid;
	}

	@Override
	public String toString() {
		return "Datepackagedetail [datepackageid=" + datepackageid + ", startdate=" + startdate + ", enddate=" + enddate
				+ ", packageid=" + packageid + "]";
	}

	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}
	
}
