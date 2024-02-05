<%

	String pagina = "home";

	if (request.getParameter("pagina")!=null){
		pagina = request.getParameter("pagina");
	}

	switch(pagina){
	
	case "uno":
		%>
		<%@ include file="dadi.jsp" %>			
			<%
		break;
	
	case "due":
		%>
	<%@ include file="todolist.jsp" %>			
		<%
		break;
	
	case "tre":
		out.print("<h2>Page 3: Coming soon :)</h2>");
		break;
	
	case "quattro":
		out.print("<h2>Page 4: Coming soon :)</h2>");
		break;
		
	case "logout":
		session.setAttribute("logged", null);
		response.sendRedirect("?");
		break;
		
	default:
		out.print("<h2>Home page</h2>");
		%>
		<%@ include file="home.jsp" %>			
		<%
		break;
	
	}


%>
