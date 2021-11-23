package SQL_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class insert{
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
		
//		String Phone_number = "7010107474";
//		String name = "Nishanth";
//		String age = "20";
//		String gender = "Male";
//		String password1 = "1234";
//		
//		String sql = "insert into sign_up values('"+Phone_number+"','"+name+"','"+age+"','"+gender+"','"+password1+"')";
		
//		String name = "nishanth";
//		String age = "20";
//		String phone_num = "7010107474";
//		String gender = "male";
//		String cid = "T120210915TR1";
//		String status = "confirm";
//		String cidTable = "T120210915";
//		
//		String sql1 = "insert into "+cidTable+" values('"+name+"','"+age+"','"+phone_num+"','"+gender+"','"+cid+"','"+status+"');";
//
//		
//		Statement stmt=con.createStatement();
//	
//		stmt.executeUpdate(sql1);
		
		Statement stmt=con.createStatement();
		String name = "ram";
		String email = "nishanth5524@hmail.com";
		int age = 12;
		String phonenum = "7010107474";
		String gender = "male";
		String sql = "insert into passengerdetails (name, age, gender, phonenum, email) values('" + name + "','" + age + "','" + gender + "','" + phonenum + "','" + email + "');";
		stmt.executeUpdate(sql);
		
	}
}