package com.personal.project.mapper;

import com.personal.project.dto.GoalDto;
import com.personal.project.model.Goal;

public class GoalMapper {
	
	public static GoalDto mapToGoalDto(Goal goal) {
		return new GoalDto(
				 goal.getGid(),
				 goal.getGoalName(),
				 goal.getGoalDetails(),
				 goal.isDelete_status()
				);
	}
	
	public static Goal mapToGoal(GoalDto goalDto){
        return new Goal(
                goalDto.getGid(),
                goalDto.getGoalName(),
                goalDto.getGoalDetails(),
                goalDto.isDelete_status()
        );
	}

}
