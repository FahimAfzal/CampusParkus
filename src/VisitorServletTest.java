import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;

import org.junit.jupiter.api.Test;

class VisitorServletTest {

	//Testing if it is returning correct count ---------
	@Test
	void test_selectCash_Count() throws SQLException, ServletException, IOException {
		assertEquals("5", VisitorServlet.selectCashCount());
		
	}
	//Testing if it is returning correct count 
	@Test
	void test_selectCredit_Count() throws SQLException, ServletException, IOException {
		assertEquals("15", VisitorServlet.selectCreditCount());
		
	}
	//Testing if it is returning correct count 
	@Test
	void test_selectCCStructureCount() throws SQLException, ServletException, IOException {
		assertEquals("8", VisitorServlet.selectCCStructureCount());
		
	}
	
	//Chekcing if getcount function works 
	@Test
	void test_getCount() throws SQLException, ServletException, IOException {
		assertNotNull(VisitorServlet.getCount("select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where visitCreditPrice != 'NOT AVAILABLE'\r\n;"));
	}
	
	
	//Here im validating if getcount function returns correct number 
	@Test
	void test_getCount_validation() throws SQLException, ServletException, IOException {
		assertEquals("15",VisitorServlet.getCount("select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where visitCreditPrice != 'NOT AVAILABLE'\r\n;"));
		
	}
	//Testing if it is returning correct count 
	@Test
	void test_BothEV_Count() throws SQLException, ServletException, IOException {
		assertEquals("3", VisitorServlet.selectCashBEVCount());
		
	}

}
