package com.ibm.food.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blog {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
     int id;
	
	String name;
	String comments;
	String recipe;
	
	
	public Blog() {
		super();
	}


	public Blog(int id, String name, String comments, String recipe) {
		super();
		this.id = id;
		this.name = name;
		this.comments = comments;
		this.recipe = recipe;
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


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public String getRecipe() {
		return recipe;
	}


	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}


	@Override
	public String toString() {
		return "Blog [id=" + id + ", name=" + name + ", comments=" + comments + ", recipe=" + recipe + "]";
	}
	
	
	
}
