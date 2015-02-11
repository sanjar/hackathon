package org.mbrdi.helpinghand.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mbrdi.helpinghand.dao.HelpingHandDao;
import org.mbrdi.helpinghand.model.BloodDonationDemand;
import org.mbrdi.helpinghand.model.Donation;
import org.mbrdi.helpinghand.model.Event;
import org.mbrdi.helpinghand.model.Organization;
import org.mbrdi.helpinghand.model.User;
import org.mbrdi.helpinghand.service.HelpingHandService;
import org.springframework.stereotype.Service;

@Service("helpingHandService")
public class HelpingHandServiceImpl implements HelpingHandService{

	@Resource(name ="helpingHandDaoService")
	private HelpingHandDao helpingHandDao;

	@Override
	public List<Event> getEvenList() {
		
		return helpingHandDao.getEvenList();
	}

	@Override
	public List<Donation> getDonationList() {
		return helpingHandDao.getDonationList();
	}

	@Override
	public List<User> getUserList() {
		return helpingHandDao.getUserList();
	}

	@Override
	public void saveNeedBloodRequest(BloodDonationDemand needBlood) {
		helpingHandDao.saveNeedBloodRequest(needBlood);
		
	}

	@Override
	public List<String> getEmailListWithSpecificBloodGroup(String bloodGroup) {
		return helpingHandDao.getEmailListWithSpecificBloodGroup(bloodGroup);
	}
	
	@Override
	public List<Organization> getOrgnizationList() {
		// TODO Auto-generated method stub
		return helpingHandDao.getOrgnizationList();
	}
}
