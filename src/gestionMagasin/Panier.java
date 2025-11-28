package gestionMagasin;

import java.util.ArrayList;

public class Panier {
	private ArrayList<Produit> produits;

	/**
	 * Constructeur sans paramètre de la classe Panier
	 */
	public Panier() {
		this.produits = new ArrayList<Produit>();
	}
	
	/**
	 * Ajoute un produit au panier si sa quantité n'est pas épuisé
	 * @param produit le produit à ajouter au panier
	 */
	public void ajouterProduit(Produit produit) {
		if(produit.getQuantité() > 0) {
			this.produits.add(produit);
			produit.setQuantité(produit.getQuantité() - 1);
		}
		else {
			System.out.println("Il n'y a plus d'exemplaire de " + produit.getNom());
		}
		
	}
	
	
	/**
	 * renvoie les produits contenues dans le panier
	 * @return une ArrayList de produit
	 */
	public ArrayList<Produit> getProduits() {
		return produits;
	}

	/**
	 * supprime un produit du panier
	 * @param produit le produit à supprimer
	 */
	public void supprimerProduit(Produit produit) {
		this.produits.remove(produit);
		produit.setQuantité(produit.getQuantité() + 1);
	}

	/**
	 * Affiche les produits présent dans le panier
	 */
	public void afficherPanier() {
		this.produits.stream().forEach(produit -> produit.afficherDetails());
	}
	
	/**
	 * Calcule le prix total des produits présent dans le panier 
	 * @return le prix total
	 */
	public double calculerTotal() {
		return this.produits.stream().map(produit -> produit.getPrix()).reduce((prix1, prix2) -> prix1 + prix2).get();
	}
	
	
	

}
