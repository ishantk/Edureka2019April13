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

@WebServlet({ "/HomeServlet", "/Welcome" })
public class HomeServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html"); // Specify the type of response which we wish to send back
		PrintWriter out = response.getWriter();
		Date date = new Date();
		
		//String name = request.getParameter("name");
		//String email = request.getParameter("email");
		
		HttpSession session = request.getSession();
		
		String name = (String)session.getAttribute("name");
		String email = (String)session.getAttribute("email");
		
		String message = "Welcome Home Dear User: "+name+"<br/>"+email+"<br/>Its : "+date;
		
		// Read all cookies if present on browser for our application
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" | "+ck.getValue()+" <br/> ");
		}*/
		
		
		String htmlResponse = "<html><body><center><h3>"+message+"</h3></center></body></html>";
		out.print(htmlResponse); // This shall be sent back from Server to the Client
		
	}

}
