package gestionMagasin;

public class Commande {
	private int idCommande;
	private Client client;
	private Panier produitsCommandes;
	private double total;
	private static int compteurId = 1;
	
	/**
	 * Constructeur de la classe Commande
	 * @param client client qui veut passer une commande
	 * @param produitsCommandes liste des produits présent dans le panier du client qui veut passer une commande
	 */
	public Commande(Client client, Panier produitsCommandes) {
		this.idCommande = compteurId;
		compteurId++;
		this.client = client;
		this.produitsCommandes = produitsCommandes;
		this.total = this.produitsCommandes.calculerTotal();
	}

	/***
	 * Constructeur naturel (naturel) de la classe commande
	 */
	public void afficherDetailsCommande() {
		System.out.println("Commande [idCommande=" + idCommande + ", " + ", total=" + total + "]");
		this.client.afficherDetails();
		this.produitsCommandes.afficherPanier();
	}
	
	
	
	

}
