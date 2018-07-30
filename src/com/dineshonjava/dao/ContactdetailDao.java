package com.dineshonjava.dao;

import java.util.List;

import com.dineshonjava.bean.Contactdetails;

public interface ContactdetailDao {
	
	public void addCategory(Contactdetails contactdetails);
	
	public List<Contactdetails> getCategories();
	
	public Contactdetails getCategory(int categoryId);
	
	public void deleteCategory(int categoryId);
}
