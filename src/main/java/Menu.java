import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	
	
	public Menu() {
		
	}
	
	
	public void menu() throws ClassNotFoundException, SQLException {
		
		ArrayList<Programmeur> programmeurs;
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
			Connection conn = ActionBDD.startBD();
			switch(action) {
				case 1 :
					System.out.println("choix 1");
					programmeurs = ActionBDD.recupProgrammeurs(conn);
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
					scMenue.close();
					ActionBDD.fermerConnexion(conn);
					break;
					
				default :
					System.out.println("ERREUR! Veuillez saisir un nombre entre 1 et 6.");
			}
		}
			
	}
	
}
