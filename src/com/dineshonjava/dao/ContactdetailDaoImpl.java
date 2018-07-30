package com.dineshonjava.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dineshonjava.bean.Contactdetails;

/**
 * @author Dinesh Rajput
 *
 */

@Repository("categoryDao")
public class ContactdetailDaoImpl implements ContactdetailDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addCategory(Contactdetails contactdetails) {
		System.out.println("DAO addCategory()");
		sessionFactory.getCurrentSession().saveOrUpdate(contactdetails);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contactdetails> getCategories() {
		return (List<Contactdetails>) sessionFactory.getCurrentSession().createCriteria(Contactdetails.class).list();
	}

	@Override
	public Contactdetails getCategory(int categoryId) {
		return (Contactdetails) sessionFactory.getCurrentSession().get(Contactdetails.class, categoryId);
	}

	@Override
	public void deleteCategory(int categoryId) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM category WHERE categoryId = "+categoryId).executeUpdate();
	}

}
