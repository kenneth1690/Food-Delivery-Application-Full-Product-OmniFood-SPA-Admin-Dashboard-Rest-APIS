package com.ibm.food.entities;
import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Donate {
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
	String location;
	String description;
	String contact;
	String email;
	String image;
//	@Lob
//	Blob image;

	public Donate() {
		super();
		
	}

	public Donate(int id, String name, String location, String description, String contact, String email,
			String image) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.description = description;
		this.contact = contact;
		this.email = email;
		this.image = image;
	}

	public String getHelper() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setHelper(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImage_logo() {
		return image;
	}

	public void setImage_logo(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Donate [id=" + id + ", name=" + name + ", location=" + location + ", description=" + description
				+ ", contact=" + contact + ", email=" + email + ", image=" + image + "]";
	}
	
	

}
