import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

	public Connection getConnection() {
		return MySQLConnectionDAO.getConneciton();
	}

	public List<User> Select() {
		String sql = "SELECT * FROM USER";
		List<User> users=new ArrayList<>();
		try {
			System.out.println("Reterived process start ");
			Statement stmt = getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String userId = rs.getString("UserId");
				String userName = rs.getString("UserName");
				String Email = rs.getString("Email");
				String FullName = rs.getString("FullName");
				User u=new User(userId,userName,Email,FullName);
				users.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
}
