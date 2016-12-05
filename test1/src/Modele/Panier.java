package Modele;

import java.util.ArrayList;

public class Panier {
	
	private ArrayList<Produit> Panier = new ArrayList<Produit>();
	
	public  boolean add(Produit produit){
		return Panier.add(produit);
	}
	
	public double totalPanier(){
		double total =0;
		for(Produit produit : Panier)
			total=total + produit.getPrix();
		return total;	
		}

	public ArrayList<Produit> getPanier() {
		return Panier;
	}

	public void setPanier(ArrayList<Produit> panier) {
		Panier = panier;
		}

}
