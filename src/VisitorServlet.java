import java.io.*;
import java.sql.*;
import java.util.*;
 
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/VisitorServlet")
public class VisitorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection connect = null;
	private static Statement statement = null;
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String LoadVisitorValue = request.getParameter("LoadVisitorValue");
    	
    	switch (LoadVisitorValue) {
    	case "Cash":
    		try {
    			selectCash(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "Credit":
    		try {
    			selectCredit(request, response);
    		} catch (ServletException | IOException | SQLException e) {
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
    
    public static String getCount(String sql) throws SQLException, ServletException, IOException {
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
    
    protected void selectCash(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE';";
		
    	String count = getCount(sql);
    	
        request.setAttribute("count", count);
        
    	RequestDispatcher dispatcher = request.getRequestDispatcher("CashView.jsp");       
        dispatcher.forward(request, response);
    }
    
    //Unit testing 
    public static String selectCashCount()
            throws ServletException, IOException, SQLException
    {
    	
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE';";
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
    
    protected void selectCredit(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where visitCreditPrice != 'NOT AVAILABLE'\r\n;";
		
    	String count = getCount(sql);
        
        request.setAttribute("count", count);
    	
		RequestDispatcher dispatcher = request.getRequestDispatcher("VisitorCreditView.jsp");       
        dispatcher.forward(request, response);
    }
    
    //Unit Testing
    public static String selectCreditCount()
            throws ServletException, IOException, SQLException
    {
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where visitCreditPrice != 'NOT AVAILABLE'\r\n;";
		
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
    
    protected void selectCCStructure(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'STRUCTURE'\r\n" +
    			"and visitCreditPrice != 'NOT AVAILABLE';";
		
    	String count = getCount(sql);
        
        request.setAttribute("count", count);
    	
		RequestDispatcher dispatcher = request.getRequestDispatcher("VisitorCCSView.jsp");       
        dispatcher.forward(request, response);
    }
    
    //Unit Test------------
    public static String selectCCStructureCount()
            throws ServletException, IOException, SQLException
    {
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'STRUCTURE'\r\n" +
    			"and visitCreditPrice != 'NOT AVAILABLE';";
		
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
    
    protected void selectCCLot(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where parkType = 'LOT'\r\n" +
    			"and visitCreditPrice != 'NOT AVAILABLE';";
		
    	String count = getCount(sql);
        
        request.setAttribute("count", count);
    	
		RequestDispatcher dispatcher = request.getRequestDispatcher("VisitorCCLView.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void selectCCBoth(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where visitCreditPrice != 'NOT AVAILABLE';";
		
    	String count = getCount(sql);
        
        request.setAttribute("count", count);
    	
		RequestDispatcher dispatcher = request.getRequestDispatcher("VisitorCCBView.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void selectCCSEV(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where visitCreditPrice != 'NOT AVAILABLE'\r\n" + 
    			"and parkType = 'STRUCTURE'\r\n" + 
    			"and EV = 'Yes';";
		
    	String count = getCount(sql);
        
        request.setAttribute("count", count);
    	
		RequestDispatcher dispatcher = request.getRequestDispatcher("VisitorCCSEVView.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void selectCCSNoEV(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where visitCreditPrice != 'NOT AVAILABLE'\r\n" + 
    			"and parkType = 'STRUCTURE';";
		
    	String count = getCount(sql);
        
        request.setAttribute("count", count);
    	
		RequestDispatcher dispatcher = request.getRequestDispatcher("VisitorCCSNoEVView.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void selectCCLEV(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where visitCreditPrice != 'NOT AVAILABLE'\r\n" + 
    			"and parkType = 'LOT'\r\n" + 
    			"and EV = 'Yes';";
		
    	String count = getCount(sql);
        
        request.setAttribute("count", count);
    	
		RequestDispatcher dispatcher = request.getRequestDispatcher("VisitorCCLEVView.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void selectCCLNoEV(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where visitCreditPrice != 'NOT AVAILABLE'\r\n" + 
    			"and parkType = 'LOT';";
		
    	String count = getCount(sql);
        
        request.setAttribute("count", count);
    	
		RequestDispatcher dispatcher = request.getRequestDispatcher("VisitorCCLNoEVView.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void selectCCBEV(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where visitCreditPrice != 'NOT AVAILABLE'\r\n" +  
    			"and EV = 'Yes';";
		
    	String count = getCount(sql);
        
        request.setAttribute("count", count);
    	
		RequestDispatcher dispatcher = request.getRequestDispatcher("VisitorCCBEVView.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void selectCCBNoEV(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where visitCreditPrice != 'NOT AVAILABLE';";
		
    	String count = getCount(sql);
        
        request.setAttribute("count", count);
    	
		RequestDispatcher dispatcher = request.getRequestDispatcher("VisitorCCBNoEVView.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void selectCashStructure(HttpServletRequest request, HttpServletResponse response)
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
    
    protected void selectCashLot(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE'\r\n" + 
    			"and parkType = 'LOT';";
		
    	String count = getCount(sql);
        
        request.setAttribute("count", count);
    	
		RequestDispatcher dispatcher = request.getRequestDispatcher("CashLView.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void selectCashBoth(HttpServletRequest request, HttpServletResponse response)
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
    
    protected void selectCashSEV(HttpServletRequest request, HttpServletResponse response)
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
    
    protected void selectCashSNoEV(HttpServletRequest request, HttpServletResponse response)
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
    
    protected void selectCashLEV(HttpServletRequest request, HttpServletResponse response)
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
    
    protected void selectCashLNoEV(HttpServletRequest request, HttpServletResponse response)
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
    
    protected void selectCashBEV(HttpServletRequest request, HttpServletResponse response)
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
    
    //Unit test
    public static String selectCashBEVCount()
            throws ServletException, IOException, SQLException
    {
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where cashPrice != 'NOT AVAILABLE'\r\n" + 
    			"and EV = 'Yes';";
		
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
    
    protected void selectCashBNoEV(HttpServletRequest request, HttpServletResponse response)
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
}

