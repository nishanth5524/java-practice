package SQL_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPS {
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
		
		Insertpassengerboardingdetails(password, password, "2021-09-21", password, password, 28, con);
	}
	public static int Insertpassengerboardingdetails(String pnr, String status, String depdate, String berth1,
			String pid, int id, Connection con) throws SQLException {
		PreparedStatement stmt = con.prepareStatement("insert into passengerboardingdetails values(?,?,?,?,?,?)");

		stmt.setString(1, pnr);
		stmt.setString(2, status);
		stmt.setString(3, depdate);
		stmt.setString(4, berth1);
		stmt.setString(5, pid);
		stmt.setInt(6, id);

		int rst = stmt.executeUpdate();
		return rst;
	}
	
}
