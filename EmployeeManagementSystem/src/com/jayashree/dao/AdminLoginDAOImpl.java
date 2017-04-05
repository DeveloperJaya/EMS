package com.jayashree.dao;

/*
 * @Author: Jayashree Das
 * Designation: Software Engineer
 * Qualification: B.Tech in CSE from NIT Agartala
 * Experience: 2.11 years experience in IT industry 
 */

import com.jayashree.model.*;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public class AdminLoginDAOImpl implements AdminLoginDAO {

	 @Resource(name="sessionFactory")
     protected SessionFactory sessionFactory;

     public void setSessionFactory(SessionFactory sessionFactory) {
            this.sessionFactory = sessionFactory;
     }
    
     protected Session getSession(){
            return sessionFactory.openSession();
     }
    @SuppressWarnings("rawtypes")
	@Override
	public boolean checkadminlogin(String uname, String upass) {
		// TODO Auto-generated method stub
		System.out.println("In Check login");
		Session session = sessionFactory.openSession();
		boolean userFound = false;
		session.beginTransaction();
		//Query using Hibernate Query Language
		String SQL_QUERY =" from EMSAdmin as o where o.adminName=? and o.adminPassword=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,uname);
		query.setParameter(1,upass);
		List list = query.list();

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}
		session.getTransaction().commit();;
		session.close();
		return userFound;
	}

	
}
