package SQL_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;

public class BaasAuditLogDetails {

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
		
		String[] name = {"Aakash", "Barani", "Ravi", "Kumar"};
		Random r = new Random();
		
		for (int i = 1; i <= 10000000; i++) {

			int ENTITY_ID = r.nextInt(10) + 1;
			int c = r.nextInt(4);
			int META_TYPE = r.nextInt(10) + 1;
			int AUDIT_ACTION = r.nextInt(10) + 1;
			
			String sql = "insert into BaasAuditLogDetails(AUDITID, ENTITY_ID, PROJECTID, DONE_BY, META_TYPE, AUDIT_ACTION) values('"+ i + "','"+ ENTITY_ID +"','"+i+"','"+name[c]+"','"+META_TYPE+"','"+AUDIT_ACTION+"');";

			stmt.executeUpdate(sql);

		}
	}
	
}
