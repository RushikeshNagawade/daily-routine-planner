package com.personal.project.service;

import java.util.List;

import com.personal.project.dto.GoalDto;

public interface GoalService {
	GoalDto createGoal(GoalDto goalDto);
	
	GoalDto getGoalById(Long gid);
	
	List<GoalDto> getAllGoals();
	
	GoalDto updateGoal(Long gid, GoalDto updatedGoal);
	
	void deleteGoal(Long gid);
}
