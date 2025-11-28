import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	
	
	public Menu() {
		
	}
	
	
	public void menu() {
		
		ArrayList<Programmeur> programmeurs = new ArrayList<Programmeur>();
		programmeurs.add(new Programmeur("Torvalds", "Linus", "2 avenue Linux Git", "linuxroot", "Didier Achvar", "Salsa", 1969, 50.0, 2170.0));
		programmeurs.add(new Programmeur("Stroustrup", "Bjarne", "294 rue C++", "c++1", "Karim Lahlou", "Voyages", 1950, 80.0, 2466.0));
		programmeurs.add(new Programmeur("Gosling", "James", "3 bvd JVM", "javapapa", "Jacques Augustin", "Peinture", 1955, 10.0, 1987.0));
		
		boolean continuer = true;
		while (continuer) {
			System.out.println("");
			System.out.println("");
			System.out.println("<<<<<<<  MENU   >>>>>>>>");
			System.out.println("");
			System.out.println("1. Afficher tous les programmeurs");
			System.out.println("2. Afficher un programmeur");
			System.out.println("3. Supprimer un programmeur");
			System.out.println("4. Ajouter un programmeur");
			System.out.println("5. Modifier un salaire");
			System.out.println("6. Quitter");
			System.out.println("");
			System.out.println("");
			System.out.println("Quel est votre choix ?");
			

			Scanner scMenue = new Scanner(System.in);
			int action = scMenue.nextInt();
			
			switch(action) {
				case 1 :
					System.out.println("choix 1");
					programmeurs.forEach(programmeur -> programmeur.afficher());
					break;
					
				case 2 :
					System.out.println("choix 2");
					break;
					
				case 3 :
					System.out.println("choix 3");
					break;
					
				case 4 :
					System.out.println("choix 4");
					break;
					
				case 5 :
					System.out.println("choix 5");
					
				case 6 :
					System.out.println("choix 6");
					continuer = false;
					System.out.println("Au revoir :)");
					break;
					
				default :
					System.out.println("ERREUR! Veuillez saisir un nombre entre 1 et 6.");
			}
		}
			
	}
	
}
