package in.biswa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Welcomeconntroller {

//	public Welcomeconntroller() {
//		System.out.println("welcome controller : constructor");
//	}
	@GetMapping("/welcome")
	public ModelAndView getWelComeMsg() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg","Welcome to my world");
		mav.setViewName("index");
		return mav;
	}

}
