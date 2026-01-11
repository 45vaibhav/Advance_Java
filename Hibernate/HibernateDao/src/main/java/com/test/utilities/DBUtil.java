package com.test.utilities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtil {
	public static Session getSession() {
		try {
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sessionfact=cfg.buildSessionFactory();
			Session session=sessionfact.openSession();
			return session;
	
	}catch(Exception e) {
		e.printStackTrace();
		return null;
	}
	}
}
