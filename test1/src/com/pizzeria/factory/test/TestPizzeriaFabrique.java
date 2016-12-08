package com.pizzeria.factory.test;
import com.pizzeria.factory.fabrique.FabriqueAlger;
import com.pizzeria.factory.pizza.Pizza;

public class TestPizzeriaFabrique {

	public static void main(String[] args) {

		
		Pizzeria p=new Pizzeria(new FabriqueAlger());
		Pizza pp=p.commanderPizza("fromage");
	}

}
