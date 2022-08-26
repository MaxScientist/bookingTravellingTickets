package com.travelling.plain.service;

import java.util.Optional;
import java.util.List;
import com.travelling.plain.entity.Plain;

public interface PlainService {

	Optional<Plain> savePlain(Plain plain);
	List<Plain> getListOfPlain();
	Optional<Plain> getPlainById(Long id);
	Optional<Plain> updatePlainById(Long id, Plain plain);
	void deletePlainById(Long id);
	
}
