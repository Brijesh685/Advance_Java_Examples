package com.as.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.as.form.bankInfoForm;
import com.as.form.contactInfoForm;
import com.as.form.personalInfoForm;
import com.as.util.HibernateUtil;

public class personalinfoDAO {

	public void createPersonal(personalInfoForm personalinfo)
	{
		Session session = HibernateUtil.getFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(personalinfo);
		tx.commit();
		
	}
	public void createContact(contactInfoForm contactInfo)
	{
		Session session = HibernateUtil.getFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(contactInfo);
		tx.commit();
		
	}
	public void createBank(bankInfoForm bankInfo)
	{
		Session session = HibernateUtil.getFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(bankInfo);
		tx.commit();
		
	}

}
