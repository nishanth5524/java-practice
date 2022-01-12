package SQL_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;

public class ProductSales {

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

		Random r = new Random();

		Statement stmt = con.createStatement();
//		create table ProductSales(id int, ProductID int, UnitPrice int, QuantitySold int);
		for (int i = 1; i <= 100000; i++) {

			int pid = r.nextInt(10000000) + 1;
			int unitprice = r.nextInt(100) + 1;
			int quantity = r.nextInt(10) + 1;

			String sql = "insert into ProductSales(id, productid, UnitPrice, QuantitySold) values('" + i + "','" + pid
					+ "','" + unitprice + "','"+quantity+"');";

			stmt.executeUpdate(sql);

		}
	}

}
