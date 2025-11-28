package Ex1_ex2EtEx3;

import java.util.ArrayList;

public class main {
	
	public static void main(String[] args) {
		Personne personne1 = new Personne("Arthur", "Eracle",2004);
		Personne personne2 = new Personne("Marc", "Dupont",1978);
		Personne personne3 = new Personne("Alice", "Léonard",1959);
		Personne personne4 = new Personne("Emmel", "Nimmul",1996);
		
		System.out.println(personne1.getNom()); 
		System.out.println(personne1.getPrenom());
		System.out.println(personne1.getAnNaissance());
		
		personne2.setPrenom("Sol");
		personne2.setNom("Nova");
		personne2.setAnNaissance(1995);
		
		personne3.mange("pomme");
		System.out.println(personne3.calculerAge());
		
		personne4.afficherInfos();
		personne4.afficherNbPers();
		
		System.out.println(isBissextile(personne3.getAnNaissance())); 
		System.out.println(isBissextile(personne4.getAnNaissance())); 
		
		afficherNombrePremier(97);
		
		Personne personne5 = new Personne("Anna",2002);
		System.out.println(isPalindrome(personne5.getNom())); 
		System.out.println(isPalindrome(personne5.getPrenom())); 
		System.out.println(isPalindrome(Integer.toString(personne5.getAnNaissance()))); 
	}
	
	/**
	 * Détermine si une année est bissextile
	 * @param annee à vérifier
	 * @return true si une année est bissextile false sinon
	 */
	public static boolean isBissextile(int annee) {
		return annee % 4 == 0 && annee % 100 != 0;
	}
	
	/**
	 * Affiche tout les nommbres premiers inférieur à une année de naissance
	 * @param anNaissance : annéee de naissance qui vas servir de référence
	 */
	public static void afficherNombrePremier(int anNaissance) {
		for (int i = 1 ; i <= anNaissance ; i++) {
			ArrayList<Integer> tab = new ArrayList<Integer>();
			for (int k = 1 ; k <= i ; k++) {
				if(i % k == 0) {
					tab.add(k);
				}
			}
			if(tab.size() == 2) {
				if(tab.get(0) == 1 && tab.get(1) == i) {
					System.out.println(i);
				}
			}
			
		}
	}
	
	/**
	 * Détermine si un mot est un palindrome (supporte la casse)
	 * @param mot à vérifier
	 * @return true si un mot est un palindrome false sinon
	 */
	public static boolean isPalindrome(String mot) {
		mot = mot.toLowerCase();
		if(mot.length() % 2 == 1) {
			return false;
		}
		String premierePartie = mot.substring(0, mot.length() / 2);
		String deuxiemePartie = mot.substring(mot.length() / 2, mot.length());
		
		for (int i = 0 ; i < mot.length() / 2; i++) {
			if(premierePartie.charAt(i) != deuxiemePartie.charAt(deuxiemePartie.length() -1 -i)) {
				return false;
			}
		}
		return true;
		
	}

}
