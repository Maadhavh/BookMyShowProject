package com.jsp.BookMyShow.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jsp.BookMyShow.entity.MovieEntity;

public class SessionFactoryUtil {

private static SessionFactory sessionFactory = null;
	
	// Approach 1: Creating only one sessionFactory object
	// As static blocks are executed only once during class loading.
	
	static {
		Configuration cfg = new Configuration(); // It creates a path or road between eclipse and database.
		cfg.setProperties(MysqlConnectionUtil.getConnectionProperties());
		cfg.addAnnotatedClass(MovieEntity.class);
		
		sessionFactory = cfg.buildSessionFactory();
	}
	
	// Used to return sessionFactory object 
	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

}
