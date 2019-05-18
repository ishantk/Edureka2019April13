<%@ page import="co.edureka.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>
<%@ page buffer="8kb" %>
<%@ page isThreadSafe="true" %>
<%@ include file="header.jsp" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Demo</title>
</head>
<body>
	<center>
		<h3>This is a JSP Page !! :)</h3>
		
		<h4>Scriptlet Tag Demo</h4>
		
		<h3>Area of Circle with radius 4.4 is: <% out.print(area(4.4));%> </h3>
		<%-- <% out.print("age is: "+age); --%> <!-- error here as age is created later -->
		<% 
			int age = 18;
			if(age >= 18){
		%>		
		<% out.print("age is: "+age); %>
		
		<b> You Can Vote</b>
		
		<%	
			}else{
		 %>
		 <b> You Cannot Vote</b>
		<% 		
			}
		%>
		
		<h4>Declarative Tag Demo</h4>
		
		<%!
			double pi = 3.14;
		
			double area(double radius){
				return pi * radius * radius;
			}
			
		%>
		
		<h3>Area of Circle with radius 3.3 is: <% out.print(area(3.3));%> </h3>
		
		<h4>Expression Tag Demo</h4>
		<h3>Area of Circle with radius 5.5 is: <%= area(5.5) %> </h3>
		
		<%
			int[] arr = {10, 20, 30, 40, 50};
		%>
		
		<h4>arr[2] is: <%= arr[2] %></h4>
		
		
		<%
			// Object Construction Statement
			Employee eRef1 = new Employee();
			eRef1.setEid(101);
			eRef1.setName("John Watson");
			eRef1.setSalary(50000);
		
		%>
		Eid: <%= eRef1.getEid() %>  |  Name: <%= eRef1.getName() %> |  Salary: <%= eRef1.getSalary() %>
		<br/>	<br/>
		
		<jsp:useBean id="eRef2" class="co.edureka.model.Employee"/>
		<jsp:setProperty property="eid" name="eRef2" value="201"/>
		<jsp:setProperty property="name" name="eRef2" value="Fionna Flynn"/>
		<jsp:setProperty property="salary" name="eRef2" value="70000"/>
	
		Eid: <jsp:getProperty property="eid" name="eRef2"/>  |  Name: <jsp:getProperty property="name" name="eRef2"/> |  Salary: <jsp:getProperty property="salary" name="eRef2"/>
	
		<br/>
		
		<c:forEach var="i" begin="1" end="10">
			<h4><c:out value="${i}"/></h4>
		</c:forEach>
	
		<c:set var="age" value="20"/>
		Age is <c:out value="${age}"/>
	
		
	</center>
</body>
</html>