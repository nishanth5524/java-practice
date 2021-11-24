package DBCP;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		OutputStream os = new FileOutputStream("dataConfig.properties");
		
		p.setProperty("driver.class.name", "com.mysql.cj.jdbc.Driver");
		p.setProperty("db.url", "jdbc:mysql://localhost:3306/mydatabase");
		p.setProperty("db.username", "nishanth");
		p.setProperty("db.password", "Nishanth@5524");
		
		p.store(os, null);
		
	}
	
	
}
