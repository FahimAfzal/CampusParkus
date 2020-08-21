import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import org.junit.jupiter.api.Test;

class StudentServletTest_RW {

	@Test
	public void testselectCCLot() throws SQLException, ServletException, IOException {
		assertEquals(String.valueOf("12"), String.valueOf(StudentServlet.testselectCCLot()));
	}
	
	@Test
	public void testselectCashSEV() throws SQLException, ServletException, IOException {
		assertEquals(String.valueOf("3"), String.valueOf(StudentServlet.testselectCashSEV()));
	}
	
	@Test
	public void testselectCashSNoEV() throws SQLException, ServletException, IOException {
		assertEquals(String.valueOf("3"), String.valueOf(StudentServlet.testselectCashSNoEV()));
	}
	
	@Test
	public void testselectCashLEV() throws SQLException, ServletException, IOException {
		assertEquals(String.valueOf("0"), String.valueOf(StudentServlet.testselectCashLEV()));
	}
	
	
	@Test
	public void testselectCashLNoEV() throws SQLException, ServletException, IOException {
		assertEquals(String.valueOf("2"), String.valueOf(StudentServlet.testselectCashLNoEV()));
	}
	
	@Test
	public void testselectCashBoth() throws SQLException, ServletException, IOException {
		assertEquals(String.valueOf("5"), String.valueOf(StudentServlet.testselectCashBoth()));
	}
}
