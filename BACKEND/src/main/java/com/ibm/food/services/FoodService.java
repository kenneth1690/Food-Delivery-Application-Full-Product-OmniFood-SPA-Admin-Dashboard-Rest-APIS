package com.ibm.food.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.food.entities.AdminRestaurant;
import com.ibm.food.entities.Blog;
import com.ibm.food.entities.Donate;
import com.ibm.food.entities.Events;
import com.ibm.food.entities.Feedback;
import com.ibm.food.entities.Order_Receipt;
import com.ibm.food.entities.Restaurants;
import com.ibm.food.entities.User;
import com.ibm.food.repos.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class FoodService {

	@Autowired
	FoodRepository foodRepository;
	
	@Autowired
	DonateRepository donateRepository;
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	FeedbackRepository feedbackRepository;
	
	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	BlogRepository blogRepository;
	
	@Autowired
	EventRepository eventRepository;
	
	@Autowired
	UserRepository userRepository;
	
//POST AND GET METHODS OF RESTRAUNTS
	public Restaurants addRestaurant(Restaurants restaurant) {
		return foodRepository.save(restaurant);
		
	}
	public List<Restaurants> findAllRestaurant() {
		List<Restaurants> restaurants=foodRepository.findAll();
		System.out.println(restaurants);
		return restaurants;
	}
	public List<Restaurants> findRestaurantByName(String name) {
		return foodRepository.findByName(name);
	}
	public Restaurants findRestaurantById(int id) {
		return foodRepository.findById(id);
	}
	public List<Restaurants> findRestaurantByLocation(String location) {
		
		return foodRepository.findRestrauntByLocation(location);
	}
	//UPDATE METHODS FOR RESTRAUNT	
	@Transactional
	public void updateRestaurant(Restaurants updatedRestaurant) {
		Restaurants restaurant = foodRepository.findById(updatedRestaurant.getId());
		restaurant.setName(updatedRestaurant.getName());
		restaurant.setType(updatedRestaurant.getType());
		restaurant.setLocation(updatedRestaurant.getLocation());
		restaurant.setContact(updatedRestaurant.getContact());
		restaurant.setAccessed(updatedRestaurant.getAccessed());
		restaurant.setAvailable(updatedRestaurant.getAvailable());
		restaurant.setImage(updatedRestaurant.getImage());
		//restaurant.setDishes(updatedRestaurant.getDishes());
	}
	@Transactional
	public void updateAccessCount(Restaurants updatedRestaurant) {
		Restaurants restaurant = foodRepository.findById(updatedRestaurant.getId());
		restaurant.setAccessed(updatedRestaurant.getAccessed());
		//restaurant.setDishes(updatedRestaurant.getDishes());
	}
	
//DELETE METHODS FOR RESTRAUNT
	public void deleteRestaurantById(int id) {
		foodRepository.deleteById(id);
		
	}
	public void deleteRestaurantByName(String name) {
		foodRepository.deleteByName(name);
		
	}
//DELETE METHOD FOR DISHES
//POST AND GET METHODS FOR ORDER
	public Order_Receipt addOrder(Order_Receipt order) {
		return orderRepository.save(order);
		
	}
	public List<Order_Receipt> findAllOrder() {
		List<Order_Receipt> orders=orderRepository.findAll();
		System.out.println(orders);
		return orders;
	}
	//POST AND GET METHODS FOR DONATE
	public Donate addDonate(Donate donate) {
return donateRepository.save(donate);
		
	}
	public List<Donate> findAllDonate() {
	List<Donate> donation=donateRepository.findAll();
		System.out.println(donation);
		return donation;
	}
	
	//POST AND GET METHODS FOR Feedback
	public Feedback addFeedback(Feedback feedback) {
	return feedbackRepository.save(feedback);	
		
	}
	public List<Feedback> findAllFeedback() {
		List<Feedback> feedback=feedbackRepository.findAll();
		System.out.println(feedback);
		return feedback;
	}
	
	//POST AND GET METHODS FOR AdminRestaurant
	public AdminRestaurant addAdminRestaurant(AdminRestaurant admin) {
		return adminRepository.save(admin);
		
	}
	public List<AdminRestaurant> findAllAdminRestaurant() {
		List<AdminRestaurant> admin=adminRepository.findAll();
		System.out.println(admin);
		return admin;
	}
	
	//UPDATE METHODS FOR AdminRestaurant
	
	@Transactional
	public void updateAdminRestaurant(AdminRestaurant updatedadmin) {
		AdminRestaurant admin=adminRepository.findById(updatedadmin.getId());
		admin.setName(updatedadmin.getName());
		admin.setOwner(updatedadmin.getOwner());
		admin.setLocation(updatedadmin.getLocation());
		admin.setContact(updatedadmin.getContact());
		admin.setAccessed(updatedadmin.getAccessed());
		admin.setAvailable(updatedadmin.getAvailable());
		admin.setAccount(updatedadmin.getAccount());
	}
// DELETE  METHODS FOR AdminRestaurant
	public void deleteAdminRestaurantById(int id) {
		adminRepository.deleteById(id);
		
	}
	
	
	//POST AND GET METHODS FOR BLOG
	public Blog addBlog(Blog blog) {
		return blogRepository.save(blog);	
		
	}
	public List<Blog> findAllBlog() {
		List<Blog> blog=blogRepository.findAll();
		System.out.println(blog);
		return blog;
	}
	//POST AND GET METHODS FOR EVENTS
	public Events addEvent(Events event) {
		return eventRepository.save(event);
		
	}
	public List<Events> findAllEvent() {
		List<Events> event=eventRepository.findAll();
		System.out.println(event);
		return event;
	
	}
	public List<Events> findEventByName(String name) {
		return eventRepository.findByName(name);
	}
	
	//UPDATE METHODS FOR EVENTS
	
	@Transactional
	public void updateEvent(Events updatedevent) {
		Events et=eventRepository.findById(updatedevent.getId());
		et.setName(updatedevent.getName());
		et.setCoupon(updatedevent.getCoupon());
		et.setType(updatedevent.getType());
	}
	//DELETE METHODS FOR EVENTS
	public void deleteEventById(int id) {
		eventRepository.deleteById(id);
		
	}
//POST AND GET METHODS FOR USER
	public User addUser(User user) {
		return userRepository.save(user);
		
	}
	public List<User> findAllUser() {
		List<User> user=userRepository.findAll();
		System.out.println(user);
		return user;
	}

	
}
