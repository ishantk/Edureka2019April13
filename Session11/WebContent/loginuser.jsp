<%@ page import="co.edureka.dao.DBHelper"%>
<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login here</title>
</head>
<body>

	<h3>Logging in ${param.txtEmail} ....</h3>

<%
		
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
	
		DBHelper db = new DBHelper();
		db.createConnection();
		int i = db.loginUser(user);
		db.closeConnection();
		
		if(i>0){
			
			// 1. Session Tracking - Cookies
			/*Cookie ck1 = new Cookie("keyName",user.name);
			Cookie ck2 = new Cookie("keyEmail",user.email);
			
			response.addCookie(ck1);
			response.addCookie(ck2);*/
			
			// 2. Session Tracking - URL ReWriting 3. Hidden Form Fields -> Explore
			
			// 4. Session Tracking - HttpSession Object
			session.setAttribute("keyName", user.name);
			session.setAttribute("keyEmail", user.email);
			
			pageContext.setAttribute("keyName", user.name, PageContext.SESSION_SCOPE);
	%>
		
	
		<h3>User <%= user.name %>, Logged-In Successfully !!</h3>
		<!-- <a href="home.jsp">Enter Home</a> -->
		<jsp:forward page="home.jsp"/>
	<%		
		}else{
			out.print("Something went wrong !!");
			response.sendRedirect("https://www.google.co.in");
		}
	%>
	<br/>
	>> Action Tag in JSP
	<br/>
	<jsp:include page="header.jsp"/>
	
	
	
</body>
</html>