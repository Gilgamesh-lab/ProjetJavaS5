package gestionMagasin;

public class Client {

	private int id;
	private String nom;
	private String email;
	
	/**
	 * Constructeur naturel (naturel) de la classe Client
	 * @param id L'id du client
	 * @param nom Le nom du client
	 * @param email L'email du client
	 */
	public Client(int id, String nom, String email) {
		this.id = id;
		this.nom = nom;
		this.email = email;
	}

	/**
	 * getter de l'attribut id
	 * @return l'id du client
	 */
	public int getId() {
		return id;
	}

	/**
	 * setter de l'attribut id
	 * @param id le nouveau id du client
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * getter de l'attribut nom
	 * @return le nom du client
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * setter de l'attribut nom
	 * @param nom le nouveau nom du client
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * getter de l'attribut email
	 * @return l'email du client
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * setter de l'attribut email
	 * @param email le nouveau email du client
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * affiche tout les atttributs du client
	 */
	public void afficherDetails() {
		System.out.println("Client [id = " + id + ", nom = " + nom + ", email = " + email + "]");
	}
	
	
	
}
