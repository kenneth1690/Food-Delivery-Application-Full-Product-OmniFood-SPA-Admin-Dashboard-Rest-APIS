package com.ibm.food.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.food.entities.*;
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

}
