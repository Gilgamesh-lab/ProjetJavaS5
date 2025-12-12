import java.sql.SQLException;

public class Start {

	public static void main(String[] args) {
		Menu menu = new Menu();
		try {
			menu.menu();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
