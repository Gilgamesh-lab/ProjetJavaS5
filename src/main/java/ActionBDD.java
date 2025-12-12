

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ActionBDD {

	/*public static void main(String[] args) {
		try {
			Connection conn = startBD();
			ArrayList<Programmeur> programmeurs =  recupProgrammeurs(conn);
			fermerConnexion(conn);
			
			
			System.out.println();
			System.out.println("Affichage de tous les programmeurs");
			System.out.println();
			
			for (Programmeur prog : programmeurs) {
				System.out.println(prog.toString());
			}
			
			System.out.println();
			System.out.println("Affichage de tous les programmeurs dont le nom n’est pas Simpson");
			System.out.println();
			
			for (Programmeur prog : programmeurs) {
				if(!prog.getNom().equalsIgnoreCase("Simpson")) {
					System.out.println(prog.toString());
				}
			}
			
		      
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	      
		catch (SQLException e) {
			e.printStackTrace();
		}

	}*/
	
	public static Connection startBD() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		Connection conn;
		conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projetjava","postgres","root");
		return conn;
	}
	
	public static ArrayList<Programmeur> recupProgrammeurs(Connection conn) throws SQLException{
		Statement stmt = conn.createStatement();
		ResultSet res = stmt.executeQuery("SELECT * FROM programmeur");
		ArrayList<Programmeur> programmeurs = new ArrayList<Programmeur>();
		while(res.next()) {
			programmeurs.add(new Programmeur(Integer.valueOf(res.getString(1)), res.getString(2), res.getString(3), res.getString(4), res.getString(5),
					res.getString(6), res.getString(7), Integer.valueOf(res.getString(8)) , Integer.valueOf(res.getString(9)) , Integer.valueOf(res.getString(10))));
		}
		conn.close();
		
		return programmeurs;
	}
	
	public static void fermerConnexion (Connection conn) throws SQLException{
		conn.close();
	}
		

}
