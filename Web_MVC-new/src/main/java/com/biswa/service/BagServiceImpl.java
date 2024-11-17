package com.biswa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biswa.entity.Bag;
import com.biswa.repo.BagRepo;

@Service
public class BagServiceImpl implements BagService {

	@Autowired
	private BagRepo bagRepo;

	@Override
	public List<Bag> getAllBags() {
		return bagRepo.findAll();
	}
}
