package com.ibm.food.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.food.entities.*;
public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
