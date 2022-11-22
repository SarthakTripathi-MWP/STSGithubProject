package com.bloodbank.bloodbankonline.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.bloodbank.bloodbankonline.entities.Donor;


@Service
public class DonarServiceimpl implements BloodDonorsService {
	
	
	
	List <Donor> list;
	public DonarServiceimpl() {
		list = new ArrayList<>();
		list.add(new Donor(110, "Sarthak Tripathi", "O+", 121003,"faridabad"));
		list.add(new Donor(120, "Rupam Tripathi", "Ab+", 125456,"faridabad"));
		list.add(new Donor(130, "Rahul Sharma", "O-", 252001,"faridabad"));
		list.add(new Donor(140, "Rekha Sharma", "B+", 885254,"faridabad"));
				
	}

	public List<Donor> getDonors() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Donor getDonor(long donorId) {
		// TODO Auto-generated method stub
		Donor d =null;
		for(Donor donar:list)
		{
			if (donar.getId()==donorId) {
				d = donar;
				break;
			}
		}
			
		return d;
	}

	@Override
	public Donor addDonor(Donor donar) {
		list.add(donar);
		// TODO Auto-generated method stub
		return donar;
	}

	@Override
	public Donor updateDonor(Donor donar) {
		// TODO Auto-generated method stub
		list.forEach(e -> {
			if(e.getId() == donar.getId()) {
				e.setAddress(donar.getAddress());
				e.setPhone_number(donar.getPhone_number());
				e.setName(donar.getName());
			}
		});
		return donar ;
	}

	public void deleteDonor(long parseLong) {
		// TODO Auto-generated method stub
		list=this.list.stream().filter(e ->e.getId()!=parseLong).collect(Collectors.toList());
	}

}
