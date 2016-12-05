package dao;

import Modele.Client;
import Modele.Produit;

public class Test {

	public static void main(String[] args) {
		ProduitDao condd = new ProduitDao();
		ClientDao c=new ClientDao();
		condd.insert (new Produit(1,"jhsdjshd",28));

		c.insert(new Client(6,"lkolo"));

		
		c.delete(43);
		condd.delete(12);

	}

}






