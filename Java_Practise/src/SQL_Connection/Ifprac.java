package SQL_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ifprac {
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
		
		String result = null;
		Statement stmt = con.createStatement();
		ResultSet resultSet = stmt.executeQuery("select status from T120210915 where CID = 'T120210915TR42'");

		if (!resultSet.next()) {
			System.out.println("Ticket Not Found");
			System.exit(0);
		} else {

			System.out.println("In do while");

			do {
				result = resultSet.getString(1);
				System.out.println(result);
			} while (resultSet.next());
		}
		
		if(result == "confirm")
		{
			System.out.println("confirm");
		}
		
		else if(result == "waiting")
		{
			System.out.println("waiting");
		}
	}
}
