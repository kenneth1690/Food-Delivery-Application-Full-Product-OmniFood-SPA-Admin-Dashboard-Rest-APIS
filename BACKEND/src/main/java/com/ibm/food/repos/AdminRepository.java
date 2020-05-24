package com.ibm.food.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.food.entities.*;
public interface AdminRepository extends JpaRepository<AdminRestaurant, Integer> {
AdminRestaurant findById(int id);
}
