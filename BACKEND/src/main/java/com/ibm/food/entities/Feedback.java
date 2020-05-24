package com.ibm.food.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
     int id;
	
	String helper;
	String comments;
	int rating;
	public Feedback() {
		super();
	}
	public Feedback(int id, String helper, String comments, int rating) {
		super();
		this.id = id;
		this.helper = helper;
		this.comments = comments;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return helper;
	}
	public void setName(String helper) {
		this.helper = helper;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", helper=" + helper + ", comments=" + comments + ", rating=" + rating + "]";
	}
	

}
