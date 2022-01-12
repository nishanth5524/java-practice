package SQL_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;

public class Products {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/optimization";
		String username = "nishanth";
		String password = "Nishanth@5524";

		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("Database Connected successfully");
		} else {
			System.out.println("Database Connection failed");
		}

		Statement stmt = con.createStatement();
//		create table Product(id int, Name varchar(100), Description varchar(200));

		
		for (int i = 1; i <= 10000000; i++) {

			String sql = "insert into Product(id, name, description) values('"+ i + "','Product - " + i + "','Product -" + i + " Description');";

			stmt.executeUpdate(sql);

		}
	}
	
	
}
