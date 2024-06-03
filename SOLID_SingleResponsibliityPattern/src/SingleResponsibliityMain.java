import java.util.List;

public class SingleResponsibliityMain {
	public static void main(String[] args) {
		UserDAO userDao = new UserDAO();
		List<User> users = userDao.Select();
		for (User u : users) {
			System.out.println(u);
		}
	}
}
