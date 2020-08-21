import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.util.regex.Pattern;
import java.util.regex.Matcher;;

/**
 * Servlet implementation class contactUSServlet
 */
@WebServlet("/contactUSServlet")
public class contactUSServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contactUSServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String getSubmitType = request.getParameter("submit");
		switch (getSubmitType) {
		case "SEND MESSAGE":
    		try {
				send_message(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		break;
		}
	}
	public void send_message(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
    	contactUS obj = new contactUS();
    	contactUSDAO obj1 = new contactUSDAO();
    	
    	obj.setName( request.getParameter("name"));
    	obj.setEmail(request.getParameter("email"));
    	obj.setComment(request.getParameter("message"));
    	
    	//Validating email if it is a valid email address we will add review on to our db and show succes page 
    	if (valEmail(request.getParameter("email")) == true)
    	{
    	//passing the review to update in to the db
    	obj1.add_review(obj);
    	
    	//Redirect to succes page
    	RequestDispatcher dispatcher = request.getRequestDispatcher("ContactSuccess.jsp");       
    	dispatcher.forward(request, response);
    	}
    	else 
    	{
    		request.setAttribute("failMessage", "Please Enter a valid Email Address!!");
    		RequestDispatcher dispatcher = request.getRequestDispatcher("ContactUs.jsp");       
        	dispatcher.forward(request, response);
    	}
    	
    }
	public static boolean valEmail (String input)
	{
		String emailregex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPat = Pattern.compile(emailregex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPat.matcher(input);
		
		
		return matcher.find();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
