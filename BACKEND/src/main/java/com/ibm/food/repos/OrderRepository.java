package com.ibm.food.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.food.entities.*;
public interface OrderRepository extends JpaRepository<Order_Receipt, Integer>{

}
