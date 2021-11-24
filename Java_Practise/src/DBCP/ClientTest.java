package DBCP;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientTest {

	public static void main(String[] args) throws SQLException {

		try (Connection connection = DBUtil.getDataSource().getConnection();
				Statement st = connection.createStatement();) {

			String SQL = "SELECT *FROM info_table";
			ResultSet rs = st.executeQuery(SQL);
			while (rs.next()) {
				int empId = rs.getInt("Id");
				String eName = rs.getString("Name");
				String emessage = rs.getString("Message");
			
				System.out.println(empId + "\t" + eName + "\t" + emessage );
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}