import java.util.*;
import java.sql.*;
import javax.servlet.annotation.*;

@WebServlet("/LocationDAO")
public class LocationDAO {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
    
    public List<Location> retrieveData(String sql) throws SQLException {
    	List<Location> listLocations = new ArrayList<Location>();
    	
    	connect = DatabaseConnection.getInstance().getConnection();
    	
    	statement = (Statement) connect.createStatement();
    	resultSet = statement.executeQuery(sql);
    	
    	while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String parkType = resultSet.getString("parkType");
            String parkName = resultSet.getString("parkName");
            String parkAddress = resultSet.getString("parkAddress");
            double lat = resultSet.getDouble("lat");
            double lng = resultSet.getDouble("lng");
            String studOCPrice = resultSet.getString("studOCPrice");
            String staffOCPrice = resultSet.getString("staffOCPrice");
            String stfstudCreditPrice = resultSet.getString("stfstudCreditPrice");
            String visitCreditPrice = resultSet.getString("visitCreditPrice");
            String cashPrice = resultSet.getString("cashPrice");
            String EV = resultSet.getString("EV");
             
            Location location = new Location(id, parkType, parkName, parkAddress, lat, lng,
           		studOCPrice, staffOCPrice, stfstudCreditPrice, visitCreditPrice, cashPrice, EV);
            listLocations.add(location);
        }     
    	
    	resultSet.close();
        statement.close();  
        
        disconnect();      
    	
    	return listLocations;
    }
    
    public List<Location> listAllLocations() throws SQLException {     
        String sql = "SELECT * FROM parking";      
        return retrieveData(sql);
    }
    
    public List<Location> listStudentLocations() throws SQLException {      
        String sql = "select *\r\n" + 
    			"from parking\r\n" +
    			"where studOCPrice != 'NOT AVAILABLE'\r\n" + 
    			"or stfstudCreditPrice != 'NOT AVAILABLE'\r\n" + 
    			"or cashPrice != 'NOT AVAILABLE';";
        
        return retrieveData(sql);
    }
    
    public List<Location> listStudentOCLocations() throws SQLException {
        String sql = "select *\r\n" + 
    			"from parking\r\n" +
    			"where studOCPrice != 'NOT AVAILABLE';";
        
        return retrieveData(sql);
    }
    
    public List<Location> listStudentOCStructures() throws SQLException {
        String sql = "select *\r\n" + 
    			"from parking\r\n" +
    			"where studOCPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'STRUCTURE';";
        
        return retrieveData(sql);
    }
    
    public List<Location> listStudOCSEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'STRUCTURE'\r\n" +
    			"and EV = 'Yes'\r\n" +
    			"and studOCPrice != 'NOT AVAILABLE';";       
        
        return retrieveData(sql);
    }
    
    public List<Location> listStudOCSNoEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'STRUCTURE'\r\n" +
    			"and studOCPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    
    public List<Location> listStudentOCLots() throws SQLException {
        String sql = "select *\r\n" + 
    			"from parking\r\n" +
    			"where studOCPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'LOT';";
        
        return retrieveData(sql);
    }
    
    public List<Location> listStudOCLEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'LOT'\r\n" +
    			"and EV = 'Yes'\r\n" +
    			"and studOCPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listStudOCLNoEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'LOT'\r\n" +
    			"and studOCPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listStudOCBLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where studOCPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listStudOCBEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where EV = 'Yes'\r\n" +
    			"and studOCPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listStudOCBNoEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where studOCPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listStfStudCCLocations() throws SQLException {
        String sql = "select *\r\n" + 
        		"from parking\r\n" +
    			"where stfstudCreditPrice != 'NOT AVAILABLE';";
        
        return retrieveData(sql);
    }
    
    public List<Location> listStfStudCCStructures() throws SQLException {
        String sql = "select *\r\n" + 
    			"from parking\r\n" +
    			"where stfstudCreditPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'STRUCTURE';";
        
        return retrieveData(sql);
    }
    
    public List<Location> listStfStudCCSEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'STRUCTURE'\r\n" +
    			"and EV = 'Yes'\r\n" +
    			"and stfstudCreditPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listStfStudCCSNoEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'STRUCTURE'\r\n" +
    			"and stfstudCreditPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listStfStudCCLots() throws SQLException {
        String sql = "select *\r\n" + 
    			"from parking\r\n" +
    			"where stfstudCreditPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'LOT';";
        
        return retrieveData(sql);
    }
    
    public List<Location> listStfStudCCLEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'LOT'\r\n" +
    			"and EV = 'Yes'\r\n" +
    			"and stfstudCreditPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listStfStudCCLNoEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'LOT'\r\n" +
    			"and stfstudCreditPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listStfStudCCBLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where stfstudCreditPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listStfStudCCBEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where EV = 'Yes'\r\n" +
    			"and stfstudCreditPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listStfStudCCBNoEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where stfstudCreditPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    public List<Location> listStaffLocations() throws SQLException {
        String sql = "select *\r\n" + 
    			"from parking\r\n" +
    			"where staffOCPrice != 'NOT AVAILABLE'\r\n" + 
    			"or stfstudCreditPrice != 'NOT AVAILABLE'\r\n" + 
    			"or cashPrice != 'NOT AVAILABLE';";
        
        return retrieveData(sql);
    }
    
    public List<Location> listStaffOCLocations() throws SQLException {
        String sql = "select *\r\n" + 
    			"from parking\r\n" +
    			"where staffOCPrice != 'NOT AVAILABLE';";
        
        return retrieveData(sql);
    }
    
    public List<Location> listStaffOCStructures() throws SQLException {
        String sql = "select *\r\n" + 
    			"from parking\r\n" +
    			"where staffOCPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'STRUCTURE';";
        
        return retrieveData(sql);
    }
    
    public List<Location> listStaffOCSEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'STRUCTURE'\r\n" +
    			"and EV = 'Yes'\r\n" +
    			"and staffOCPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listStaffOCSNoEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'STRUCTURE'\r\n" +
    			"and staffOCPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    
    public List<Location> listStaffOCLots() throws SQLException {
        String sql = "select *\r\n" + 
    			"from parking\r\n" +
    			"where staffOCPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'LOT';";
        
        return retrieveData(sql);
    }
    
    public List<Location> listStaffOCLEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'LOT'\r\n" +
    			"and EV = 'Yes'\r\n" +
    			"and staffOCPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listStaffOCLNoEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'LOT'\r\n" +
    			"and staffOCPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listStaffOCBLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where staffOCPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listStaffOCBEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where EV = 'Yes'\r\n" +
    			"and studOCPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listStaffOCBNoEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where studOCPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listVisitorLocations() throws SQLException {     
        String sql = "select *\r\n" + 
    			"from parking\r\n" +
    			"where visitCreditPrice != 'NOT AVAILABLE'\r\n" + 
    			"or cashPrice != 'NOT AVAILABLE';";
        
        return retrieveData(sql);
    }
    
    
    public List<Location> listVCreditLocations() throws SQLException {        
        String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where visitCreditPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listVCCSLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'STRUCTURE'\r\n" +
    			"and visitCreditPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listVCCSEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'STRUCTURE'\r\n" +
    			"and EV = 'Yes'\r\n" +
    			"and visitCreditPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listVCCSNoEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'STRUCTURE'\r\n" +
    			"and visitCreditPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listVCCLLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'LOT'\r\n" +
    			"and visitCreditPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listVCCLEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'LOT'\r\n" +
    			"and EV = 'Yes'\r\n" +
    			"and visitCreditPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listVCCLNoEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'LOT'\r\n" +
    			"and visitCreditPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listVCCBLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where visitCreditPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listVCCBEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where EV = 'Yes'\r\n" +
    			"and visitCreditPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listVCCBNoEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where visitCreditPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listCashLocations() throws SQLException {        
        String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listCashSLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'STRUCTURE'\r\n" +
    			"and cashPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listCashSEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'STRUCTURE'\r\n" +
    			"and EV = 'Yes'\r\n" +
    			"and cashPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listCashSNoEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'STRUCTURE'\r\n" +
    			"and cashPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listCashLEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'LOT'\r\n" +
    			"and EV = 'Yes'\r\n" +
    			"and cashPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listCashLNoEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'LOT'\r\n" +
    			"and cashPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listCashBEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where EV = 'Yes'\r\n" +
    			"and cashPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listCashBNoEVLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    
    public List<Location> listCashLLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'LOT'\r\n" +
    			"and cashPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public List<Location> listCashBLocations() throws SQLException {        
    	String sql = "select *\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE';";      
        
        return retrieveData(sql);
    }
    
    public Location getLocation(int id) throws SQLException {
    	Location location = null;
        String sql = "SELECT * FROM parking WHERE id = ?";
         
        connect = DatabaseConnection.getInstance().getConnection();
         
        preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
        preparedStatement.setInt(1, id);
         
        ResultSet resultSet = preparedStatement.executeQuery();
         
        if (resultSet.next()) {
            String parkType = resultSet.getString("parkType");
            String parkName = resultSet.getString("parkName");
            String parkAddress = resultSet.getString("parkAddress");
            double lat = resultSet.getDouble("lat");
            double lng = resultSet.getDouble("lng");
            String studOCPrice = resultSet.getString("studOCPrice");
            String staffOCPrice = resultSet.getString("staffOCPrice");
            String stfstudCreditPrice = resultSet.getString("stfstudCreditPrice");
            String visitCreditPrice = resultSet.getString("visitCreditPrice");
            String cashPrice = resultSet.getString("cashPrice");
            String EV = resultSet.getString("EV");
             
            location = new Location(id, parkType, parkName, parkAddress, lat, lng,
            		studOCPrice, staffOCPrice, stfstudCreditPrice, visitCreditPrice, cashPrice, EV);
        }
         
        resultSet.close();
        preparedStatement.close();
        
        disconnect();
         
        return location;
    }
    
    public void addLocation(Location location) throws SQLException
    {
    	connect = DatabaseConnection.getInstance().getConnection();
    	
    	String createLocation = "INSERT INTO parking VALUES('" + location.getID() + "', '" + location.getParkType() + "', '" + location.getParkName() + "', '" + location.getParkAddress()
    			+ "', '" + location.getLat() + "', '" + location.getLng() + "', '" + location.getStudOCPrice() + "', '" + location.getStaffOCPrice() + "', '" + location.getStfstudCreditPrice()
    			+ "', '" + location.getVisitCreditPrice() + "', '" + location.getCashPrice() + "', '" + location.getEV() + "');";
    	
    	statement =  (Statement) connect.prepareStatement(createLocation);
        
        statement.executeUpdate(createLocation);
        
        statement.close();
        disconnect();
    	
    }
    
    protected void disconnect() throws SQLException {
        if (connect != null && !connect.isClosed()) {
        	connect.close();
        }
    }
}
