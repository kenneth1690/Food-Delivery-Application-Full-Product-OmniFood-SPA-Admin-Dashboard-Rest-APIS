package com.ibm.food.repos;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.food.entities.*;



public interface FoodRepository extends JpaRepository<Restaurants, Integer>{

	List<Restaurants> findByName(String name);
    Restaurants findById(int id);
	void deleteByName(String name);
	List<Restaurants> findRestrauntByLocation(String location);
}
