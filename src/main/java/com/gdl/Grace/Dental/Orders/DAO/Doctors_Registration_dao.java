package com.gdl.Grace.Dental.Orders.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gdl.Grace.Dental.Orders.Entity.Doctor_Registration_Entity;

@Repository
public class Doctors_Registration_dao {

	@Autowired
	SessionFactory factory;

	public String InsertData(Doctor_Registration_Entity d) {
		Session ss = null;
		Transaction tr = null;
		String msg = null;
		try {
			ss = factory.openSession();
			tr = ss.beginTransaction();
			ss.persist(d);
			tr.commit();
			msg = "Account created";

		} catch (Exception e) {

			if (tr != null) {
				tr.rollback();
			}

			e.printStackTrace();
			msg = "Error occured while creating the account please try again";
		} finally {
			if (ss != null) {

				ss.close();
			}
		}

		return msg;

	}

}
