package tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.StudentAnnotation;

public class TestAnnotationHibernate {
	
	public static void main(String[] args){
		
		SessionFactory sf = new Configuration()
							.configure("hibernateAnnotation.cfg.xml")
							.addAnnotatedClass(StudentAnnotation.class)
							.buildSessionFactory();
		
		
		
		Session session = sf.getCurrentSession();
		
		
	try{
		
		//create un object student
		StudentAnnotation sa = new StudentAnnotation("boufennara", "lyes", "lyesboufennara@outlook.fr");

		//store object in session
		session.beginTransaction();
		
		//save the student
		session.save(sa);

		//commit the transaction
		session.getTransaction().commit();
	}
	
	finally {
		sf.close();
	}
	
	
	}

}
