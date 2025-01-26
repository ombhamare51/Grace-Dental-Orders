package com.gdl.Grace.Dental.Orders.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gdl.Grace.Dental.Orders.Entity.Doctor;
import com.gdl.Grace.Dental.Orders.Model.LoginRequest;

@Repository
public class Doctor_Dao {

	@Autowired
	SessionFactory sf;

	public String doctorSignup(Doctor dr) {
		Session ss = null;
		Transaction tx = null;
		String msg = null;
		try {
			ss = sf.openSession();
			tx = ss.beginTransaction();
			ss.persist(dr);
			tx.commit();
			msg = "Account created";

		} catch (Exception e) {

			if (tx != null) {
				tx.rollback();
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

	public Doctor checkDoctorLogin(LoginRequest lr) {
		Session ss = null;
		Transaction tx = null;
		Doctor doctor = null;

		try {
			ss = sf.openSession();
			tx = ss.beginTransaction();

			String hqlQuery = "from Doctor where email = :myemail";
			Query<Doctor> query = ss.createQuery(hqlQuery, Doctor.class);
			query.setParameter("myemail", lr.getEmail());

			doctor = query.uniqueResult();
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
		return doctor;
	}

}
