package org.mbrdi.helpinghand.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.mbrdi.helpinghand.dao.HelpingHandDao;
import org.mbrdi.helpinghand.model.BloodDonationDemand;
import org.mbrdi.helpinghand.model.Donation;
import org.mbrdi.helpinghand.model.Event;
import org.mbrdi.helpinghand.model.Organization;
import org.mbrdi.helpinghand.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("helpingHandDaoService")
@Transactional
public class HelpingHandDaoImpl implements HelpingHandDao{

	private EntityManager entityManager;
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager){
		this.entityManager = entityManager;
	}
	
	@Override
	public List<Event> getEvenList() {
		Query query = entityManager.createQuery("FROM Event e order by e.eventId ASC");
		return query.getResultList();
	}

	@Override
	public List<Donation> getDonationList() {
		Query query = entityManager.createQuery("FROM Donation d order by d.id ASC");
		return query.getResultList();
	}

	@Override
	public List<User> getUserList() {
		Query query = entityManager.createQuery("FROM User d order by d.empNumber ASC");
		return query.getResultList();
	}

	@Override
	public void saveNeedBloodRequest(BloodDonationDemand needBlood) {
		BloodDonationDemand bloodDonationDemand=  entityManager.merge(needBlood);
		entityManager.flush();
	
		
	}

	@Override
	public List<String> getEmailListWithSpecificBloodGroup(String bloodGroup) {
		Query query = entityManager.createQuery("Select d.email FROM Donar d where d.bloodGroup= "+bloodGroup);
		return query.getResultList();
		
	}
	
	@Override
	public List<Organization> getOrgnizationList() {
		Query query = entityManager.createQuery("FROM Organization d order by d.id ASC");
		return query.getResultList();
	}

}
