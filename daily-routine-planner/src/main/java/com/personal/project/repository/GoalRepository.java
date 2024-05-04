package com.personal.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.project.model.Goal;

@Repository
public interface GoalRepository extends JpaRepository<Goal, Long>{
	
}
