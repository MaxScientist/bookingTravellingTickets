package com.travelling.train.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.travelling.train.entity.Train;


@Repository
public interface TrainRepository extends JpaRepository<Train, Long> {
}
