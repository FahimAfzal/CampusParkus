import java.io.*;
import java.sql.*;
import java.util.*;
 
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/TierServlet")
public class TierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connect = null;
	private Statement statement = null;
	
	// removed this function for Singleton design pattern to create
	// one instance of the database connection
	
	/*protected void connect_func() throws SQLException {
        if (connect == null || connect.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            connect = (Connection) DriverManager
  			      .getConnection("jdbc:mysql://127.0.0.1:3306/campusparkus?allowMultiQueries=true&"
  			          + "user=john&password=pass1234");
        }
    }*/
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String LoadSpecificTierValue = request.getParameter("LoadSpecificTierValue");
    	
    	switch (LoadSpecificTierValue) {
    	case "Student":
    		try {
    			selectStudent(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "Staff":
    		try {
    			selectStaff(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "Visitor":
    		try {
    			selectVisitor(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "ViewAll":
    	{
    		RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllLocs.jsp");       
            dispatcher.forward(request, response);
    	}
    		break;
    		
    	case "Contact Us":
    	{
    		RequestDispatcher dispatcher = request.getRequestDispatcher("ContactUs.jsp");       
            dispatcher.forward(request, response);
    	}
    		break;
    		
    	case "Emergency Support":
    	{
    		RequestDispatcher dispatcher = request.getRequestDispatcher("Support.jsp");       
            dispatcher.forward(request, response);
    	}
    		break;
    		
    	default:

    	}
    }
    
    private String getCount(String sql) throws SQLException, ServletException, IOException {
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
    
    protected void selectStudent(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where studOCPrice != 'NOT AVAILABLE'\r\n" + 
    			"or stfstudCreditPrice != 'NOT AVAILABLE'\r\n" + 
    			"or cashPrice != 'NOT AVAILABLE';";
		
    	String count = getCount(sql);
    	
        request.setAttribute("count", count);
        
    	RequestDispatcher dispatcher = request.getRequestDispatcher("StudentView.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void selectStaff(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where staffOCPrice != 'NOT AVAILABLE'\r\n" + 
    			"or stfstudCreditPrice != 'NOT AVAILABLE'\r\n" + 
    			"or cashPrice != 'NOT AVAILABLE';";
		
    	String count = getCount(sql);
    	
        request.setAttribute("count", count);
    	
		RequestDispatcher dispatcher = request.getRequestDispatcher("StaffView.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void selectVisitor(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {	
    	String sql = "select count(*)\r\n" + 
    			"from parking\r\n" + 
    			"where visitCreditPrice != 'NOT AVAILABLE'\r\n" + 
    			"or cashPrice != 'NOT AVAILABLE';";
		
    	String count = getCount(sql);
    	
        request.setAttribute("count", count);
    	
		RequestDispatcher dispatcher = request.getRequestDispatcher("VisitorView.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void disconnect() throws SQLException {
        if (connect != null && !connect.isClosed()) {
        	connect.close();
        }
    }
}
