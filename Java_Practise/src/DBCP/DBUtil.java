package DBCP;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class DBUtil {
	private static final String DB_USERNAME = "db.username";
	private static final String DB_PASSWORD = "db.password";
	private static final String DB_URL = "db.url";
	private static final String DB_DRIVER_CLASS = "driver.class.name";

	private static Properties properties = null;
	private static BasicDataSource dataSource;
	static {
		try {
			properties = new Properties();
			properties.load(new FileInputStream("dataConfig.properties"));

			dataSource = new BasicDataSource();
			dataSource.setDriverClassName(properties.getProperty(DB_DRIVER_CLASS));
			dataSource.setUrl(properties.getProperty(DB_URL));
			dataSource.setUsername(properties.getProperty(DB_USERNAME));
			dataSource.setPassword(properties.getProperty(DB_PASSWORD));

			dataSource.setInitialSize(10);
			dataSource.setDefaultTransactionIsolation(1);		
			System.out.println(dataSource.getInitialSize());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static DataSource getDataSource() {
		return dataSource;
	}
}