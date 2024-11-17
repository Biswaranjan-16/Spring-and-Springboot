package com.biswa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bag {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bagId;
	private String bagName;
	private  Double  bagPrice;
	private String bagcolor;
	public int getBagId() {
		return bagId;
	}
	public void setBagId(int bagId) {
		this.bagId = bagId;
	}
	public String getBagName() {
		return bagName;
	}
	public void setBagName(String bagName) {
		this.bagName = bagName;
	}
	public Double getBagPrice() {
		return bagPrice;
	}
	public void setBagPrice(Double bagPrice) {
		this.bagPrice = bagPrice;
	}
	public String getBagcolor() {
		return bagcolor;
	}
	public void setBagcolor(String bagcolor) {
		this.bagcolor = bagcolor;
	}
	@Override
	public String toString() {
		return "Bag [bagId=" + bagId + ", bagName=" + bagName + ", bagPrice=" + bagPrice + ", bagcolor=" + bagcolor
				+ "]";
	}
	
	
	
	
}
