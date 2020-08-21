import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;

import org.junit.Test;

public class StaffServletTest {

		//Testing if the correct count for Credit Card structure is being returned
		@Test
		public void test1_CCstructure() throws SQLException, ServletException, IOException {
			assertEquals("8", StaffServlet.CCStructureCount());
			
		}
		
		//Testing if the correct count for Credit Card lot is being returned
		@Test
		public void test2_CClot() throws SQLException, ServletException, IOException {
			assertEquals("12", StaffServlet.CCLotCount());
			
		}
		
		//Testing if the correct count for both Credit Card structure and lot is being returned
		@Test
		public void test3_CCboth() throws SQLException, ServletException, IOException {
			assertEquals("20", StaffServlet.CCBothCount());
			
		}
		
		//Testing if the correct count for Cash structure is being returned
		@Test
		public void test4_cashStructure() throws SQLException, ServletException, IOException {
			assertEquals("3", StaffServlet.cashStructureCount());
					
		}
		
		//Testing if the correct count for Cash lot is being returned
		@Test
		public void test5_cashLot() throws SQLException, ServletException, IOException {
			assertEquals("2", StaffServlet.cashLotCount());
					
		}
		
		//Testing if the correct count for both Cash structure and lot is being returned
		@Test
		public void test6_cashBoth() throws SQLException, ServletException, IOException {
			assertEquals("5", StaffServlet.cashBothCount());
		}
		
		//Testing if the get count function is working properly by passing in sql statements for staff credit prices
		@Test
		public void test7_getCount() throws SQLException, ServletException, IOException {
			assertNotNull(StaffServlet.getCount("select count(*)\r\n" + 
	    			"from parking\r\n" + 
	    			"where stfstudCreditPrice != 'NOT AVAILABLE'\r\n;"));
		}
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
