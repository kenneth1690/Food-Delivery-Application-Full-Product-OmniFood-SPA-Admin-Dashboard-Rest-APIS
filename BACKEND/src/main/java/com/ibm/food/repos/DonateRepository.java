package com.ibm.food.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.food.entities.*;

public interface DonateRepository extends JpaRepository<Donate, Integer> {

}
