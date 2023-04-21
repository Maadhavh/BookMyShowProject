package com.jsp.BookMyShow.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jsp.BookMyShow.entity.MovieEntity;
import com.jsp.BookMyShow.util.SessionFactoryUtil;

public class Repository {

	public void saveData(MovieEntity entity) {
		SessionFactory sessionfactory = SessionFactoryUtil.getSessionfactory();
		Session session = sessionfactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
		
	}

	public MovieEntity getData(MovieEntity 	tity, long id) {
		SessionFactory sessionfactory = SessionFactoryUtil.getSessionfactory();
		Session session = sessionfactory.openSession();
		return session.get(MovieEntity.class, id);
	}

	public void saveOrUpdateData(MovieEntity entity) {

	}

	public void merge(MovieEntity entity) {

	}


}
