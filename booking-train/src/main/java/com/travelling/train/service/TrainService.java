package com.travelling.train.service;

import java.util.List;
import java.util.Optional;
import com.travelling.train.entity.Train;

public interface TrainService {

	Optional<Train> saveTrain(Train train);
	List<Train> getTrainList();
	Optional<Train> getTrainById(Long id);
	Optional<Train> updateTrainById(Long id, Train train);
	void deleteTrainById(Long id);
}
