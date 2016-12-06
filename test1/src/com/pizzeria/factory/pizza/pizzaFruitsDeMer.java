package com.pizzeria.factory.pizza;

public class pizzaFruitsDeMer extends Pizza{

	@Override
	public void decouper() {
		System.out.println("Decoupage classique");		
	}

	@Override
	public void preparer() {
		System.out.println("Préparation rapide en quelques minutes");		
	}

	@Override
	public void cuire() {

		System.out.println("Cuisson en 7 minutes chrono");		

	}

	@Override
	public void emballer() {	
		
		System.out.println("Emballage pour livraison");		

	
	}

}
