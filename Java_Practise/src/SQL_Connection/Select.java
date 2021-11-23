package SQL_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select{
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
		
//		String from = "coimbatore";
//		String to = "chennai";
//		String date = "2021-09-15";
//		String tname = "t1";
//
//		int t_seat = 0;
//		int r_seat = 0;
//		
//		
//		Statement stmt=con.createStatement();
//		ResultSet rs = stmt.executeQuery(
//				"select T_seat from Train_details where T_Name = '" + tname + "' and DT ='" + date + "'");
//
//		while(rs.next()) {
//		t_seat = rs.getInt(1);
//		}
//		Statement stmt1=con.createStatement();
//		ResultSet rs1 = stmt1.executeQuery(
//				"select R_seat from Train_details where T_Name = '" + tname + "' and DT ='" + date + "'");
//
//		while(rs1.next()) {
//			r_seat= rs1.getInt(1);
//		}
//		int s = 26 - (t_seat + r_seat);
//		
//		System.out.println(t_seat);
//		System.out.println(r_seat);
//		System.out.println(s);
		
		int id = 4;
		Statement stmt11 = con.createStatement();
		ResultSet rs11 = stmt11.executeQuery("select pnr, status, depdate,berth, pid from passengerboardingdetails where id = '" + id + "'");

		while (rs11.next()) {
			System.out.println("pnr: " + rs11.getString(1) + "\nstatus: " + rs11.getString(2) + "\ndepdate: "
					+ rs11.getString(3) + "\nberth: " + rs11.getString(4) + "\npid: " + rs11.getString(5));

		}
	}
}