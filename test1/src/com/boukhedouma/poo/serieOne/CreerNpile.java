package com.boukhedouma.poo.serieOne;

public class CreerNpile {

	public static void main(String[] args) {

		Pile p = new Pile(10);
		
		
		if(p.isEmpty())
			System.out.println("La pile est vide");
		
		else System.out.println("la pile n'est pas vide");
		
		
		p.push("10");
		
		p.push("15");
		
		p.peek();
		p.push("20");
		p.push("30");

		p.push("40");

		p.push("50");

		p.push("60");
		

		p.push("70");

		p.push("80");

		p.push("90");
		
		p.ElementTetePile();
		
		p.pop();
		
		p.displayTheStack();
	}

}
