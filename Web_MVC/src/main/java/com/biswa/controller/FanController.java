package com.biswa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.biswa.entity.Fan;
import com.biswa.service.FanService;

@Controller
public class FanController {

	@Autowired
	public FanService fanservice ;

	@GetMapping("/fans")
	public ModelAndView getFans(){
		ModelAndView mav = new ModelAndView();
		List<Fan> allFans = fanservice.getAllFans();
		mav.addObject("fan", allFans);
		mav.setViewName("ViewFan");
		return mav;

	}
}
