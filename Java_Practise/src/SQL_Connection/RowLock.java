package SQL_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RowLock {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/train";
		String username = "nishanth";
		String password = "Nishanth@5524";

		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("Database Connected successfully");
		} else {
			System.out.println("Database Connection failed");
		}
		
		System.out.println(fun(con));
	}
	public static int fun(Connection con) throws SQLException {
		PreparedStatement stmt = con.prepareStatement("select credits from signup WITH (ROWLOCK) where email = ? and phonenum = ?");
	        
		stmt.setString(1, "nishanth5524@gmail.com");
		stmt.setString(2, "7010107474");

		ResultSet rs = stmt.executeQuery();

		int credits = 0;

		while (rs.next()) {
			credits = rs.getInt(1);
		}
		return credits;
	}
}
