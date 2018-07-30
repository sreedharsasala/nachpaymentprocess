package com.dineshonjava.dao;

import java.util.List;

import com.dineshonjava.bean.Donor;

public interface DonorDao {
	
	public void addPublication(Donor donor);
	
	public List<Donor> getPublications();
	
	public Donor getPublication(int pubId);
	
	public void deletePublication(int pubId);
}
