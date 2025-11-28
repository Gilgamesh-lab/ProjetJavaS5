import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	
	
	public Menu() {
		
	}
	
	
	public void menu() {
		
		ArrayList<Programmeur> programmeurs = new ArrayList<Programmeur>();
		programmeurs.add(new Programmeur("Test", "test", "6 rue Bernard", "Te", "Macron", "foot", 1986, 500, 2000));
		programmeurs.add(new Programmeur("Hey", "Salut", "7 rue André", "Hello", "Chef", "Poker", 1986, 500, 2000));
		
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
			System.out.println("6. Afficher la liste des projets (Intitulé, Date de début, Date de fin prévue, Etat, …)");
			System.out.println("7. Obtenir la liste des programmeurs qui travaillent sur le même projet");
			System.out.println("8. Quitter");
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
					break;
				
				case 6 :
					System.out.println("choix 6");
					break;
					
				case 7 :
					System.out.println("choix 7");
					break;
					
				case 8 :
					System.out.println("choix 8");
					continuer = false;
					System.out.println("Au revoir :)");
					break;
			}
		}
			
	}
	
}
