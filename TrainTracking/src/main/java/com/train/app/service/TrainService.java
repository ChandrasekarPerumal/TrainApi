package com.train.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.train.app.dao.TrainDao;
import com.train.app.entity.Train;

@Service
public class TrainService {
	
	@Autowired
	private TrainDao trainDao;
	
	public Train save(Train train) {
		return trainDao.save(train);
	}
	
	public Optional<Train> getByTrainNumber(int trainNo) {
		return trainDao.getTrain(trainNo);
	}

	
	public void delete(int trainNo) {
		 trainDao.deleteById(trainNo);
	}
	
	public Optional<List<Integer>> getBySourceDestination(String source, String destiny) {
		List<Train> tList= trainDao.findAll();
		
		List<Integer> trainNum= new ArrayList<Integer>();
		
		
		for(Train t : tList ) {
			List<String> s =t.getTrainStation();
			if(s.contains(source) && s.contains(destiny)){
				trainNum.add(t.getTrainNumber());
			}
		}
		return Optional.of(trainNum);
	}
}
