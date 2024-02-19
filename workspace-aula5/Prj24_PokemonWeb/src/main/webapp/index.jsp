<%@page import="java.util.TreeSet"%>
<%@page import="java.util.HashSet"%>
<%@page import="model.Pokemon"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pokemon list</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<div class="container">
	<h1>Pokemon List</h1>
		
	<form action="">
	<select name="tipo" class="form-control">
	<%TreeSet<String> tipi = (TreeSet <String>)request.getAttribute("tipi"); %>
	<%for(String tipo: tipi){%>
	
			<option><%=tipo%></option>
			<% }%>
	</select>	
	<input type="submit" value="Cerca tipo" class="btn btn-primary">
	</form>		
	<table>
		<tr>
			<th>id</th>
			<th>nome</th>
			<th>tipo</th>
		</tr>
		<%ArrayList<Pokemon> pokemon = (ArrayList <Pokemon>)request.getAttribute("elenco"); %>
		<%for(Pokemon p:pokemon){ %>
		<tr>
		<td><%= p.getId() %></td>
		<td><a href="https://wiki.pokemoncentral.it/<%= p.getNome() %>" target="_blank"><%= p.getNome() %></a></td>
		<td><%= p.getTipo() %></td>
		</tr>
		<% }%>
	</table>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>