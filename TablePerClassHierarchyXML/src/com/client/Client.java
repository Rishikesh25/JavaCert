package com.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.beans.Contract_emp;
import com.beans.Employee;
import com.beans.Regular_emp;
import com.mysql.cj.Query;

public class Client {


		public static void main(String[] args) {
			
			
			 StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("/com/client/hibernate.cfg.xml").build();  
			    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build(); 
			    SessionFactory factory = meta.getSessionFactoryBuilder().build();
			    Session session = factory.openSession();
			    Transaction tx = session.beginTransaction() ;
			    
			    Employee e1 = new Employee();
			    e1.setName("Vinod Dua");
			    
			    Regular_emp e2 = new  Regular_emp();
			    e2.setName("Happy Singh");
			    e2.setSalary(60000);
			    e2.setBonus(12000);
			    
			    Contract_emp e3 = new Contract_emp ();
			    e3.setName("Hrishi Anand");
			    e3.setPay_per_hour(1000);
			    e3.setContract_duration(10);
			    
			    session.persist(e1);
			    session.persist(e2);
			    session.persist(e3);
			    
			    tx.commit();
			    System.out.println("success");
			  //  tx= session.beginTransaction();
			 /*   org.hibernate.query.Query query = session.createQuery("FROM Employee");
			    List <Employee> employees=query.list();
			    for(Employee employee: employees)
			    System.out.println(employee); */
			    
			   
}
	
}