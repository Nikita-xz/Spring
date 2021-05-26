package com.xworkz.common_module.repository;

import org.apache.log4j.Logger;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.common_module.entity.Endgame21v02Entity;

@Repository
public class Endgame21v02RepoImpl implements Endgame21v02Repo {
	
	private Logger logger;

	@Autowired
	private SessionFactory bean;
	
	public Endgame21v02RepoImpl() {
		logger = Logger.getLogger(getClass());
		logger.info("invoked"+this.getClass().getSimpleName());
	}

	@Override
	public Integer save(Endgame21v02Entity entity) {
		Transaction transaction = null;
		Integer affectedRow = 0;
		logger.info("invoked save");
		try(Session session =  bean.openSession()) {
			
			transaction = session.beginTransaction();
			affectedRow = (Integer)session.save(entity);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			logger.error("you have got exception in {} " + e.getMessage() , e );
		}
		return affectedRow;
	}

	@Override
	public Endgame21v02Entity getByEmailId(String emailId) {
		Transaction transaction = null;
		Session session = null;
		Endgame21v02Entity entity = null;
		logger.info("invoked getByEmailId");
		try {
			session =  bean.openSession();
			Query query =session.createNamedQuery("getByEmailId");
			query.setParameter("email", emailId );
			entity=(Endgame21v02Entity) query.uniqueResult();
		} catch (Exception e) {
			logger.error("you have exception in {} " + e.getMessage() , e );
		}
		finally {
			if (session != null) {
				session.close();
			}
		}

		return entity;
	}

}
