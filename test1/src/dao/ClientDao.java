package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import Modele.Client;
import Modele.Produit;

public class ClientDao implements Dao<Client>{

	
	public  ArrayList<Client> findAll(){
		ArrayList<Client> tab = new ArrayList<Client>();

		try {
			Statement canal= (Statement) Connexionbd.con.createStatement();
			ResultSet res = canal.executeQuery("SELECT * FROM client");

			while(res.next()){
				int id = res.getInt("id");
				String a = res.getString("nom");
				Client cli = new Client(id,a);
				tab.add(cli);
				//System.out.println(a+""+p+""+id);
			}
		}catch (Exception e){
			System.out.println("probl�me");
		}

		return tab;


	}

	
	public  boolean insert(Client c){
		
		java.sql.Statement canal=null;
		Connexionbd cb = new Connexionbd();
		Connection con=cb.createConnexion();

		try {

			canal= con.createStatement();
			canal.executeUpdate("INSERT INTO `client` (`id`, `nom`) VALUES ('"+c.getId()+"', '"+c.getNom()+"');");
		}catch (Exception e){
			System.out.println("probl�me");
			e.printStackTrace();
			return false;
		}
		return true;


	}

	@Override
	public Client FindByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public  boolean delete(int id){
		try {
			Statement canal= (Statement) Connexionbd.con.createStatement();
			canal.executeUpdate("DELETE FROM `client` WHERE `client`.id="+id);

		}catch (Exception e){
			return false;

		}
		return true;
	}

}
