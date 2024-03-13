package com.train.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.train.app.entity.Train;
import com.train.app.service.TrainService;

@RestController
@RequestMapping("/api/v1/train")
public class TrainController {

	@Autowired
	private TrainService trainService;

	@PostMapping("/save")
	public ResponseEntity save(@RequestBody Train train) {
		try {

			return new ResponseEntity<>(trainService.save(train), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("Internal Error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/update/{trainnumber}")
	public ResponseEntity update(@PathVariable int trainnumber, @RequestBody Train train) {
		try {
			Optional<Train> updateTrain = trainService.getByTrainNumber(trainnumber);
			if (updateTrain.isPresent()) {
				Train trainUpdate = updateTrain.get();
				if (train.getTrainName() != null) {
					trainUpdate.setTrainName(train.getTrainName());
				}
				if (train.getTrainStation() != null) {
					trainUpdate.setTrainStation(train.getTrainStation());
				}
				trainService.save(trainUpdate);
				return new ResponseEntity<>("Updated Successfully", HttpStatus.OK);
			} else {
				return new ResponseEntity<>("Not Found with ID:" + trainnumber, HttpStatus.NOT_FOUND);
			}

		} catch (Exception e) {
			return new ResponseEntity<>("Internal Error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/delete/{trainNumber}")
	public ResponseEntity delete(@PathVariable int trainNumber) {
		Optional<Train> updateTrain = trainService.getByTrainNumber(trainNumber);
		if (updateTrain.isPresent()) {
			trainService.delete(trainNumber);
			return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
		}
		return new ResponseEntity<>("Not Found with ID:" + trainNumber, HttpStatus.NOT_FOUND);
	}

	@GetMapping("/get/{source},{destiny}")
	public ResponseEntity get(@PathVariable String source, @PathVariable String destiny) {

		Optional<List<Integer>> ops = trainService.getBySourceDestination(source, destiny);

		if (ops.isPresent()) {
			List<Integer> l = ops.get();
			if (l.size() > 0) {
				return new ResponseEntity<>(ops, HttpStatus.OK);
			}
		}

		return new ResponseEntity<>("No train Found", HttpStatus.NOT_FOUND);
	}

}
