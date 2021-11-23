package SQL_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo_01 {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/transactions_prac", "root",
					"nishanth5524");
			Statement st = Con.createStatement();
			String query = "Select * from stock;";
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				String product = rs.getString("Product");
				System.out.println(product);
			}
			// String query = "insert into stock values(5,'lenova',10);";
			// st.executeUpdate(query);

			Con.setAutoCommit(true);
			Con.close();

		} catch (ClassNotFoundException ex) {

			System.out.println(ex);

			System.out.println("---------------------------");

		} catch (SQLException ex) {
			Logger.getLogger(Demo_01.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}
