package tests;

import java.text.Annotation;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import beans.StudentHibernateNaveen;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentHibernateNaveen str=new StudentHibernateNaveen();
		str.setIdS(111);
		str.setNameS("lyes");
		str.setEmailS("lyesboufennara@outlook.fr");
		str.setMarkS(500);
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		org.hibernate.Session s=sf.openSession();
		s.beginTransaction();
		s.save(str);
		s.getTransaction().commit();
		s.close();
	}

}
