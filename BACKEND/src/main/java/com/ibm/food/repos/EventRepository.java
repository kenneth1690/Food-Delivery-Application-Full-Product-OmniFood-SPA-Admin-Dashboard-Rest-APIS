package com.ibm.food.repos;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.food.entities.*;
public interface EventRepository extends JpaRepository<Events, Integer> {

	List<Events> findByName(String name);
	Events findById(int id);
}
