package Modele;

public class Produit {
	
	public Produit(String a, double p, int id2) {
		super();
		// TODO Auto-generated constructor stub
	}

	private String nom;
	private double prix;
	private int id;
	
	public Produit(int id, String nom, int prix) {
		super();
		this.id=id;
		this.nom = nom;
		this.prix = prix;
	}

	public Produit() {
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
