package com.ibm.food.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Events {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
     int id;
	
	String name;
	String coupon;
	String type;
	public Events() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Events(int id, String name, String coupon, String type) {
		super();
		this.id = id;
		this.name = name;
		this.coupon = coupon;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoupon() {
		return coupon;
	}
	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Events [id=" + id + ", name=" + name + ", coupon=" + coupon + ", type=" + type + "]";
	}
	
	
}
