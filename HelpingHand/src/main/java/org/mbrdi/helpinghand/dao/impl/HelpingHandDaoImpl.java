package org.mbrdi.helpinghand.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.mbrdi.helpinghand.dao.HelpingHandDao;
import org.mbrdi.helpinghand.model.Donation;
import org.mbrdi.helpinghand.model.Event;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;


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

}
