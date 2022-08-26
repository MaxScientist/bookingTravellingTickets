package com.travelling.train.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import com.travelling.train.entity.Train;
import com.travelling.train.service.TrainService;
import com.travelling.train.repository.TrainRepository;

@Service
public class TrainServiceImpl implements TrainService {

	@Autowired
	private TrainRepository trainRepository;

	
	@Override
	public Optional<Train> saveTrain(Train train) {
		return Optional.of(trainRepository.save(train));
	}

	@Override
	public List<Train> getTrainList() {
		return trainRepository.findAll();
	}

	@Override
	public Optional<Train> getTrainById(Long id){
		return trainRepository.findById(id);
	}

	@Override
	public Optional<Train> updateTrainById(Long id, Train train) {
		Train oldTrain = trainRepository.findById(id).get();
		oldTrain.setName(train.getName());
		return Optional.of(trainRepository.save(oldTrain));
	}

	@Override
	public void deleteTrainById(Long id) {
		trainRepository.deleteById(id);
	}
}
