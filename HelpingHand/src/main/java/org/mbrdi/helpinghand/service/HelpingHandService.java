package org.mbrdi.helpinghand.service;

import java.util.List;

import org.mbrdi.helpinghand.model.Donation;
import org.mbrdi.helpinghand.model.Event;

public interface HelpingHandService {

	List<Event> getEvenList();

	List<Donation> getDonationList();

	
}
