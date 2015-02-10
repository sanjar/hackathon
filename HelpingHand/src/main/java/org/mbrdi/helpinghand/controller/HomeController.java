package org.mbrdi.helpinghand.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.mbrdi.helpinghand.model.Donation;
import org.mbrdi.helpinghand.model.DonationType;
import org.mbrdi.helpinghand.model.Event;
import org.mbrdi.helpinghand.service.HelpingHandService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Resource(name ="helpingHandService")
	private HelpingHandService helpingHandService;
	private Donation selectedDonation;
	
	private List<Event> eventList = new ArrayList<Event>();
	private List<Donation> donationList = new ArrayList<Donation>();
	
	@RequestMapping(value = "home",method = RequestMethod.GET)
	public ModelAndView loadHomePage(){
		System.out.println("in controller");
		if(eventList.isEmpty()){
			eventList = helpingHandService.getEvenList();
		}
		ModelAndView view = new ModelAndView("home");
		view.addObject("eventList", eventList);
		return view;
	}
	@RequestMapping(value = "/donation",method = RequestMethod.GET)
	public ModelAndView loadDonationPage(HttpServletRequest request){
		
		ModelAndView view = new ModelAndView();
		if(DonationType.WISH.name().equalsIgnoreCase(request.getParameter("type"))){
			if(donationList.isEmpty()){
				donationList = helpingHandService.getDonationList();
			}
			List<Donation> wishTypeDonationList = getDonationListAccordingToType(DonationType.WISH);
			view.addObject("wishTypeDonationList", wishTypeDonationList);
			view.setViewName("wishTree");
		}
		System.out.println("in controller");
		return view;
	}
	private List<Donation> getDonationListAccordingToType(DonationType wish) {
		List<Donation> donationListAccordingToType= new ArrayList<Donation>();
		
		if(donationList.isEmpty()){
			donationList = helpingHandService.getDonationList();
		}
		for(Donation donation : donationList){
			if(donation.getType()!=null && DonationType.WISH.name().equalsIgnoreCase(donation.getType())){
			donationListAccordingToType.add(donation);
			}
		}
		return donationListAccordingToType;
	}
	@RequestMapping(value = "/submit",method = RequestMethod.POST)
	public ModelAndView submit(){
		System.out.println("in controller");
		ModelAndView view = new ModelAndView("donationSubmitted");
		return view;
	}
	
	@RequestMapping(value = "/submit",method = RequestMethod.GET)
	public ModelAndView getSubmitPage(HttpServletRequest request){
		
		ModelAndView view = new ModelAndView();
		if(DonationType.WISH.name().equalsIgnoreCase(request.getParameter("type")) && validateWishSubmit(request.getParameter("amount"),request.getParameter("name"))){
			view.addObject("amount", request.getParameter("amount"));
			view.addObject("wishName", request.getParameter("name"));
			view.addObject("selectedOrganization", selectedDonation.getOrganization());
			view.addObject("wishDetails",selectedDonation.getDescription());
			view.setViewName("submit");
		}
		else{
			view.setViewName("notCorrectSelection");
		}
		System.out.println("in controller");
		return view;
	}
	private boolean validateWishSubmit(String amount, String wishName) {
		List<Donation> wishTypeDonationList = getDonationListAccordingToType(DonationType.WISH);
		for(Donation donation : wishTypeDonationList){
			if(donation.getName().equalsIgnoreCase(wishName) && donation.getAmount().longValue()== Long.valueOf(amount)){
				selectedDonation = donation;
				return true;
			}
		}
		return false;
	}
}
