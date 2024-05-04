package com.personal.project.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.personal.project.dto.GoalDto;
import com.personal.project.mapper.GoalMapper;
import com.personal.project.model.Goal;
import com.personal.project.repository.GoalRepository;
import com.personal.project.service.GoalService;
import com.personal.project.exception.ResourceNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GoalServiceImpl implements GoalService{
	
	private GoalRepository goalRepository;
	
	@Override
	public GoalDto createGoal(GoalDto goalDto) {
		Goal goal = GoalMapper.mapToGoal(goalDto);
        Goal savedGoal = goalRepository.save(goal);
        return GoalMapper.mapToGoalDto(savedGoal);
	}

	@Override
	public GoalDto getGoalById(Long gid) {
		Goal goal = goalRepository.findById(gid)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Goal is not exists with given id : " + gid));

        return GoalMapper.mapToGoalDto(goal);
	}

	@Override
	public List<GoalDto> getAllGoals() {
		List<Goal> goals = goalRepository.findAll();
        return goals.stream().map((goal) -> GoalMapper.mapToGoalDto(goal))
                .collect(Collectors.toList());
	}

	@Override
	public GoalDto updateGoal(Long gid, GoalDto updatedGoal) {
		 Goal goal = goalRepository.findById(gid).orElseThrow(
	                () -> new ResourceNotFoundException("Goal is not exists with given id: " + gid)
	        );

	        goal.setGoalName(updatedGoal.getGoalName());
	        goal.setGoalDetails(updatedGoal.getGoalDetails());
	        goal.setDelete_status(updatedGoal.isDelete_status());

	        Goal updatedGoalObj = goalRepository.save(goal);

	        return GoalMapper.mapToGoalDto(updatedGoalObj);
	}

	@Override
	public void deleteGoal(Long gid) {
		Goal goal = goalRepository.findById(gid).orElseThrow(
                () -> new ResourceNotFoundException("Goal is not exists with given id: " + gid)
        );

        goalRepository.deleteById(gid);
	}

	public GoalServiceImpl(GoalRepository goalRepository) {
		super();
		this.goalRepository = goalRepository;
	}
	
	
	

}
