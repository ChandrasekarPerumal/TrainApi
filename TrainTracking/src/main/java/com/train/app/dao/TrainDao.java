package com.train.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.train.app.entity.Train;

@Repository
public interface TrainDao extends JpaRepository<Train, Integer>{

	@Query("select t from Train t where t.trainNumber = :trainNumber")
	Optional<Train> getTrain(int trainNumber);
	
	
	
}
