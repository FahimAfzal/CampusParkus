import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.sql.*;

public class DatabaseConnectionTest {
	
	DatabaseConnection testInstance;
	Connection testConnection;
	
	@Test
	public void getInstanceTest() throws SQLException {
		testInstance = DatabaseConnection.getInstance();
		
		assertNotNull(testInstance);
	}
	
	@Test
	public void getConnectionTest() throws SQLException {
		testConnection = DatabaseConnection.getInstance().getConnection();
		
		assertFalse(testConnection.isClosed());
	}

}


