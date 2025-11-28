package gestionMagasin;

import java.util.ArrayList;

public class Magasin {

	private ArrayList<Produit> produits;
	
	/**
	 * Constructeur sans paramètre de la classe Magasin
	 */
	public Magasin() {
		this.produits = new ArrayList<Produit>();
	}
	
	/**
	 * Ajouter un produit dans le magasin
	 * @param produit produit à ajouter
	 */
	public void ajouterproduit(Produit produit) {
		this.produits.add(produit);
	}

	/**
	 * Affiche les produits disponibles
	 */
	public void afficherProduitsDisponible() {
		this.produits.stream().filter(produit->produit.getQuantité() > 0).forEach(produit -> produit.afficherDetails());
	}
	
	/**
	 * Trouve un produit grâce à son nom (supporte la casse)
	 * @param nom du produit à chercher
	 * @return le produit trouver
	 */
	public Produit trouverProduitParNom(String nom) {
		return this.produits.stream().filter(produit->produit.getNom().equalsIgnoreCase(nom) && produit.getQuantité() > 0).findFirst().get();
	}

	
	
	
}
