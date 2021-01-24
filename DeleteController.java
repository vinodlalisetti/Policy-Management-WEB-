package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Policy;

/**
 * Servlet implementation class DeleteController
 */
@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * 
	 */ PolicyController controller = new PolicyController();
	 
	        
	    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  
		   int id = Integer.parseInt(request.getParameter("id"));
		  int result = controller.removePolicy(id);
		  if(result==1)
		  {
			
  		  response.sendRedirect("Login");
		  }
		  else
		  {
			  String msg="Delete unSuccesfully";
	  			request.setAttribute("message", msg);
	  			RequestDispatcher rd=request.getRequestDispatcher("Display.jsp");
	  			rd.forward(request,response);
	  		  response.sendRedirect("Login");
		  }
		
	}

}
