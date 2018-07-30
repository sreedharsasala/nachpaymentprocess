package com.dineshonjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dineshonjava.bean.Donor;
import com.dineshonjava.dao.DonorDao;

/**
 * @author Dinesh Rajput
 *
 */
@Service("publicationService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DonorServiceImpl implements DonorService {

	@Autowired
	private DonorDao donorDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addPublication(Donor donor) {
		donorDao.addPublication(donor);
	}

	public List<Donor> getPublications() {
		return donorDao.getPublications();
	}

	@Override
	public Donor getPublication(int pubId) {
		return donorDao.getPublication(pubId);
	}

	@Override
	public void deletePublication(int pubId) {
		donorDao.deletePublication(pubId);
	}

}
