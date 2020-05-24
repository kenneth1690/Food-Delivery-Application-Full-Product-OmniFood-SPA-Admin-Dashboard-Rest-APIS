package com.ibm.food.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order_Receipt {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
     int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	String customer;
	String name;
	String location;
	int bill;
	int Rating;
	public Order_Receipt(int id, String customer, String name, String location, int bill, int rating) {
		super();
		this.id = id;
		this.customer = customer;
		this.name = name;
		this.location = location;
		this.bill = bill;
		Rating = rating;
	}
	public Order_Receipt() {
		super();
	
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getBill() {
		return bill;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		Rating = rating;
	}
	@Override
	public String toString() {
		return "Order_Receipt [id=" + id + ", customer=" + customer + ", name=" + name + ", location=" + location + ", bill="
				+ bill + ", Rating=" + Rating + "]";
	}
	
	
}
