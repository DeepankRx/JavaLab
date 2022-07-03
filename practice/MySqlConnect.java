import java.sql.*;
public class MySqlConnect {
	public static void main(String[] args) {
		  System.out.println("MySQL Connect Example.");
		  Connection conn = null;
		  String url = "jdbc:mysql://localhost:3306/";
		  String dbName = "temp";
		  String driver = "com.mysql.jdbc.Driver";
		  String userName = "root"; 
		  String password = "";
		  try {
		  Class.forName(driver).newInstance();
		  conn = DriverManager.getConnection(url+dbName,userName,password);
		  System.out.println("Connected to the database");
		  conn.close();
		  System.out.println("Disconnected from database");
		  } catch (Exception e) {
		  e.printStackTrace();
		  }
		  }

}
