package com.gdl.Grace.Dental.Orders.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gdl.Grace.Dental.Orders.Entity.LabAdmin;
import com.gdl.Grace.Dental.Orders.Model.LoginRequest;

@Repository
public class LabAdm_Dao {

	@Autowired
	private SessionFactory sf;

	public String AdminSignup(LabAdmin le) {
		Session ss = null;
		Transaction tx = null;
		String msg = null;

		try {
			ss = sf.openSession();
			tx = ss.beginTransaction();
			ss.persist(le);
			tx.commit();
			msg = "Account created";
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			msg = "Error occurred while creating the account. Please try again.";
		} finally {
			if (ss != null) {
				ss.close();
			}

		}
		return msg;
	}

	public LabAdmin AdminLogin(LoginRequest lr) {
		Session ss = null;
		Transaction tx = null;
		LabAdmin admin = null;

		try {
			ss = sf.openSession();
			tx = ss.beginTransaction();

			String hqlQuery = "from LabAdmin where email = :myemail";
			Query<LabAdmin> query = ss.createQuery(hqlQuery, LabAdmin.class);
			query.setParameter("myemail", lr.getEmail());

			admin = query.uniqueResult();
			tx.commit();

		} catch (Exception ex) {
			if (tx != null) {
				tx.rollback();
			}
			ex.printStackTrace();
		} finally {
			if (ss != null) {
				ss.close();
			}
		}
		return admin;
	}
}
