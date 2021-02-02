package com.iacsd.Etour.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "pricedetail")
public class PriceDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int priceid;
	
	
	private int packageid;
	
	private int adults;
	private int childwobed;
	private int childwithbed;

	
	
	public int getPriceid() {
		return priceid;
	}

	public void setPriceid(int priceid) {
		this.priceid = priceid;
	}

	public int getPackageid() {
		return packageid;
	}

	@Override
	public String toString() {
		return "PriceDetail [priceid=" + priceid + ", packageid=" + packageid + ", adults=" + adults + ", childwobed="
				+ childwobed + ", childwithbed=" + childwithbed + "]";
	}

	public void setPackageid(int pkd) {
		this.packageid = packageid;
	}

	public int getAdults() {
		return adults;
	}

	public void setAdults(int adults) {
		this.adults = adults;
	}

	public int getChildwobed() {
		return childwobed;
	}

	public void setChildwobed(int childwobed) {
		this.childwobed = childwobed;
	}

	public int getChildwithbed() {
		return childwithbed;
	}

	public void setChildwithbed(int childwithbed) {
		this.childwithbed = childwithbed;
	}

}
