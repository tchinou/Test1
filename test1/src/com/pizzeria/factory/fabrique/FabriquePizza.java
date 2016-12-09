package com.pizzeria.factory.fabrique;

import com.pizzeria.factory.pizza.Pizza;
import com.pizzeria.factory.test.Pizzeria;

public interface FabriquePizza {
	
	public Pizza creerPizza(String type);
	public void insertPizzeria(int id, String pizzeria, String ville, double code);
	public void insertionPizzeria(Pizzeria pizzeria);

}
