package com.slb;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class StuAddress{
	
    @Id
	int addressId;
	String address;
	
//	@OneToMany(cascade = CascadeType.ALL,
//            mappedBy = "address")
//	private List<Student> student= new ArrayList<Student>();
//	
//	public void addStudent(Student student) {
//        this.student.add(student);
//        student.setAddress(this);
//    }
	
//	public List<Student> getStudent() {
//		return student;
//	}
//	public void setStudent(List<Student> student) {
//		this.student = student;
//	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address= address;
	}
	
	
	
	
	
	
	
}
