import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	private static DatabaseConnection instance; 
	private Connection connection;
	
	private String url = "jdbc:mysql://127.0.0.1:3306/campusparkus";
	private String user = "john";
	private String pass = "pass1234";
		
	private DatabaseConnection() throws SQLException {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			throw new SQLException(e);
		}
		this.connection = DriverManager.getConnection(url, user, pass);
	}
	
	public Connection getConnection() {
		
		return connection;
	}
	
	public static DatabaseConnection getInstance() throws SQLException {
		
		if (instance == null) 	
			instance = new DatabaseConnection();
		
		else if (instance.getConnection().isClosed()) 
			instance = new DatabaseConnection();
		
		return instance;
	}
}
