<%
	if(request.getParameter("username")!=null && request.getParameter("password")!=null){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if (username.equals("pippo") && password.equals("12345")){
			session.setAttribute("logged", "pippo");
		}
		
	}

%>


<%@ include file="header.jsp" %>
<%@ include file="menu.jsp" %>

<h1>Funziona!</h1>


<%@ include file="content.jsp" %>

<%@ include file="footer.jsp" %>
