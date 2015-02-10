package org.mbrdi.helpinghand.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mbrdi.helpinghand.dao.HelpingHandDao;
import org.mbrdi.helpinghand.model.Donation;
import org.mbrdi.helpinghand.model.Event;
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
		// TODO Auto-generated method stub
		return helpingHandDao.getDonationList();
	}
}
