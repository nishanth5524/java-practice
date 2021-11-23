package SQL_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/train_ticket_booking_system";
		String username = "nishanth";
		String password = "Nishanth@5524";

		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("Database Connected successfully");
		} else {
			System.out.println("Database Connection failed");
		}

		String str = "T120210915";

		String result = null;

		Statement stmt = con.createStatement();
		ResultSet rs = stmt
				.executeQuery("select CID from " + str + " where status = 'tatkal' ORDER BY CID LIMIT 1");
		while (rs.next()) {
			result = rs.getString(1);
		}
		stmt.executeUpdate("update " + str + " set status = 'confirm' where CID ='"+result+"'");

	}
}
