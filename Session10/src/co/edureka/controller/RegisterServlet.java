package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.dao.DBHelper;
import co.edureka.model.User;

@WebServlet({ "/RegisterServlet", "/Register", "/Hello.do" })
public class RegisterServlet extends HttpServlet {

	// Life Cycle Methods of Servlet and shall be executed automatically
	
	// init is executed when object of Servlet is created by Web Container on Server
	// When ever any user/client will request for RegisterServlet object will be created. Only once.
	public void init(ServletConfig config) throws ServletException {
		System.out.println(">> RegisterServlet init executed");
	}

	// When Server will check no longer requirement for the object !! Automatically destructed for no usage !!
	public void destroy() {
		System.out.println(">> RegisterServlet destroy executed");
	}
	
	// What is sent by client and what we need to send back to the client is taken care by service method
	// HttpServletRequest request will have data coming from client
	// HttpServletResponse response will send data back to client
	// shall be executed whenever client requests for RegisterServlet execution
	// service method will be executed for any type of HTTP Method Request :)
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> RegisterServlet service executed");
		
		// Lets Create User Object in memory when any user requests for RegisterServlet
		User user = new User();
		
		// From Request Object we extracted Data which was sent by User
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		// After getting the data into object, let us save it in DataBase
		DBHelper db = new DBHelper(); 			// Driver Loaded
		db.createConnection();		  			// Create Connection
		int i = db.registerUser(user);		 	// Write and Execute SQL Statement
		db.closeConnection(); 		  			// Close Connection with DB
		
		//System.out.println(">> Details: "+user);
		
		// Lets Send Response Back to User
		
		response.setContentType("text/html"); // Specify the type of response which we wish to send back
		
		// PrintWriter is an API
		PrintWriter out = response.getWriter(); // To write response back to client
		String message = "";
		if(i>0){
			message = user.name+ " Successfully Registered ";
		}else{
			message = user.name+ " Not Successfully Registered ";
		}
		
		String htmlResponse = "<html><body><center><h3>"+message+"</h3></center></body></html>";
		out.print(htmlResponse); // This shall be sent back from Server to the Client
	}

}


/*
 interface Servlet{
	void init();
	void service();
	void destroy();
}

class GenericServlet implements Servlet{
	void init(){

	}
	void service(){

	}
	void destroy(){

	}
}

class HttpServlet extends GenericServlet{
	void doGet(){

	}

	void doPost(){

	}
	...
}


class MyServlet extends HttpServlet{
	// Override any methods which you wish to use as per your requiremenents
}
*/
