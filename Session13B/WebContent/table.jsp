<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	// JSP Script expects number in HTTP Request Object
	String num = request.getParameter("number");
	
	try{
		
		int n = Integer.parseInt(num); // We are converting String into Integer with API Integer.parseInt
		
		for(int i=1;i<=10;i++){
			out.print(n+" "+i+"'s are "+(n*i)+"<br/>");
		}
		
	}catch(Exception e){
		out.print("Please Enter a Valid Number");
	}
	
%>