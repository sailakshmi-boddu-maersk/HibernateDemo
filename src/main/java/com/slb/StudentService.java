package com.slb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentService {

	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	public void insertStudent(Student student) {
		Session session= sessionFactory.openSession();
		session.beginTransaction();
		session.byId(Student.class);
		session.persist(student);
		session.getTransaction().commit();
		session.close();
	}
	public void deleteStudent(int id) {
		Session session= sessionFactory.openSession();
		session.beginTransaction();
		Student stu=session.get(Student.class,id);
		session.delete("Student", stu);
//		session.delete(stu);
		session.getTransaction().commit();
		session.close();
	}
}
