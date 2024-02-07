<!DOCTYPE html>
<%@page import="model.Libro"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="addLibro.html" %>

	<h1>Libri</h1>
	<% ArrayList<Libro> libri = (ArrayList<Libro>) request.getAttribute("libri");  %>
	<ul>
		<% for (Libro l : libri){ %>
			
			<li><%= l.getTitolo() %></li>
	
		<% } %>
	</ul>
	

</body>
</html>