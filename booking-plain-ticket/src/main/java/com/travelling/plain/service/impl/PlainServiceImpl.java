package com.travelling.plain.service.impl;

import com.travelling.plain.service.PlainService;
import com.travelling.plain.entity.Plain;
import com.travelling.plain.repository.PlainRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import java.util.List;

@Service
public class PlainServiceImpl implements PlainService {


	@Autowired
	private PlainRepository plainRepository;

	
	@Override
	public Optional<Plain> savePlain(Plain plain) {
		return Optional.of(plainRepository.save(plain));
	}

	@Override
	public List<Plain> getListOfPlain() {
		return plainRepository.findAll();
	}

	@Override
	public Optional<Plain> getPlainById(Long id) {
		return plainRepository.findById(id);
	}

	@Override
	public Optional<Plain> updatePlainById(Long id, Plain plain) {
		Plain oldPlain = plainRepository.findById(id).get();
		oldPlain.setName(plain.getName());
		plainRepository.save(oldPlain);
		return Optional.of(oldPlain);
	}

	@Override
	public void deletePlainById(Long id) {
		plainRepository.deleteById(id);
	}
}
