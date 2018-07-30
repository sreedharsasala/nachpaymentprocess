package com.dineshonjava.service;

import java.util.List;

import com.dineshonjava.bean.Contactdetails;

public interface ContactdetailService {
	
	public void addCategory(Contactdetails contactdetails);
	
	public List<Contactdetails> getCategories();
	
	public Contactdetails getCategory(int categoryId);
	
	public void deleteCategory(int categoryId);

}
