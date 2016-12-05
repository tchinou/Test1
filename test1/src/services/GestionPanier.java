package services;

import java.util.ArrayList;

import Modele.*;

public interface GestionPanier {
	
	boolean insertProduit(Produit produit);
	boolean deleteProduit(Produit produit);
	Panier findAll();
	Produit findbynom(String nom);
	int total();
	int findPrix(String nom);
	

}
