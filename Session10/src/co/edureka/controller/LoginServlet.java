package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.edureka.dao.DBHelper;
import co.edureka.model.User;


@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {
	
	// doPost is a method which shall be executed only against POST Request from client
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Lets Create User Object in memory when any user requests for LoginServlet
		User user = new User();
		
		// From Request Object we extracted Data which was sent by User
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		// After getting the data into object, let us save it in DataBase
		DBHelper db = new DBHelper(); 			// Driver Loaded
		db.createConnection();		  			// Create Connection
		int i = db.loginUser(user);		 	// Write and Execute SQL Statement
		db.closeConnection(); 			
		
		// Lets Send Response Back to User
		
		response.setContentType("text/html"); // Specify the type of response which we wish to send back
		
		// PrintWriter is an API
		PrintWriter out = response.getWriter(); // To write response back to client
		String message = "";
		String linkToHome = "";
		String form = "";
		if(i>0){
			Date date = new Date();
			message = user.name+ " Logged In Successfully at "+date;
			//linkToHome = "<a href='Welcome'>Enter Home</a>";
			
			// 1. Session Tracking - Cookies
			//Cookie ck1 = new Cookie("keyName", user.name); // key and value are both suppose to be Strings :)
			//Cookie ck2 = new Cookie("keyEmail", user.email);
			
			//ck1.setMaxAge();
			
			// If user has not disabled cookies in browser settings, these cookies shall be saved in browser for our application
			//response.addCookie(ck1);
			//response.addCookie(ck2);
			
			// 2. Session Tracking - URL ReWriting 
			// Append Data in URL
			//linkToHome = "<a href='Welcome?name="+user.name+"&email="+user.email+"'>Enter Home</a>";
			
			// 3. Session Tracking - Hidden Form Fields
			/*form =    "<form action='Welcome' method='post'>"
					+ "<input type='hidden' name='name' value='"+user.name+"'/>"
					+ "<input type='hidden' name='email' value='"+user.email+"'/>"
					+ "<input type='submit' value='Enter Home'/>"
					+ "</form>";
			*/
			
			// 4. Session Tracking - HttpSession Object
			HttpSession session = request.getSession(); // Get Reference to Session Object maintained by Server
			session.setAttribute("name", user.name);
			session.setAttribute("email", user.email);
			linkToHome = "<a href='Welcome'>Enter Home</a>";
			
			// Additional Task : Implement login and logout concept :)
			
		}else{
			//message = user.name+ " Not Logged In Successfully !! Please try Again !! ";
			response.sendRedirect("https://www.google.co.in");
		}
		
		String htmlResponse = "<html><body><center><h3>"+message+"</h3>"+linkToHome+"</center></body></html>";
		//String htmlResponse = "<html><body><center><h3>"+message+"</h3>"+form+"</center></body></html>";
		out.print(htmlResponse); // This shall be sent back from Server to the Client

		
	}

}
