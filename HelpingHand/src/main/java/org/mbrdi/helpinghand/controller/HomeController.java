package org.mbrdi.helpinghand.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.mbrdi.helpinghand.model.BloodDonationDemand;
import org.mbrdi.helpinghand.model.Donation;
import org.mbrdi.helpinghand.model.DonationType;
import org.mbrdi.helpinghand.model.Event;
import org.mbrdi.helpinghand.model.EventType;
import org.mbrdi.helpinghand.model.Organization;
import org.mbrdi.helpinghand.model.User;
import org.mbrdi.helpinghand.pdf.PDFReciept;
import org.mbrdi.helpinghand.service.HelpingHandService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Controller
public class HomeController {
	
	@Resource(name ="helpingHandService")
	private HelpingHandService helpingHandService;
	private Donation selectedDonation;
	
	private List<Event> eventList = new ArrayList<Event>();
	private List<Donation> donationList = new ArrayList<Donation>();
	private List<User> userList = new ArrayList<User>();
	
	private Long amountSelected;
	
	private String donationName;
	
	private String donationType;
	
	
	@RequestMapping(value = "home",method = RequestMethod.GET)
	public ModelAndView loadHomePage(){
		System.out.println("in controller");
		if(eventList.isEmpty()){
			eventList = helpingHandService.getEvenList();
		}
		if(userList.isEmpty()){
			userList = helpingHandService.getUserList();
		}
		ModelAndView view = new ModelAndView("home");
		view.addObject("eventList", eventList);
		return view;
	}
	
	
	
	
	
	@RequestMapping(value = "/needBlood",method = RequestMethod.POST)
	public ModelAndView loadDonationPage(@ModelAttribute("needBlood")BloodDonationDemand needBlood){
		helpingHandService.saveNeedBloodRequest(needBlood);
		ModelAndView view = new ModelAndView("demandBlood", "command", new BloodDonationDemand());
		view.addObject("requestSuccess", "block");
		//sendExamResultViaMail("",needBlood);
		return view;
	}
	private void sendExamResultViaMail(String emailId, BloodDonationDemand needBlood) {
		String result=getHTMLResultContent(needBlood);
		sendMail(needBlood.getBloodGroupRequested(),result);
	}

	private void sendMail(String bloodGroup, String result) {
		final String username = "nasraysinfo@gmail.com";
		final String password = "test123test";
 
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		
		Session session = Session.getInstance(props,
				  new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				  });
		 
				try {
					List<String> emails=helpingHandService.getEmailListWithSpecificBloodGroup(bloodGroup);
					Message message = new MimeMessage(session);
					message.setFrom(new InternetAddress("demo@gmail.com"));
					List<InternetAddress> addresses = new ArrayList<InternetAddress>();
					/*for(String email : emails){
						addresses.add((InternetAddress.parse(email)));
					}*/
					message.setRecipients(Message.RecipientType.BCC,
						InternetAddress.parse(emails.toString()));
					message.setSubject("Demand For Blood Group: "+bloodGroup);
					
					
					message.setContent(result, "text/html");
		 
					Transport.send(message);
		 
				} catch (MessagingException e) {
					throw new RuntimeException(e);
				}
	}

	private String getHTMLResultContent(BloodDonationDemand needBlood) {
		String htmlContent = "<html>\n"+
		"<head>\n"+
		"</head>\n"+
		  "<body bgcolor='skyblue'>\n"+
		    "<div>Dear All,</div>\n"+
		    "<div>There is an Urgent Blood Requirement</div>\n"+
		    "<div style='height: 509px; display: block;' id='sectionSummaryDiv'>\n"+
		"<center>\n"+
		"<h3><b>Exam Summary</b></h3>\n"+
		"<table>\n"+
			
			"<tbody>\n"+
				"<tr>\n"+
					"<th>Blood Requested</th>\n"+
					"<th>Contact Name</th>\n"+
					"<th>User Name</th>\n"+
					"<th>Reason For Request</th>\n"+				
					
				"</tr>\n"+
				"<tr>\n"+
					"<td>"+needBlood.getBloodGroupRequested()+"</td>\n"+
					"<td>"+needBlood.getContactName()+"</td>\n"+
					"<td>"+needBlood.getUserName()+"</td>\n"+
					"<td>"+needBlood.getReasonForRequest()+"</td>\n"+
				"</tr>\n"+
			"</tbody>\n"+
		"</table>\n"+
		"</center>\n"+
		"</div>\n"+ 
		  "</body>\n"+
		"</html>\n";
		return htmlContent;
	}
	
	
	
	
	@RequestMapping(value = "/donation",method = RequestMethod.GET)
	public ModelAndView loadDonationPage(HttpServletRequest request){
		
		ModelAndView view = new ModelAndView();
		if(DonationType.WISH.name().equalsIgnoreCase(request.getParameter("type"))){
			if(donationList.isEmpty()){
				donationList = helpingHandService.getDonationList();
			}
			List<Donation> wishTypeDonationList = getDonationListAccordingToType(EventType.WISH.name());
			view.addObject("wishTypeDonationList", wishTypeDonationList);
			view.setViewName("wishTree");
		}
		if(EventType.PLEDGING_DONATION.name().equalsIgnoreCase(request.getParameter("type"))){
			if(donationList.isEmpty()){
				donationList = helpingHandService.getDonationList();
			}
			List<Donation> pledgingTypeDonationList = getDonationListAccordingToType(EventType.PLEDGING_DONATION.name());
			view.addObject("pledgingTypeDonationList", pledgingTypeDonationList);
			view.setViewName("pledgingDonation");
		}
		else if(EventType.NEED_OF_BLOOD.name().equalsIgnoreCase(request.getParameter("type"))){
			view = new ModelAndView("demandBlood", "command", new BloodDonationDemand());
		}
		System.out.println("in controller");
		view.addObject("requestSuccess", "none");
		return view;
	}
	private List<Donation> getDonationListAccordingToType(String wish) {
		List<Donation> donationListAccordingToType= new ArrayList<Donation>();
		
		if(donationList.isEmpty()){
			donationList = helpingHandService.getDonationList();
		}
		for(Donation donation : donationList){
			if(donation.getType()!=null && wish.equalsIgnoreCase(donation.getType())){
			donationListAccordingToType.add(donation);
			}
		}
		return donationListAccordingToType;
	}
	@RequestMapping(value = "/submit",method = RequestMethod.POST)
	public ModelAndView submit(HttpServletRequest request){
		System.out.println("in controller");
		ModelAndView view = new ModelAndView("donationSubmitted");
		User user = getUser(request.getParameter("userName"));
		if(user == null || null==request.getParameter("password")|| request.getParameter("password").trim().equals("") || !user.getUserName().equals(request.getParameter("password"))){
			view = new ModelAndView("redirect:" + "submit?type=WISH&amount="+String.valueOf(amountSelected).trim()+"&name="+donationName);
	
			view.addObject("isCorrectCredential", "block");
			//view.setViewName("submit");
			return view;
		}
		request.getSession().setAttribute("fullName", user.getUserFullName());
		request.getSession().setAttribute("amountSelected", amountSelected);
		request.getSession().setAttribute("donationName", donationName);
		request.getSession().setAttribute("selectedOrganization", selectedDonation.getOrganization());
		request.getSession().setAttribute("selectedDonation",selectedDonation);
		
		return view;
	}
	@RequestMapping(value = "/pledgingsubmit",method = RequestMethod.POST)
	public ModelAndView pledgingSubmit(){
		System.out.println("in controller");
		ModelAndView view = new ModelAndView("donationSubmitted");
		return view;
	}
	@RequestMapping(value = "/customSubmit",method = RequestMethod.POST)
	public ModelAndView customsubmit(HttpServletRequest request){
		System.out.println("in controller");
		ModelAndView view = new ModelAndView("pledgingDonationConfirm");
		view.addObject("amount", request.getParameter("customAmount"));
		//view.addObject("amount", request.getParameter("amount"));
		view.addObject("wishName", request.getParameter("name"));
		selectedDonation = new Donation();
		selectedDonation.setType(DonationType.PLEDGING.name());
		selectedDonation.setDescription("PM Custom Fund");
		List<Organization> list =helpingHandService.getOrgnizationList();
		for(Organization organization:list){
			if(organization.getName().equalsIgnoreCase("PMRF")){
				view.addObject("selectedOrganization", organization);
				break;
			}
		}
		view.addObject("wishDetails",selectedDonation.getDescription());
		//view.setViewName("pledgingDonationConfirm");
		
		return view;
	}
	private User getUser(String userName) {
		for(User user:userList){
			if(user.getUserName().equalsIgnoreCase(userName)){
				return user;
			}
		}
		return null;
	}
	@RequestMapping(value = "/submit",method = RequestMethod.GET)
	public ModelAndView getSubmitPage(HttpServletRequest request){
		
		ModelAndView view = new ModelAndView();
		if(DonationType.WISH.name().equalsIgnoreCase(request.getParameter("type")) && validateWishSubmit(request.getParameter("amount"),request.getParameter("name"),request.getParameter("type"))){
			amountSelected = Long.valueOf(request.getParameter("amount"));
			donationName = request.getParameter("name");
			donationType =request.getParameter("type");
			view.addObject("amount", amountSelected);
			view.addObject("wishName", donationName);
			view.addObject("selectedOrganization", selectedDonation.getOrganization());
			view.addObject("wishDetails",selectedDonation.getDescription());
			if("block".equalsIgnoreCase(request.getParameter("isCorrectCredential"))){
				view.addObject("isCorrectCredential", "block");
			}
			else{
			view.addObject("isCorrectCredential", "none");
			}
			view.setViewName("submit");
		}
		else if(EventType.PLEDGING_DONATION.name().equalsIgnoreCase(request.getParameter("type")) && validateWishSubmit(request.getParameter("amount"),request.getParameter("name"),request.getParameter("type"))){
			view.addObject("amount", request.getParameter("amount"));
			view.addObject("wishName", request.getParameter("name"));
			view.addObject("selectedOrganization", selectedDonation.getOrganization());
			view.addObject("wishDetails",selectedDonation.getDescription());
			view.setViewName("pledgingDonationConfirm");
		}
		
		else{
			view.setViewName("notCorrectSelection");
		}
		System.out.println("in controller");
		return view;
	}
	
	@RequestMapping(value = "donation/generateReceipt", method = RequestMethod.GET)
	public ModelAndView generateReceipt(HttpServletRequest request) {
		// create some sample data
		List<PDFReciept> listReciepts = new ArrayList<PDFReciept>();
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();	
		
		String orgName = ((Organization)request.getSession().getAttribute("selectedOrganization")).getName();
		String donationType = ((Donation)request.getSession().getAttribute("selectedDonation")).getType();
		String fullName = (String) request.getSession().getAttribute("fullName");
		String description = ((Donation)request.getSession().getAttribute("selectedDonation")).getDescription();
		Long amount = Long.valueOf(String.valueOf(request.getSession().getAttribute("amountSelected")));
		System.out.println(orgName);
		PDFReciept WishReciept1 = new PDFReciept(orgName, donationType,dateFormat.format(date).toString(),
				fullName,description,amount,
												"ImagePath","Account Manager");
																					
		listReciepts.add(WishReciept1);										
		/* listReciepts.add(new PDFReciept("Spring in Action", "Craig Walls", "1935182358",
				"June 29th 2011", 31.98F));
		listReciepts.add(new PDFReciept("Spring in Practice", "Willie Wheeler, Joshua White",
				"1935182056", "May 16th 2013", 31.95F));
		listReciepts.add(new PDFReciept("Pro Spring 3",
				"Clarence Ho, Rob Harrop", "1430241071", "April 18th 2012", 31.85F));
		listReciepts.add(new PDFReciept("Spring Integration in Action", "Mark Fisher", "1935182439",
				"September 26th 2012", 28.73F));
				*/

		// return a view which will be resolved by an excel view resolver
		return new ModelAndView("pdfView", "listReciepts", listReciepts);
	}
private boolean validateWishSubmit(String amount, String wishName, String type) {
		
		List<Donation> wishTypeDonationList = getDonationListAccordingToType(type);
		for(Donation donation : wishTypeDonationList){
			if(donation.getName().equalsIgnoreCase(wishName) && donation.getAmount().longValue()== Long.valueOf(amount)){
				selectedDonation = donation;
				return true;
			}
		}
		return false;
	}
}
