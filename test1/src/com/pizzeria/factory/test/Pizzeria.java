package com.pizzeria.factory.test;
import  com.pizzeria.factory.fabrique.FabriquePizza;
import  com.pizzeria.factory.pizza.Pizza;

public class Pizzeria {
	
	int id;
	String nom, ville;
	int code;
	
	private FabriquePizza fabrique;
	
	public Pizzeria(int id, String nom, String ville, int code) {
		super();
		this.id=id;
		this.nom=nom;
		this.ville=ville;
		this.code=code;
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

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getVille() {
		return ville;
	}

	public int getCode() {
		return code;
	}

	public FabriquePizza getFabrique() {
		return fabrique;
	}

	
}
