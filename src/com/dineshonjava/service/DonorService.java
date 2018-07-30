package com.dineshonjava.service;

import java.util.List;

import com.dineshonjava.bean.Donor;

public interface DonorService {
	
	public void addPublication(Donor donor);
	
	public List<Donor> getPublications();
	
	public Donor getPublication(int pubId);
	
	public void deletePublication(int pubId);
}
