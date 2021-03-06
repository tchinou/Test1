package tests;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.StudentAnnotation;

public class PrimaryKeyDemo {


	public static void main(String[] args ){
		
				SessionFactory sf = new Configuration()
				.configure("hibernateAnnotation.cfg.xml")
				.addAnnotatedClass(StudentAnnotation.class)
				.buildSessionFactory();



		Session session = sf.getCurrentSession();


		try{

			//create un object student
			StudentAnnotation st1 = new StudentAnnotation("boufennara", "lyes", "lyesboufennara@outlook.fr");
			StudentAnnotation st2 = new StudentAnnotation("dif", "mehdi", "difmehdi@outlook.fr");
			StudentAnnotation st3 = new StudentAnnotation("boukhatem", "bea", "bea@outlook.fr");

			//store object in session
			session.beginTransaction();

			//save the student
			session.save(st1);
			session.save(st2);
			session.save(st3);


			//commit the transaction
			session.getTransaction().commit();
		}

		finally {
			sf.close();
		}

	}
}
