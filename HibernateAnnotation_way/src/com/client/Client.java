package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.beans.Student;
import com.util.HB_Util;



public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = HB_Util.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Student student1 = new Student("Hrishi", "Avhad", 8);
		session.save(student1);
		transaction.commit();
		factory.close();
	}

}
