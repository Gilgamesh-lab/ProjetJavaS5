package gestionMagasin;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Client client = new Client(1, "Marc", "Marc@gmail.com");
		Magasin magasin = new Magasin();
		
		Produit jusDePomme = new Produit(1, "Jus de pomme", 2.55, 3);
		Produit pates = new Produit(2, "Pâtes", 1.95, 5);
		Produit riz = new Produit(3, "Riz", 3.17, 7);
		Produit oranges = new Produit(4, "Oranges", 2.89, 2);
		Produit bouteilleDEau = new Produit(5, "Bouteille d'eau", 1.14, 10);
		Produit yaourt = new Produit(6, "yaourt", 4.29, 1);
		
		magasin.ajouterproduit(jusDePomme);
		magasin.ajouterproduit(pates);
		magasin.ajouterproduit(riz);
		magasin.ajouterproduit(oranges);
		magasin.ajouterproduit(bouteilleDEau);
		magasin.ajouterproduit(yaourt);
		
		boolean continuer = true;
		Scanner scMenue = new Scanner(System.in);
		Scanner scAjout = new Scanner(System.in);// https://www.w3schools.com/java/java_user_input.asp
		Panier panier = new Panier();
		while (continuer) {
			System.out.println("--- Menu Magasin ---");
			System.out.println("      1. Afficher les produits disponibles");
			System.out.println("      2. Ajouter un produit au panier");
			System.out.println("      3. Afficher le panier");
			System.out.println("      4. Passer la commande");
			System.out.println("      5. Quitter");
			int action = scMenue.nextInt();
			
			System.out.println("");
			switch(action) {
				case 1 :
					magasin.afficherProduitsDisponible();
					break;
					
				case 2 :
					System.out.print("Veuillez entrer le nom du produit : ");
					String nomProduit = scAjout.nextLine();
					try {
						panier.ajouterProduit(magasin.trouverProduitParNom(nomProduit));
						System.out.println("Le produit " + nomProduit + " a bien été ajouté à votre panier");
					}
					
					catch (NoSuchElementException e) {
						System.out.println("Le produit " + nomProduit + " que vous avez sélectionner n'a pas pu être trouver, veuillez vérifier son ortographe ou/et sa disponibilité ");
					}
					System.out.println("");
					break;
					
				case 3 :
					if(panier.getProduits().size() <= 0) {
						System.out.println("Votre panier est vide :(");
					}
					else {
						panier.afficherPanier();
					}
					System.out.println("");
					break;
					
				case 4 :
					if(panier.getProduits().size() <= 0) {
						System.out.println("Votre panier est vide, impossible de passer une commande :(");
					}
					else {
						Commande commande = new Commande(client, panier);
						commande.afficherDetailsCommande();
					}
					System.out.println("");
					break;
					
				case 5 :
					continuer = false;
					System.out.println("Au revoir et merci de votre visite :)");
					break;
			}
				
		}
		

	}

}
