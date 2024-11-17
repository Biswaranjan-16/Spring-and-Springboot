package com.biswa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.biswa.entity.Bag;
import com.biswa.service.BagService;

@Controller
public class BagController {

	@Autowired
	private BagService bagService;
	
	@GetMapping("/viewbag")
	public ModelAndView getBags() {
		ModelAndView mav=new ModelAndView();
		List<Bag> allBags=bagService.getAllBags();
		mav.addObject("Bag",allBags);
		mav.setViewName("ViewBag");
		return mav;
		
	}
}
