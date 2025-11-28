import java.util.Objects;

public class Programmeur  {
	private static int compteurId = 1;
	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private String pseudo;
	private String hobby;
	private int naissance;
	private float prime;
	private float salaire;
	
	
	
	
	
	public Programmeur() {
		this.id = compteurId;
		compteurId++;
	}
	
	public Programmeur( String nom, String prenom) {
		this.id = compteurId;
		compteurId++;
		this.nom = nom;
		this.prenom = prenom;
	}

    public Programmeur( String nom, String prenom, String adresse, String pseudo, String hobby, int naissance,
			float prime, float salaire) {
    	this.id = compteurId;
		compteurId++;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.pseudo = pseudo;
		this.hobby = hobby;
		this.naissance = naissance;
		this.prime = prime;
		this.salaire = salaire;
	}






	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public String getNom() {
		return nom;
	}






	public void setNom(String nom) {
		this.nom = nom;
	}






	public String getPrenom() {
		return prenom;
	}






	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}






	public String getAdresse() {
		return adresse;
	}






	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}






	public String getPseudo() {
		return pseudo;
	}






	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}






	public String getHobby() {
		return hobby;
	}






	public void setHobby(String hobby) {
		this.hobby = hobby;
	}






	public int getNaissance() {
		return naissance;
	}






	public void setNaissance(int naissance) {
		this.naissance = naissance;
	}






	public float getPrime() {
		return prime;
	}






	public void setPrime(float prime) {
		this.prime = prime;
	}






	public float getSalaire() {
		return salaire;
	}






	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}






	






	@Override
	public int hashCode() {
		return Objects.hash(adresse, id, naissance, nom, prenom, pseudo);
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Programmeur other = (Programmeur) obj;
		return Objects.equals(adresse, other.adresse) && id == other.id && naissance == other.naissance
				&& Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom)
				&& Objects.equals(pseudo, other.pseudo);
	}






	@Override
	public String toString() {
		return "Programmeur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", pseudo="
				+ pseudo + ", hobby=" + hobby + ", naissance=" + naissance + ", prime=" + prime + ", salaire=" + salaire
				+ "]";
	}

	
	
	
	
	
	
	
	
	
	

}
