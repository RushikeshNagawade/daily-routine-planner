package com.personal.project.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "goal")
public class Goal {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gid;

    @Column(name = "goal_name")
    private String goalName;

    @Column(name = "goal_details")
    private String goalDetails;

    @Column(name = "del_status")
    private boolean delete_status;
    
    
	public Goal() {
		super();
	}

	public Goal(Long gid, String goalName, String goalDetails, boolean delete_status) {
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