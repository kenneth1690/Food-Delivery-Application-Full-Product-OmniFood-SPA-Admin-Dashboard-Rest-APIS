package com.ibm.food.entities;

import java.sql.Blob;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Dish {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	String name;
	String dishName;
	
	
	//@Lob
	//Blob dishImage;
	 String dishImage;
	
	int cost;
	String suggestion;
	public Dish() {
		super();
		
	}
	public Dish(int id, String name, String dishName, String dishImage, int cost, String suggestion) {
		super();
		this.id = id;
		this.name = name;
		this.dishName = dishName;
		this.dishImage = dishImage;
		this.cost = cost;
		this.suggestion = suggestion;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public String getDishImage() {
		return dishImage;
	}
	public void setDishImage(String dishImage) {
		this.dishImage = dishImage;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", dishName=" + dishName + ", dishImage=" + dishImage + ", cost="
				+ cost + ", suggestion=" + suggestion + "]";
	}
	
	
}
