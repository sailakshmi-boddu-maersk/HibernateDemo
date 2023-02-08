package com.slb;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String Name;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="ad_id",referencedColumnName="addressId")
	StuAddress address;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public StuAddress getAddress() {
		return address;
	}
	public void setAddress(StuAddress address) {
		this.address = address;
	}

	
}
