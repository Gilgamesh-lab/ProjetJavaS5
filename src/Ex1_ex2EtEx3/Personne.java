package Ex1_ex2EtEx3;
import java.time.LocalDate;

public class Personne {
	private String nom;
	private String prenom;
	private int anNaissance; 
	private static int nbObjetCreer = 0;
	
	/**
	 * Constructeur naturel (complet) de la classe personne
	 * @param nom de la personne
	 * @param prenom de la personne
	 * @param anNaissance : année de naissance de la personne
	 */
	public Personne(String nom, String prenom, int anNaissance){
		this.nom = nom;
		this.prenom = prenom;
		this.anNaissance = anNaissance;
		nbObjetCreer++;
	}
	
	/**
	 * Constructeur de la classe personne sans le nom de famille de la personne
	 * @param prenom de la personne
	 * @param anNaissance : année de naissance de la personne
	 */
	public Personne(String prenom, int anNaissance){
		this.nom = "Inconnu";
		this.prenom = prenom;
		this.anNaissance = anNaissance;
		nbObjetCreer++;
	}
	
	/**
	 * Constructeur sans paramètre de la classe personne
	 */
	public Personne(){
		this("Potter", "Harry", 1980);
	}
	
	/**
	 * getter de l'attribut nom
	 * @return nom de la personne
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * getter de l'attribut prenom
	 * @return prénom de la personne
	 */
	public String getPrenom() {
		return this.prenom;
	}
	
	/**
	 * getter de l'attribut anNaissance
	 * @return l'année de naissance de la personne
	 */
	public int getAnNaissance() {
		return this.anNaissance;
	}
	
	/**
	 * setter de l'attribut nom
	 * @param nom de la personne
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * setter de l'attribut prénom
	 * @param prenom de la personne
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * setter de l'attribut anNaissance
	 * @param anNaissance : année de naissance de la personne
	 */
	public void setAnNaissance(int anNaissance) {
		this.anNaissance = anNaissance;
	}

	/**
	 * Calcule l'age d'une personne en se basant sur son année de naissance
	 * @return l'age de la personne
	 */
	public int calculerAge() {
		int current_Year = LocalDate.now().getYear(); // source https://www.delftstack.com/fr/howto/java/current-year-in-java/
		return current_Year - anNaissance;
	}
	
	/**
	 * Afficher les informations d'une personnes
	 */
	public void afficherInfos() {
		System.out.println("Nom: " + this.nom);
		System.out.println("Prénom: " + this.prenom);
		System.out.println("Âge: " + this.calculerAge());
	}
	
	/**
	 * Affiche un message pour manger un aliment
	 * @param aliment à manger
	 */
	public void mange(String aliment) {
		System.out.println(this.nom + " " + this.prenom + " mange un/une " + aliment);
	}
	
	/**
	 * Affiche le nombre de personne qui ont été crée
	 */
	public void afficherNbPers() {
		System.out.println(nbObjetCreer + " personnes ont été créé");
	}
	
	
	
	

}
