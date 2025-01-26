package com.gdl.Grace.Dental.Orders.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gdl.Grace.Dental.Orders.Entity.LabAdm_Register_Entity;

@Repository
public class LabAdm_Register_Dao {

	@Autowired
	private SessionFactory sf;

	public String Lab_signup(LabAdm_Register_Entity lre) {
		Session ss = null;
		Transaction tx = null;
		String msg = null;

		try {
			ss = sf.openSession();
			tx = ss.beginTransaction();
			ss.persist(lre);
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
}
