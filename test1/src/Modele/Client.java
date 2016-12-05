package Modele;



public class Client {
	
	private String nom;
	private int id;
	
	public Client(int id2, String a) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String nom) {
		super();
		this.nom = nom;
	}

	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}


