package com.bloodbank.bloodbankonline.entities;

public class Donor {

	private long id;
	private String name;
	private String Blood_group;
	private long phone_number;
	private String address;
	public Donor(long id, String name, String blood_group, long phone_number, String address) {
		super();
		this.id = id;
		this.name = name;
		Blood_group = blood_group;
		this.phone_number = phone_number;
		this.address = address;
	}
	public Donor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBlood_group() {
		return Blood_group;
	}
	public void setBlood_group(String blood_group) {
		Blood_group = blood_group;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Donor [id=" + id + ", name=" + name + ", Blood_group=" + Blood_group + ", phone_number=" + phone_number
				+ ", address=" + address + ", getId()=" + getId() + ", getName()=" + getName() + ", getBlood_group()="
				+ getBlood_group() + ", getPhone_number()=" + getPhone_number() + ", getAddress()=" + getAddress()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}
