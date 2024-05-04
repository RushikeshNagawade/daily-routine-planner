package com.personal.project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GoalDto {
	private Long gid;
	private String goalName;
	private String goalDetails;
	private boolean delete_status;
	public GoalDto(Long gid, String goalName, String goalDetails, boolean delete_status) {
		super();
		this.gid = gid;
		this.goalName = goalName;
		this.goalDetails = goalDetails;
		this.delete_status = delete_status;
	}
	public Long getGid() {
		return gid;
	}
	public void setGid(Long gid) {
		this.gid = gid;
	}
	public String getGoalName() {
		return goalName;
	}
	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}
	public String getGoalDetails() {
		return goalDetails;
	}
	public void setGoalDetails(String goalDetails) {
		this.goalDetails = goalDetails;
	}
	public boolean isDelete_status() {
		return delete_status;
	}
	public void setDelete_status(boolean delete_status) {
		this.delete_status = delete_status;
	}
	
	
}
