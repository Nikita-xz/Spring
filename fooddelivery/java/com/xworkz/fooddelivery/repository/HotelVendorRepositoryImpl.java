package com.xworkz.fooddelivery.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.fooddelivery.entiry.HotelVendorEntity;

public class HotelVendorRepositoryImpl implements HotelVendorRepository {

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("invoked save"+entity);
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
