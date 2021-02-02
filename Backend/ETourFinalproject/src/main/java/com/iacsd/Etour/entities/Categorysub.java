package com.iacsd.Etour.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categorysubcategory")
public class Categorysub {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private  int catsubid;
	private String categoryid;
	private String categoryname;
	private String categoryimage;
	private String subcategoryid;
	@Override
	public String toString() {
		return "Categorysub [catsubid=" + catsubid + ", categoryid=" + categoryid + ", categoryname=" + categoryname
				+ ", categoryimage=" + categoryimage + ", subcategoryid=" + subcategoryid + ", flag=" + flag + "]";
	}
	private byte flag;
	public int getCatsubid() {
		return catsubid;
	}
	public void setCatsubid(int catsubid) {
		this.catsubid = catsubid;
	}
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getCategoryimage() {
		return categoryimage;
	}
	public void setCategoryimage(String categoryimage) {
		this.categoryimage = categoryimage;
	}
	public String getSubcategoryid() {
		return subcategoryid;
	}
	public void setSubcategoryid(String subcategoryid) {
		this.subcategoryid = subcategoryid;
	}
	public byte getFlag() {
		return flag;
	}
	public void setFlag(byte flag) {
		this.flag = flag;
	}
	

}
