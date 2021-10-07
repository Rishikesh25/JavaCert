package com.util;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HB_Util {
	
	    private static StandardServiceRegistry registry;
	    private static SessionFactory sessionFactory;
	    public static SessionFactory getSessionFactory() {
	        if (sessionFactory == null) {
	            try {
	                // Create registry
	            	StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("com.util.hibernate.cfg.xml").build();
	              //  Configuration  configuration = new Configuration().configure("/logic/hibernate.cfg.xml");
	                // Create MetadataSources
	                MetadataSources sources = new MetadataSources();
	                // Create Metadata
	                Metadata metadata = sources.getMetadataBuilder(registry).build();
	                // Create SessionFactory
	                sessionFactory = metadata.getSessionFactoryBuilder().build();
	                }


	            catch (Exception e) {
	                e.printStackTrace();
	                if (registry != null) {
	                    StandardServiceRegistryBuilder.destroy(registry);
	                }
	            }
	        }
	        return sessionFactory;
	    }
	 
	   
	    }
	
