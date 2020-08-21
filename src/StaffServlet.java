import java.io.*;
import java.sql.*;
import java.util.*;
 
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/StaffServlet")
public class StaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static Connection connect = null;
    private static Statement statement = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loadStaffValue = request.getParameter("LoadStaffValue");
		
		switch(loadStaffValue) {
		case "Cash" :
			try {
				selectCash(request, response);
			} catch (ServletException | IOException | SQLException e) {
				e.printStackTrace();
			}
			break;
		
		case "Credit" :
			try {
				selectCredit(request, response);
			} catch (ServletException | IOException | SQLException e) {
				e.printStackTrace();
			}
			break;
			
		case "OneCard" :
			try {
				selectOneCard(request, response);
			} catch (ServletException | IOException | SQLException e) {
				e.printStackTrace();
			}
			break;
			
		case "OCStructure":
			try {
    			selectOCStructure(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
		case "OCLot":
			try {
    			selectOCLot(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
		case "OCBoth":
			try {
    			selectOCBoth(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
		case "OCSEV":
			try {
    			selectOCSEV(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
		case "OCSNoEV":
			try {
    			selectOCSNoEV(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
		case "OCLEV":
			try {
    			selectOCLEV(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
		case "OCLNoEV":
			try {
    			selectOCLNoEV(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
		case "OCBEV":
			try {
    			selectOCBEV(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
		case "OCBNoEV":
			try {
    			selectOCBNoEV(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
		case "CCStructure":
			try {
    			selectCCStructure(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
		case "CCLot":
			try {
    			selectCCLot(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
		case "CCBoth":
			try {
    			selectCCBoth(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
		case "CCSEV":
			try {
    			selectCCSEV(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
		case "CCSNoEV":
			try {
    			selectCCSNoEV(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
		case "CCLEV":
			try {
    			selectCCLEV(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
		case "CCLNoEV":
			try {
    			selectCCLNoEV(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
		case "CCBEV":
			try {
    			selectCCBEV(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
		case "CCBNoEV":
			try {
    			selectCCBNoEV(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
		case "CashStructure":
			try {
    			selectCashStructure(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
		case "CashLot":
			try {
    			selectCashLot(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
		case "CashBoth":
			try {
    			selectCashBoth(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
		case "CashSEV":
			try {
    			selectCashSEV(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
		case "CashSNoEV":
			try {
    			selectCashSNoEV(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
		case "CashLEV":
			try {
    			selectCashLEV(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
		case "CashLNoEV":
			try {
    			selectCashLNoEV(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
		case "CashBEV":
			try {
    			selectCashBEV(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
		case "CashBNoEV":
			try {
    			selectCashBNoEV(request, response);
    		} catch (IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
		default:
			
		}
	}
	
	
	 static String getCount(String sql) throws SQLException, ServletException, IOException {
		String count = "";
		connect = DatabaseConnection.getInstance().getConnection();      
        statement =  (Statement) connect.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
		
        while (resultSet.next())
        	count = resultSet.getString(1);
        
        System.out.println("Total locations: " + count);

        resultSet.close();
        statement.close();         
        disconnect();        
        
        return count;
	}
	
	private void selectCredit(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where stfstudCreditPrice != 'NOT AVAILABLE';";
        
        String count = getCount(sql);
        
        request.setAttribute("count", count);
        
    	RequestDispatcher dispatcher = request.getRequestDispatcher("StfStdCCView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectOneCard(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where staffOCPrice != 'NOT AVAILABLE';";
		
		String count = getCount(sql);
		
        request.setAttribute("count", count);
        
    	RequestDispatcher dispatcher = request.getRequestDispatcher("StaffOneCardView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectCash(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE';";
		
		String count = getCount(sql);
        
        request.setAttribute("count", count);
        
    	RequestDispatcher dispatcher = request.getRequestDispatcher("CashView.jsp");       
        dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void selectOCStructure(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where staffOCPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'STRUCTURE';";
		
    	String count = getCount(sql);
        
        request.setAttribute("count", count);
        
    	RequestDispatcher dispatcher = request.getRequestDispatcher("StaffOCSView.jsp");       
        dispatcher.forward(request, response);
    }
	
	private void selectOCLot(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where staffOCPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'LOT';";
		
    	String count = getCount(sql);
        
        request.setAttribute("count", count);
        
    	RequestDispatcher dispatcher = request.getRequestDispatcher("StaffOCLView.jsp");       
        dispatcher.forward(request, response);
    }
	
	private void selectOCBoth(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where staffOCPrice != 'NOT AVAILABLE';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StaffOCBothView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectOCSEV(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where staffOCPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'STRUCTURE'\r\n" +
    			"and EV = 'Yes';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StaffOCSEVView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectOCSNoEV(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where staffOCPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'STRUCTURE';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StaffOCSNoEVView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectOCLEV(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where staffOCPrice != 'NOT AVAILABLE'\r\n" +
    			"and EV = 'Yes'\r\n" +
    			"and parkType = 'LOT';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StaffOCLEVView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectOCLNoEV(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where staffOCPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'LOT';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StaffOCLNoEVView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectOCBEV(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where staffOCPrice != 'NOT AVAILABLE'\r\n" +
    			"and EV = 'Yes';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StaffOCBEVView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectOCBNoEV(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where staffOCPrice != 'NOT AVAILABLE';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StaffOCBNoEVView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectCCStructure(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where stfstudCreditPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'STRUCTURE';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StfStdCCStructureView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectCCLot(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where stfstudCreditPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'LOT';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StfStdCCLotView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectCCBoth(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where stfstudCreditPrice != 'NOT AVAILABLE';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StfStdCCBothView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectCCSEV(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where stfstudCreditPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'STRUCTURE'\r\n" +
    			"and EV = 'Yes';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StfStdCCSEVView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectCCSNoEV(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where stfstudCreditPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'STRUCTURE';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StfStdCCSNoEVView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectCCLEV(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where stfstudCreditPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'LOT'\r\n" +
				"and EV = 'Yes';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StfStdCCLEVView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectCCLNoEV(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where stfstudCreditPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'LOT';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StfStdCCLNoEVView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectCCBEV(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where stfstudCreditPrice != 'NOT AVAILABLE'\r\n" +
    			"and EV = 'Yes';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StfStdCCBEVView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectCCBNoEV(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where stfstudCreditPrice != 'NOT AVAILABLE';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("StfStdCCBNoEVView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectCashStructure(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'STRUCTURE';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("CashSView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectCashLot(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'Lot';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("CashLView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectCashBoth(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("CashBView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectCashSEV(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE'\r\n" + 
    			"and parkType = 'STRUCTURE'\r\n" +
    			"and EV = 'Yes';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("CashSEVView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectCashSNoEV(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE'\r\n" + 
    			"and parkType = 'STRUCTURE';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("CashSNoEVView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectCashLEV(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'LOT'\r\n" +
    			"and EV = 'Yes';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("CashLEVView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectCashLNoEV(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE'\r\n" + 
    			"and parkType = 'LOT';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("CashLNoEVView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectCashBEV(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE'\r\n" +
    			"and EV = 'Yes';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("CashBEVView.jsp");       
        dispatcher.forward(request, response);
	}
	
	private void selectCashBNoEV(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE';";
		
		String count = getCount(sql);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("CashBNoEVView.jsp");       
        dispatcher.forward(request, response);
	}
	protected static void disconnect() throws SQLException {
	        if (connect != null && !connect.isClosed()) {
	        	connect.close();
	        }
	    }
	
	
	//=======================================================================================================
	// ASSIGNMENT 6: METHODS FOR UNIT TESTING
	//=======================================================================================================
	
	//Credit card structure function
	public static String CCStructureCount()
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where stfstudCreditPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'STRUCTURE';";
		
		String count = getCount(sql);
		
		
        return count;
	}
	
	//Credit Card Lot function
	public static String CCLotCount()
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where stfstudCreditPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'LOT';";
		
		String count = getCount(sql);
		
		
        
        return count;
	}
	
	//Credit Card both lot and structure function
	public static String CCBothCount()
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where stfstudCreditPrice != 'NOT AVAILABLE';";
		
		String count = getCount(sql);
		
		
        
        return count;
	}
	
	//Cash Structures function
	public static String cashStructureCount()
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'STRUCTURE';";
		
		String count = getCount(sql);
		
		
        
        return count;
	}
	
	//Cash Lot Function
	public static String cashLotCount()
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE'\r\n" +
    			"and parkType = 'Lot';";
		
		String count = getCount(sql);
		
        
        return count;
	}
	
	//Cash for both lots and structures function
	public static String cashBothCount()
			throws ServletException, IOException, SQLException
	{
		String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE';";
		
		String count = getCount(sql);
	
        return count;
	}
	
		
}



