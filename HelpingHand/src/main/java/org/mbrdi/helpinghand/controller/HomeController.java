package org.mbrdi.helpinghand.controller;

import javax.servlet.http.HttpServletRequest;

import org.mbrdi.helpinghand.model.DonationType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "home")
	public ModelAndView loadHomePage(){
		System.out.println("in controller");
		ModelAndView view = new ModelAndView("home");
		return view;
	}
	@RequestMapping(value = "/donation",method = RequestMethod.GET)
	public ModelAndView loadDonationPage(HttpServletRequest request){
		
		ModelAndView view = new ModelAndView();
		if(DonationType.WISH.name().equalsIgnoreCase(request.getParameter("type"))){
			view.setViewName("wishTree");
		}
		System.out.println("in controller");
		return view;
	}
}
