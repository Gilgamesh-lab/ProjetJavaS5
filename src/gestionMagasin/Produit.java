package gestionMagasin;

import java.util.Objects;

public class Produit {
	private int id;
	private String nom;
	private double prix;
	private int quantité;
	
	/**
	 * Constructeur naturel (naturel) de la classe  Produit
	 * @param id L'id du produit
	 * @param nom Le nom du produit
	 * @param prix Le prix du produit
	 * @param quantité La quantité du produite
	 */
	public Produit(int id, String nom, double prix, int quantité) {
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.quantité = quantité;
	}
	
	/**
	 * getter de l'attribut id
	 * @return l'id du produit
	 */
	public int getId() {
		return id;
	}

	/**
	 * setter de l'attribut id
	 * @param id le nouveau id du produit
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * getter de l'attribut nom
	 * @return le nom du produit
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * setter de l'attribut nom
	 * @param nom le nouveau nom du produit
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * getter de l'attribut prix
	 * @return le prix du produit
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * setter de l'attribut prix
	 * @param prix le nouveau prix du produit
	 */
	public void setPrix(float prix) {
		this.prix = prix;
	}

	/**
	 * getter de l'attribut quantité
	 * @return la quantité du produit
	 */
	public int getQuantité() {
		return quantité;
	}

	/**
	 * setter de l'attribut quantité
	 * @param quantité la nouvelle quantité du produit
	 */
	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}

	/**
	 * affiche tout les atttributs du produit
	 */
	public void afficherDetails() {
		System.out.println("Produit [id = " + id + ", nom = " + nom + ", prix = " + prix + ", quantité = " + quantité + "]"); 
	}

	/**
	 * Définit le hash de la classe produit
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id, nom, prix, quantité);
	}

	/**
	 * Définit si deux produits sont les mêmes.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produit other = (Produit) obj;
		return id == other.id && Objects.equals(nom, other.nom)
				&& Double.doubleToLongBits(prix) == Double.doubleToLongBits(other.prix) && quantité == other.quantité;
	}

	
	
	
	
	
	
	
	

}
