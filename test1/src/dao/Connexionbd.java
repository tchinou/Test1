package dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Modele.Produit;
import java.sql.*;

import java.sql.Connection;
import java.sql.Statement;

public class Connexionbd {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 



	static Connection con;
	java.sql.Statement canal=null;

	public Connexionbd() { //Constructeur en priv�
		super();

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();


		}



		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Probl�me");
		}
	}


	@SuppressWarnings("unused")
	public Connection createConnexion(){

		Connection con=null;
		
		if(con==null){
		

				try {
					con=DriverManager.getConnection("jdbc:mysql://localhost/testjee", "root", "root");
					canal=con.createStatement();

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			
		}
		else 
			System.out.println("Can't create a connexion");
		

		return con;
	}

}














