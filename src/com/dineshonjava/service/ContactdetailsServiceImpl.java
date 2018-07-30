package com.dineshonjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dineshonjava.bean.Contactdetails;
import com.dineshonjava.dao.ContactdetailDao;

/**
 * @author Dinesh Rajput
 *
 */

@Service("categoryService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ContactdetailsServiceImpl implements ContactdetailService {
	
	@Autowired
	private ContactdetailDao contactdetailDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addCategory(Contactdetails contactdetails) {
		System.out.println("service addCategory()");
		contactdetailDao.addCategory(contactdetails);
	}

	@Override
	public List<Contactdetails> getCategories() {
		return contactdetailDao.getCategories();
	}

	@Override
	public Contactdetails getCategory(int categoryId) {
		return contactdetailDao.getCategory(categoryId);
	}

	@Override
	public void deleteCategory(int categoryId) {
		contactdetailDao.deleteCategory(categoryId);
	}

}
