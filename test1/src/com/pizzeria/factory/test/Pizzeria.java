package com.pizzeria.factory.test;
import  com.pizzeria.factory.fabrique.FabriquePizza;
import  com.pizzeria.factory.pizza.Pizza;

public class Pizzeria {
	
	private FabriquePizza fabrique;

	public Pizzeria() {
		super();
	}

	public Pizzeria(FabriquePizza fabrique) {
		super();
		this.fabrique = fabrique;
	}
	
	public Pizza commanderPizza(String type){
		
		Pizza p=fabrique.creerPizza(type);
		p.preparer();
		p.cuire();
		p.decouper();
		p.emballer();
		return p;
		
	}
}
