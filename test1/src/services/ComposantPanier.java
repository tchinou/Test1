package services;

import java.util.ArrayList;

import dao.*;
import Modele.*;


public class ComposantPanier implements GestionPanier{

	Panier panier = new Panier();
	ProduitDao produitdao = new ProduitDao();


	@Override
	public boolean insertProduit(Produit produit) {		
		produitdao.insert(produit);		
		return false;
	}

	@Override
	public boolean deleteProduit(Produit produit) {
		produitdao.delete(produit.getId());
		return false;
	}

	@Override
	public Panier findAll() {
		panier.setPanier(produitdao.findAll());
				
		return panier;
	}

	//@Override
	//public Produit findbynom(String nom) {		
		//return produitdao.findbynom(nom);		
	//}

	@Override
	public int total() {
		int s=0;
		Panier pe=new Panier();
		pe=this.findAll();
		for (Produit p:pe.getPanier())
			s=(int) (s+p.getPrix());
		return s;
	}

	@Override
	public int findPrix(String nom) {
		return (int) produitdao.findbyprix(nom);
	}

	@Override
	public Produit findbynom(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
