import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.sql.*;
import java.util.*;

class LocationDAOTest {
	LocationDAO locationDAO = new LocationDAO();
	Location location = new Location(999, "type", "name", "address", 99.99, 99.99, "price", "price", "price", "price", "price", "ev");
	
	@Test
	public void addLocationTest() throws SQLException {
		locationDAO.addLocation(location);
		
		List<Location> loadLocations = locationDAO.retrieveData("select * from parking \r\n" +
				"where id = 999;");
		
		for (Location loadLocation : loadLocations) {
			assertEquals(999, loadLocation.getID());
			assertEquals("type", loadLocation.getParkType());
			assertEquals("name", loadLocation.getParkName());
			assertEquals("address", loadLocation.getParkAddress());
			assertEquals(99.99, loadLocation.getLat());
			assertEquals(99.99, loadLocation.getLng());
			assertEquals("price", loadLocation.getStudOCPrice());
			assertEquals("price", loadLocation.getStaffOCPrice());
			assertEquals("price", loadLocation.getStfstudCreditPrice());
			assertEquals("price", loadLocation.getVisitCreditPrice());
			assertEquals("price", loadLocation.getCashPrice());
			assertEquals("ev", loadLocation.getEV());
		}
	}
	
	@Test
	public void getLocationTest() throws SQLException {
		Location testLocation = locationDAO.getLocation(1);
		
		assertEquals(1, testLocation.getID());
		assertEquals("STRUCTURE", testLocation.getParkType());
		assertEquals("Palmer Structure", testLocation.getParkName());
		assertEquals("450 W. Palmer", testLocation.getParkAddress());
		assertEquals(42.361440, testLocation.getLat());
		assertEquals(-83.069900, testLocation.getLng());
		assertEquals("$4.00", testLocation.getStudOCPrice());
		assertEquals("$7.50", testLocation.getStaffOCPrice());
		assertEquals("$8.50", testLocation.getStfstudCreditPrice());
		assertEquals("$8.50", testLocation.getVisitCreditPrice());
		assertEquals("NOT AVAILABLE", testLocation.getCashPrice());
		assertEquals("Yes", testLocation.getEV());
	}
	
	@Test
	public void listStudentOCLocationsTest() throws SQLException {
		List<Location> studentOCLocationsTest = locationDAO.listStudentOCLocations();
		
		for (Location studentOCLocation : studentOCLocationsTest) {
			assertFalse((studentOCLocation.getStudOCPrice()).equals("NOT AVAILABLE"));
		}
		
	}
	
	@Test
	public void listStaffOCLocationsTest() throws SQLException {
		List<Location> staffOCLocationsTest = locationDAO.listStaffOCLocations();
		
		for (Location staffOCLocation : staffOCLocationsTest) {
			assertFalse((staffOCLocation.getStaffOCPrice()).equals("NOT AVAILABLE"));
		}
		
	}
}
