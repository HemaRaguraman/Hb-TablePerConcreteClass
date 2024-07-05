package com.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TpccExample {
	public static void main(String[] args)
	{
		Transaction tr=null;
		try(Session session=HBUtil.getSesFactory().openSession())
		{
			tr=session.beginTransaction();
			Employee e1=new Employee("Kumar");
			Regular_Employee e2=new Regular_Employee(5500,"Sales","Santhosh");
			Trainee1 e3=new Trainee1(200,"6","Dinesh");
			session.persist(e1);
			session.persist(e2);
			session.persist(e3);
			tr.commit();
			session.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
