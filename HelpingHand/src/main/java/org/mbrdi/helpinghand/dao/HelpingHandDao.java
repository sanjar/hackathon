package org.mbrdi.helpinghand.dao;

import java.util.List;

import org.mbrdi.helpinghand.model.BloodDonationDemand;
import org.mbrdi.helpinghand.model.Donation;
import org.mbrdi.helpinghand.model.Event;
import org.mbrdi.helpinghand.model.Organization;
import org.mbrdi.helpinghand.model.User;

public interface HelpingHandDao {

	List<Event> getEvenList();

	List<Donation> getDonationList();

	List<User> getUserList();

	void saveNeedBloodRequest(BloodDonationDemand needBlood);

	List<String> getEmailListWithSpecificBloodGroup(String bloodGroup);

	List<Organization> getOrgnizationList();

	
}
