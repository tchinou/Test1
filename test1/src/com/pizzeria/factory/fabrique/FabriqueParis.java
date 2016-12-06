package com.pizzeria.factory.fabrique;

import com.pizzeria.factory.pizza.Pizza;
import com.pizzeria.factory.pizza.pizzaFromage;
import com.pizzeria.factory.pizza.pizzaFruitsDeMer;

public class FabriqueParis implements FabriquePizza{

	public Pizza creerPizza(String type) {
			Pizza p=null;
			if(type.equals("fromage"))
				p=new pizzaFromage();
			else if(type.equals("fruits"))
				p=new pizzaFruitsDeMer();
		return p;
	}

}
