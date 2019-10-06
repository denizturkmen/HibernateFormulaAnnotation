package com.denizturkmen.Client;


import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.denizturkmen.Entity.Account;
import com.denizturkmen.Util.HibernateUtil;

public class SaveClientEntity1 {
	public static void main(String[] args) {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Account account = new Account();
			account.setCredit(900.00);
			account.setRate(300.00);
			
			session.beginTransaction();
			session.save(account);
			session.getTransaction().commit();
			
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}
}
