package com.ibm.food.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdminRestaurant {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
     int id;
	
	String name;
	String location;
	String contact;
	int accessed;
	String owner;
	String available;
	int account;
	
	public AdminRestaurant() {
		super();
	}

	public AdminRestaurant(int id, String name, String location, String contact, int accessed, String owner,
			String available, int account) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.contact = contact;
		this.accessed = accessed;
		this.owner = owner;
		this.available = available;
		this.account = account;
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

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "AdminRestaurant [id=" + id + ", name=" + name + ", location=" + location + ", contact=" + contact
				+ ", accessed=" + accessed + ", owner=" + owner + ", available=" + available + ", account=" + account
				+ "]";
	}
	
	
	
}
