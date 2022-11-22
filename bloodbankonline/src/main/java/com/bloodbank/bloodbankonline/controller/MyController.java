package com.bloodbank.bloodbankonline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bloodbank.bloodbankonline.entities.Donor;
import com.bloodbank.bloodbankonline.services.BloodDonorsService;

@RestController

public class MyController {
	
	@Autowired
	public BloodDonorsService BloodDonarsService;
	
	

	@GetMapping("/Donate")
	public String donate() {
		
		return "Blood Donors Online";
	}
	
// Get LIst OF Blood Donors
	
	@GetMapping("/donors")
	public List<Donor> getDonors()
	{
		
		
		return this.BloodDonarsService.getDonors();
		
}
	@GetMapping("/donors/{donorId}")
public Donor getDonor(@PathVariable String donorId)
{
	return this.BloodDonarsService.getDonor(Long.parseLong(donorId));
	
}
	
	// add donor
	
	@PostMapping("/donors")
	public Donor addDonor(@RequestBody Donor donor)
	{
		return this.BloodDonarsService.addDonor(donor);
	}
	
	// update donor using put request
	@PutMapping("/donors")
	public Donor updateDonor(@RequestBody Donor donor) {
		return this.BloodDonarsService.updateDonor(donor);
	
	}
	
	//delete the cource 
	
	@DeleteMapping("/donor/{donorId}")
	public ResponseEntity<HttpStatus> deleteDonor(@PathVariable String donorId){
		try {
			this.BloodDonarsService.deleteDonor(Long.parseLong(donorId));
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
	
	
}