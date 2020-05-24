package com.ibm.food.entities;
import java.sql.Blob;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



@Entity
public class Restaurants {
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
	String type;
	String location;
	String contact;
	int accessed;
	String available;
	String image;
	//@Lob
	//Blob image;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "restId", referencedColumnName = "id")

	//(   cascade=CascadeType.ALL)
	    
	List<Dish> dishes;

	public Restaurants() {
		super();
	
	}

	public Restaurants(int id, String name, String type, String location, String contact, int accessed, String available,
			String image, List<Dish> dishes) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.location = location;
		this.contact = contact;
		this.accessed = accessed;
		this.available = available;
		this.image = image;
		this.dishes = dishes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getAccessed() {
		return accessed;
	}

	public void setAccessed(int accessed) {
		this.accessed = accessed;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}

	@Override
	public String toString() {
		return "Restaurants [id=" + id + ", name=" + name + ", type=" + type + ", location=" + location + ", contact="
				+ contact + ", accessed=" + accessed + ", available=" + available + ", image=" + image + ", dishes="
				+ dishes + "]";
	}
	
	
	
}
