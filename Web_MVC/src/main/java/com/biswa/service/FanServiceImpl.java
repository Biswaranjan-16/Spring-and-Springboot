package com.biswa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biswa.entity.Fan;
import com.biswa.repo.FanRepo;

@Service
public class FanServiceImpl implements FanService{
	@Autowired
	private FanRepo fanrepo;

	
	@Override
	public List<Fan> getAllFans() {
		return fanrepo.findAll();
	}

}
