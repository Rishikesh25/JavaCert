package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/* 1.REGISTER the DB driver.
 * 2.Establish the connection with the DB.
 * 3.Prepare a statement
 * 4.Execute the query
 * 5.Close all the connections.
*/
public class DBUtil {
public final static String url=("jdbc:mysql://localhost:3306/emp");
public final static String username=("root");
public final static String password=("root123");


public static Connection getConnection() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	Connection con = null;
	try {
		con = DriverManager.getConnection(url, username, password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;
}
}

