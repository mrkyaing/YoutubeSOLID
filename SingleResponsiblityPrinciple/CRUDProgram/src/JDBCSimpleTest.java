import java.sql.*;

public class JDBCSimpleTest {

	public static void main(String[] args) {
		
		System.out.println("JDBC Action is started.");
		System.out.println("MySQL JDBC Connection is testing demo.");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("JDBC Driver success.");
		}catch(Exception e) {
			System.out.println("Error when jdbc driver register.");
		}
		Connection c=null;
		try {
			String url="jdbc:mysql://localhost:3306/SimpleDB";
			String user="root";
			String password="root@123";
			c=DriverManager.getConnection(url,user,password);
			//Create(c);
			Select(c);
			//Update(c);
			//Delete(c);
		}catch(Exception e) {
			System.out.println("Error when connect to school db.");
		}
		if(c!=null) {
			System.out.println("Connection successed.You make it and take control your database.");
		}
		else {
			System.out.println("Can't connect to your database.Check your database Connection.");
		}
		System.out.println("JDBC Action is completed.");
	}

	public static void Create(Connection con) {
		String sql="INSERT INTO User(UserName,Password,Email,FullName) values(?,?,?,?)";
		try {
			System.out.println("Create process start ");
			PreparedStatement pstmt=con.prepareCall(sql);
			pstmt.setString(1,"user3");
			pstmt.setString(2,"p@ssw0rd");
			pstmt.setString(3,"user3@google.com");
			pstmt.setString(4,"Mr Kyaing");
			int effectedRows=pstmt.executeUpdate();
			if(effectedRows>0) {
				System.out.println(effectedRows+" (s) is effected");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Select(Connection con) {
		String sql="SELECT * FROM USER";
		try {
			System.out.println("Reterived process start ");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			int count=0;
			while(rs.next()) {
				count++;
				String userName=rs.getString("UserName");
				String Email=rs.getString("Email");
				String FullName=rs.getString("FullName");
				String output="User:%d:%s%s%s";
				System.out.println(String.format(output,count,userName,Email,FullName ));
			}
			System.out.println("Total User:"+count);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Update(Connection con) {
		String sql="UPDATE USER SET UserName=? WHERE UserId=?";
		try {
			System.out.println("Update process start");
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1,"User5");
			pstmt.setString(2,"5");
			int effectedRows=pstmt.executeUpdate();
			if(effectedRows>0) {
				System.out.println(effectedRows+" is updated.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Delete(Connection con) {
		String sql="DELETE FROM USER WHERE UserId=?";
		try {
			System.out.println("Delete process start");
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,4);
			int effectedRows=pstmt.executeUpdate();
			if(effectedRows>0) {
				System.out.println(effectedRows+" is DELETED.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
