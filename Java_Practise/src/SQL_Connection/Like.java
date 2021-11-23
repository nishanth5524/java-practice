package SQL_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Like {

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
		
		Statement stmt2 = con.createStatement();
		
		ResultSet rs1 = stmt2.executeQuery("select pnr from passengerboardingdetails where status = 'waiting' and pid LIKE '"+tno+"%'  and depdate ='" + date + "' ORDER BY pnr LIMIT 1");
		while (rs1.next()) {
			String result1 = rs1.getString(1);
			System.out.println(result1);
		}
		
		
	}
}
