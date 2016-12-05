package dao;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.sql.Connection;
import com.mysql.jdbc.Statement;

import Modele.Produit;
import dao.Connexionbd;
import dao.Dao;


public class ProduitDao implements Dao<Produit>{
	//private static final Statement  = null;
	//Connection Con=null;

	public  ArrayList<Produit> findAll(){
		ArrayList<Produit> tab = new ArrayList<Produit>();
		java.sql.Statement canal=null;
		
		Connexionbd cb = new Connexionbd();
		Connection con=cb.createConnexion();

		try {

			canal= con.createStatement();
			ResultSet res = canal.executeQuery("SELECT * FROM produit");

			while(res.next()){
				String a = res.getString("article");
				int p = res.getInt("prix");
				int id = res.getInt("id");
				Produit prod = new Produit(id,a,p);
				tab.add(prod);
				//System.out.println(a+""+p+""+id);
			}
		}catch (Exception e){
			System.out.println("probl�me");
		}

		return tab;


	}

	public  ArrayList<Produit> findbynom(String nom){
		ArrayList<Produit> tab = new ArrayList<Produit>();
		java.sql.Statement canal=null;
		Connexionbd cb = new Connexionbd();
		Connection con=cb.createConnexion();

		try {

			canal= con.createStatement();
			ResultSet res = canal.executeQuery("SELECT * FROM produit WHERE article = 'nom'");

			while(res.next()){
				String a = res.getString("article");
				double p = res.getDouble("prix");
				int id = res.getInt("id");
				Produit prod = new Produit(a,p,id);
				tab.add(prod);
				//System.out.println(a+""+p+""+id);
			}
		}catch (Exception e){
			System.out.println("probl�me");
		}

		return tab;


	}

	public  double findbyprix(String nom){
		double p = 0;
		java.sql.Statement canal=null;
		Connexionbd cb = new Connexionbd();
		Connection con=cb.createConnexion();

		try {

			canal= con.createStatement();
			ResultSet res = canal.executeQuery("SELECT * FROM produit WHERE article = 'nom'");


			String a = res.getString("article");
			double p1 = res.getDouble("prix");
			int id = res.getInt("id");

		}catch (Exception e){
			System.out.println("probl�me");
		}


		return p;


	}




	public  boolean insert(Produit p){

		java.sql.Statement canal=null;
		Connexionbd cb = new Connexionbd();
		Connection con=cb.createConnexion();

		try {

			canal= con.createStatement();


			canal.executeUpdate("INSERT INTO `produit` (`id`, `article`, `prix`) VALUES ('17', '"+p.getNom()+"', '"+p.getPrix()+"');");

		}
		catch (Exception e){
			System.out.println("probl�me");
			e.printStackTrace();
			return false;
		}

		return true;


	}


	public  boolean delete(int id){

		java.sql.Statement canal=null;
		Connexionbd cb = new Connexionbd();
		Connection con=cb.createConnexion();

		try {

			canal= con.createStatement();
			canal.executeUpdate("DELETE FROM `produit` WHERE `produit`.id="+id);

		}catch (Exception e){
			return false;

		}
		return true;
	}

	@Override
	public Produit FindByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
