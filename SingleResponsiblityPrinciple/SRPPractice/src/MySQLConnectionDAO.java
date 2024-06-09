import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnectionDAO {

	public static Connection getConneciton() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("JDBC Driver success.");
		} catch (Exception e) {
			System.out.println("Error when jdbc driver register.");
		}
		Connection c = null;
		try {
			String url = "jdbc:mysql://localhost:3306/SimpleDB";
			String user = "root";
			String password = "root@123";
			c = DriverManager.getConnection(url, user, password);
			return c;
		} catch (Exception e) {
			System.out.println("Error when connect to school db.");

		}
		if (c != null) {
			System.out.println("Connection successed.You make it and take control your database.");
		} else {
			System.out.println("Can't connect to your database.Check your database Connection.");
		}
		System.out.println("JDBC Action is completed.");
		return null;
	}
}
