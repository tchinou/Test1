package com.boukhedouma.poo.serieOne;

import java.util.Scanner;

public class Ouvrage {

	 static String Reference;
	 static String Titre;
	 static String NomAuteur;
	 static int AnneEdition;

	public Ouvrage(){
	
		}

	public Ouvrage(String Reference, String Titre, String NomAuteur, int AnneEdition) {

		Reference = this.Reference;
		Titre = this.Titre;
		NomAuteur = this.NomAuteur;
		AnneEdition = this.AnneEdition;
	} 

	public static Ouvrage Saisie(){
		
		Scanner e = new Scanner(System.in);
		
		new Ouvrage();
		
		System.out.println("Saisissez la référence");
				
		Reference=e.next();
		
		System.out.println("Saisissez le titre");
		
		Titre=e.next();

		System.out.println("Saisissez le nom d'auteur");
		
		NomAuteur=e.next();

		System.out.println("Saisissez l'année d'édition");

		AnneEdition=e.nextInt();
		
		System.out.println("Saisissez un nouvel objet ");
		
		return new Ouvrage(Reference, Titre, NomAuteur, AnneEdition);
		
	}
	

	public void setReference(String reference) {
		Reference = reference;
	}



	public void setNomAuteur(String nomAuteur) {
		NomAuteur = nomAuteur;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}

	public int getAnneEdition() {
		return AnneEdition;
	}

	public void setAnneEdition(int anneEdition) {
		AnneEdition = anneEdition;
	}
	
	public void AfficherTitre(){
		System.out.println("Titre" + " : " +Titre);
		
	}

	@Override
	public String toString() {
		return "Ouvrage [Reference=" + Reference + ", Titre=" + Titre + ", NomAuteur=" + NomAuteur + ", AnneEdition="
				+ AnneEdition + "]";
	}

}
