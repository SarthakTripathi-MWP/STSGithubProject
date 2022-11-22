package com.bloodbank.bloodbankonline.services;

import java.util.List;

import com.bloodbank.bloodbankonline.entities.Donor;

public interface BloodDonorsService {

	public List <Donor> getDonors();
	
	
	public Donor getDonor(long donorId);
	
	public Donor addDonor(Donor donar);
	
	public Donor updateDonor(Donor donar);

	public void deleteDonor(long parseLong);
}
