import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;

import org.junit.jupiter.api.Test;

class StudentServletTest {

	@Test
	public void testSelectCredit() throws SQLException, ServletException, IOException {
		assertEquals(String.valueOf("20"), String.valueOf(StudentServlet.selectCreditCount().trim()));
	}

	@Test
	public void testSelectOneCard() throws SQLException, ServletException, IOException {
		assertEquals(String.valueOf("23"), String.valueOf(StudentServlet.selectOneCardCount().trim()));
	}
	
	@Test
	public void testSelectCash() throws SQLException, ServletException, IOException {
		assertEquals(String.valueOf("5"), String.valueOf(StudentServlet.selectOCCashCount().trim()));
	}
	
	@Test
	public void testSelectOCStructureCount() throws SQLException, ServletException, IOException {
		assertEquals(String.valueOf("8"), String.valueOf(StudentServlet.selectOCStructureCount().trim()));
	}

	@Test
	public void testSelectOCLotCount() throws SQLException, ServletException, IOException {
		assertEquals(String.valueOf("15"), String.valueOf(StudentServlet.selectOCLotCount().trim()));
	}

	@Test
	public void testSelectOCBothCount() throws SQLException, ServletException, IOException {
		assertEquals(String.valueOf("23"), String.valueOf(StudentServlet.selectOCBothCount().trim()));
	}

}

