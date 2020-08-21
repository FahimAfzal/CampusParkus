
import java.io.*;
import java.sql.*;
import java.util.*;
 
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/MapListServlet")
public class MapListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LocationDAO locationDAO;
	
	public void init() {
        locationDAO = new LocationDAO(); 
    }
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String LoadMapValue = request.getParameter("LoadMapValue");
    	
    	switch (LoadMapValue) {
    	case "AllList":
    		try {
    			viewAllList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "AllMap":
    		try {
    			viewAllMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
    	case "StudentMap":
    		try {
    			viewStudentMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StudentList":
    		try {
    			viewStudentList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StudentOCMap":
    		try {
    			viewStudentOCMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StudentOCList":
    		try {
    			viewStudentOCList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
    	case "StudentOCSMap":
    		try {
    			viewStudentOCSMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StudentOCSList":
    		try {
    			viewStudentOCSList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StudentOCSEVMap":
    		try {
    			viewStudentOCSEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StudentOCSEVList":
    		try {
    			viewStudentOCSEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StudentOCSNoEVMap":
    		try {
    			viewStudentOCSNoEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StudentOCSNoEVList":
    		try {
    			viewStudentOCSNoEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StudentOCLMap":
    		try {
    			viewStudentOCLMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StudentOCLList":
    		try {
    			viewStudentOCLList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
    	case "StudentOCLEVMap":
    		try {
    			viewStudentOCLEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StudentOCLEVList":
    		try {
    			viewStudentOCLEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StudentOCLNoEVMap":
    		try {
    			viewStudentOCLNoEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StudentOCLNoEVList":
    		try {
    			viewStudentOCLNoEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
    	case "StudentOCBMap":
    		try {
    			viewStudentOCBMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StudentOCBList":
    		try {
    			viewStudentOCBList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StudentOCBEVMap":
    		try {
    			viewStudentOCBEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StudentOCBEVList":
    		try {
    			viewStudentOCBEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StudentOCBNoEVMap":
    		try {
    			viewStudentOCBNoEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StudentOCBNoEVList":
    		try {
    			viewStudentOCBNoEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
    	case "StfStudCCMap":
    		try {
    			viewStfStudCCMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StfStudCCList":
    		try {
    			viewStfStudCCList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StfStudCCSMap":
    		try {
    			viewStfStudCCSMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StfStudCCSList":
    		try {
    			viewStfStudCCSList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StfStudCCLMap":
    		try {
    			viewStfStudCCLMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StfStudCCLList":
    		try {
    			viewStfStudCCLList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StfStudCCBMap":
    		try {
    			viewStfStudCCBMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StfStudCCBList":
    		try {
    			viewStfStudCCBList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
    	case "StfStudCCSEVMap":
    		try {
    			viewStfStudCCSEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StfStudCCSEVList":
    		try {
    			viewStfStudCCSEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StfStudCCSNoEVMap":
    		try {
    			viewStfStudCCSNoEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StfStudCCSNoEVList":
    		try {
    			viewStfStudCCSNoEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StfStudCCLEVMap":
    		try {
    			viewStfStudCCLEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StfStudCCLEVList":
    		try {
    			viewStfStudCCLEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StfStudCCLNoEVMap":
    		try {
    			viewStfStudCCLNoEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StfStudCCLNoEVList":
    		try {
    			viewStfStudCCLNoEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StfStudCCBEVMap":
    		try {
    			viewStfStudCCBEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StfStudCCBEVList":
    		try {
    			viewStfStudCCBEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StfStudCCBNoEVMap":
    		try {
    			viewStfStudCCBNoEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StfStudCCBNoEVList":
    		try {
    			viewStfStudCCBNoEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffMap":
    		try {
    			viewStaffMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffList":
    		try {
    			viewStaffList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffOCMap":
    		try {
    			viewStaffOCMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffOCList":
    		try {
    			viewStaffOCList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffOCSMap":
    		try {
    			viewStaffOCSMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffOCSList":
    		try {
    			viewStaffOCSList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffOCSEVMap":
    		try {
    			viewStaffOCSEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffOCSEVList":
    		try {
    			viewStaffOCSEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffOCSNoEVMap":
    		try {
    			viewStaffOCSNoEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffOCSNoEVList":
    		try {
    			viewStaffOCSNoEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffOCLMap":
    		try {
    			viewStaffOCLMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffOCLList":
    		try {
    			viewStaffOCLList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
    	case "StaffOCLEVMap":
    		try {
    			viewStaffOCLEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffOCLEVList":
    		try {
    			viewStaffOCLEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffOCLNoEVMap":
    		try {
    			viewStaffOCLNoEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffOCLNoEVList":
    		try {
    			viewStaffOCLNoEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
    	case "StaffOCBMap":
    		try {
    			viewStaffOCBMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffOCBList":
    		try {
    			viewStaffOCBList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffOCBEVMap":
    		try {
    			viewStaffOCBEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffOCBEVList":
    		try {
    			viewStaffOCBEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffOCBNoEVMap":
    		try {
    			viewStaffOCBNoEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "StaffOCBNoEVList":
    		try {
    			viewStaffOCBNoEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
    	case "VisitorMap":
    		try {
    			viewVisitorMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "VisitorList":
    		try {
    			viewVisitorList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "VCreditMap":
    		try {
    			viewVCreditMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "VCreditList":
    		try {
    			viewVCreditList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "VCCSMap":
    		try {
    			viewVCCSMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "VCCSList":
    		try {
    			viewVCCSList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "VCCSEVMap":
    		try {
    			viewVCCSEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "VCCSEVList":
    		try {
    			viewVCCSEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "VCCSNoEVMap":
    		try {
    			viewVCCSNoEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "VCCSNoEVList":
    		try {
    			viewVCCSNoEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    		
    	case "VCCLMap":
    		try {
    			viewVCCLMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "VCCLList":
    		try {
    			viewVCCLList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "VCCLEVMap":
    		try {
    			viewVCCLEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "VCCLEVList":
    		try {
    			viewVCCLEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "VCCLNoEVMap":
    		try {
    			viewVCCLNoEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "VCCLNoEVList":
    		try {
    			viewVCCLNoEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		   		
    	case "VCCBMap":
    		try {
    			viewVCCBMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "VCCBList":
    		try {
    			viewVCCBList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	
    	case "VCCBEVMap":
    		try {
    			viewVCCBEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "VCCBEVList":
    		try {
    			viewVCCBEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "VCCBNoEVMap":
    		try {
    			viewVCCBNoEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "VCCBNoEVList":
    		try {
    			viewVCCBNoEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    	case "CashMap":
    		try {
    			viewCashMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "CashList":
    		try {
    			viewCashList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "CashSMap":
    		try {
    			viewCashSMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "CashSList":
    		try {
    			viewCashSList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "CashSEVMap":
    		try {
    			viewCashSEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "CashSEVList":
    		try {
    			viewCashSEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "CashSNoEVMap":
    		try {
    			viewCashSNoEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "CashSNoEVList":
    		try {
    			viewCashSNoEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "CashLMap":
    		try {
    			viewCashLMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "CashLList":
    		try {
    			viewCashLList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "CashLEVMap":
    		try {
    			viewCashLEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "CashLEVList":
    		try {
    			viewCashLEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "CashLNoEVMap":
    		try {
    			viewCashLNoEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "CashLNoEVList":
    		try {
    			viewCashLNoEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    		
    	case "CashBMap":
    		try {
    			viewCashBMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "CashBList":
    		try {
    			viewCashBList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "CashBEVMap":
    		try {
    			viewCashBEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "CashBEVList":
    		try {
    			viewCashBEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "CashBNoEVMap":
    		try {
    			viewCashBNoEVMap(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case "CashBNoEVList":
    		try {
    			viewCashBNoEVList(request, response);
    		} catch (ServletException | IOException | SQLException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	default:

    	}
    }
    
    protected void viewAllList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listAllLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewAllMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listAllLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudentLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudentLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudentOCLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudentOCLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCSMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudentOCStructures();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCSList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudentOCStructures();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCSEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudOCSEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCSEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudOCSEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCSNoEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudOCSNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCSNoEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudOCSNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCLMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudentOCLots();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCLList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudentOCLots();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCLEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudOCLEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCLEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudOCLEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCLNoEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudOCLNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCLNoEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudOCLNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCBMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudOCBLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCBList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudOCBLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCBEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudOCBEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCBEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudOCBEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCBNoEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudOCBNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStudentOCBNoEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStudOCBNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCSMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCStructures();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCSList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCStructures();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCLMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCLots();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCLList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCLots();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCBMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCBLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCBList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCBLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCSEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCSEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCSEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCSEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCSNoEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCSNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCSNoEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCSNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCLEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCLEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCLEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCLEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCLNoEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCLNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCLNoEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCLNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCBEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCBEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCBEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCBEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCBNoEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCBNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStfStudCCBNoEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStfStudCCBNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCSMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCStructures();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCSList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCStructures();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCSEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCSEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCSEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCSEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCSNoEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCSNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCSNoEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCSNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCLMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCLots();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCLList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCLots();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCLEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCLEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCLEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCLEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCLNoEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCLNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCLNoEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCLNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCBMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCBLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCBList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCBLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCBEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCBEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCBEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCBEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCBNoEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCBNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewStaffOCBNoEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listStaffOCBNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVisitorMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVisitorLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVisitorList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVisitorLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCreditMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCreditLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCreditList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCreditLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCCSMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCCSLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCCSList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCCSLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCCSEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCCSEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCCSEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCCSEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCCSNoEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCCSNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCCSNoEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCCSNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCCLMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCCLLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCCLList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCCLLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCCLEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCCLEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCCLEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCCLEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCCLNoEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCCLNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCCLNoEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCCLNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCCBMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCCBLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCCBList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCCBLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCCBEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCCBEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCCBEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCCBEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCCBNoEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCCBNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewVCCBNoEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listVCCBNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashSMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashSLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashSList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashSLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashSEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashSEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashSEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashSEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashSNoEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashSNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashSNoEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashSNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashLMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashLLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashLList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashLLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashLEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashLEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashLEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashLEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashLNoEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashLNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashLNoEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashLNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashBMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashBLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashBList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashBLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashBEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashBEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashBEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashBEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashBNoEVMap(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashBNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllMap.jsp");       
        dispatcher.forward(request, response);
    }
    
    protected void viewCashBNoEVList(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException
    {
    	List<Location> listLocations = locationDAO.listCashBNoEVLocations();
        request.setAttribute("listLocations", listLocations);       
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAllList.jsp");       
        dispatcher.forward(request, response);
    }



}
