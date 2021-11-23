package SQL_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LikePS {

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
		
		String tno ="12163";
		String date = "2021-09-20";
		
		String pnr = null;
		PreparedStatement stmt = con.prepareStatement(
				"select pnr from passengerboardingdetails where status = 'waiting' and pid LIKE ? and depdate = ? ORDER BY pid LIMIT 1");

		stmt.setString(1, tno+"%");
		stmt.setString(2, date);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {

			pnr = rs.getString(1);
		}
		
		System.out.println(pnr);
	}
}
