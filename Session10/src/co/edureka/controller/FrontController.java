package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/FrontController", "/Front" })
public class FrontController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html"); // Specify the type of response which we wish to send back
		
		// PrintWriter is an API
		PrintWriter out = response.getWriter(); // To write response back to client
		String htmlResponse = "<html><body><center><h3>Front Controller in Action :) </h3></center></body></html>";
		out.print(htmlResponse); // This shall be sent back from Server to the Client
		
		String typeOfRequest = request.getParameter("txtType");
		
		// Front Controller is able to differentiate between Requests from Client
		if(typeOfRequest.equals("register")){
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Register"); // RegisterServlet
			dispatcher.forward(request, response); // Forward Req and Res to the next Servlet i.e. RegisterServlet
			// forward method will ensure that response from the next Servlet shall be shared back.
			
		}else{ // login
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login"); // LoginServlet
			dispatcher.forward(request, response);  // Forward Req and Res to the next Servlet i.e. LoginServlet
			//dispatcher.include(request, response); 
			// forward method will include response from current Servlet and the next Servlet both
		} 
		
	}

}
