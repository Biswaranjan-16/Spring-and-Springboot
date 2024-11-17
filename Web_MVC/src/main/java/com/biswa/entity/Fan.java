package com.biswa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fanId;
	private String fanName;
	private double fanPrice;
	private  String fanColor;
	public int getFanId() {
		return fanId;
	}
	public void setFanId(int fanId) {
		this.fanId = fanId;
	}
	public String getFanName() {
		return fanName;
	}
	public void setFanName(String fanName) {
		this.fanName = fanName;
	}
	public double getFanPrice() {
		return fanPrice;
	}
	public void setFanPrice(double fanPrice) {
		this.fanPrice = fanPrice;
	}
	public String getFanColor() {
		return fanColor;
	}
	public void setFanColor(String fanColor) {
		this.fanColor = fanColor;
	}
	@Override
	public String toString() {
		return "Fan [fanId=" + fanId + ", fanName=" + fanName + ", fanPrice=" + fanPrice + ", fanColor=" + fanColor
				+ "]";
	}
	
	
}
