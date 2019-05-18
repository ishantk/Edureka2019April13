package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

	String message = "";
	String htmlResponse = "<html><body><h3>"+message+"</h3></body></html>";
	
	public void destroy() {
		
		System.out.println(">> LoginFilter Destroyed");
		
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); // To write response back to client
		
		out.print("==Pre Processing==");
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		if(email.isEmpty() || password.isEmpty()){
			message = "Please Enter Email and Password both to Login";
			out.print(htmlResponse);
		}else{
			// pass the request along the filter chain
			chain.doFilter(request, response); // pass the request to the corresponding servlet i.e. LoginServlet
		}
		
		out.print("==Post Processing==");
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println(">> LoginFilter initializaed");
	}

}
