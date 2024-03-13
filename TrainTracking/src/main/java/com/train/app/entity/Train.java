package com.train.app.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "public",name = "train")
public class Train {
	
	@Id
	@Column
	int trainNumber;

	@Column
	String trainName;
	
	@Column 	 	 	 	
	List<String> trainStation;

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public List<String> getTrainStation() {
		return trainStation;
	}

	public void setTrainStation(List<String> trainStation) {
		this.trainStation = trainStation;
	}
	
	
	
}
