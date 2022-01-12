package SQL_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;

public class InsertData {
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
		// create table employees(sno int, eid int, first_name varchar(100),last_name
		// varchar(50),mid int, address varchar(100),city varchar(100),salary int);

		int salary = 100;

		Random rn = new Random();

		for (int i = 0; i < 10000000; i++) {

			int mid = rn.nextInt(10) + 1;

			salary = salary + i;

			String sql = "insert into employees (sno, eid, first_name, last_name, mid, address, city, salary) values('"
					+ i + "','1000" + i + "','john" + i + "','mathew" + i + "','" + mid + "','3/11-1','chennai','"
					+ salary + "');";

			stmt.executeUpdate(sql);

		}
	}
}
