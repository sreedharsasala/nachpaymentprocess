package com.dineshonjava.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dineshonjava.bean.Donor;

/**
 * @author Dinesh Rajput
 *
 */

@Repository("publicationDao")
public class DonorDaoImpl implements DonorDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addPublication(Donor donor) {
		sessionFactory.getCurrentSession().saveOrUpdate(donor);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Donor> getPublications() {
		return (List<Donor>) sessionFactory.getCurrentSession().createCriteria(Donor.class).list();
	}

	@Override
	public Donor getPublication(int pubId) {
		return (Donor) sessionFactory.getCurrentSession().get(Donor.class, pubId);
	}

	@Override
	public void deletePublication(int pubId) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Publication WHERE pubId = "+pubId).executeUpdate();
	}

}
