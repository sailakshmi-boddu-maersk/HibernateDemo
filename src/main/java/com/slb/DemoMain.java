package com.slb;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DemoMain {

	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		
		StudentService studentService=new StudentService();
		StuAddress add=new StuAddress();
		add.setAddressId(108);
		add.setAddress("Bangalore");
		
		Student student=new Student();
		student.setName("Student8");
		student.setAddress(add);
		studentService.insertStudent(student);
//		add.addStudent(student);
//		studentService.deleteStudent(52);
		
//		Session session= sessionFactory.openSession();
//		session.beginTransaction();
//		session.save(add);
//		session.getTransaction().commit();
//		session.close();
		
		

	}

}
