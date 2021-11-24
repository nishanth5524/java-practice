package SQL_Connection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBCPDataSource {

	public static void main(String[] args) throws IOException {

		Properties p = new Properties();

		InputStream is = new FileInputStream("dataConfig.properties");

		p.load(is);

		System.out.println(p.getProperty("uname"));
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("pass"));
	}
}
