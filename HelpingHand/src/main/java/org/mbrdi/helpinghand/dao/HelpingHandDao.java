package org.mbrdi.helpinghand.dao;

import java.util.List;

import org.mbrdi.helpinghand.model.Donation;
import org.mbrdi.helpinghand.model.Event;

public interface HelpingHandDao {

	List<Event> getEvenList();

	List<Donation> getDonationList();

	

	
}
