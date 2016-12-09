package com.pizzeria.factory.fabrique;

import java.sql.Connection;

import com.pizzeria.factory.pizza.Pizza;
import com.pizzeria.factory.pizza.pizzaFromage;
import com.pizzeria.factory.pizza.pizzaFruitsDeMer;
import com.pizzeria.factory.test.Pizzeria;

import dao.Connexionbd;

public class FabriqueParis implements FabriquePizza{

	public Pizza creerPizza(String type) {
			Pizza p=null;
			if(type.equals("fromage"))
				p=new pizzaFromage();
			else if(type.equals("fruits"))
				p=new pizzaFruitsDeMer();
		return p;
		
		
	}

	@Override
	public void insertPizzeria(int id, String pizzeria, String ville, double code) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertionPizzeria(Pizzeria pizzeria) {
		
		
		java.sql.Statement canal=null;
		Connexionbd cb = new Connexionbd();
		Connection con=cb.createConnexion();
		try {

			canal= con.createStatement();


			canal.executeUpdate("INSERT INTO `pizzeria` (`id`, `nom`, `ville`, `code`) "
					+ "VALUES ('"+pizzeria.getId()+"', '"+pizzeria.getNom()+"', '"+pizzeria.getVille()+"', '"+pizzeria.getCode()+"');");

		}
		catch (Exception e){
			System.out.println("probl�me");
			e.printStackTrace();
			
		}
		
	}
}
