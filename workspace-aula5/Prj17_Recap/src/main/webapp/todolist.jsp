<%@page import="java.util.ArrayList"%>
<%
	String richiestaUtente = null;
	ArrayList<String> lista = null;
	
	if (request.getParameter("svuotatore")!=null){
		session.setAttribute("listaCose", null);
	}
	
	
	
	//verifico se l'arraylist esiste
	if (session.getAttribute("listaCose")!=null){
		out.print("sessione già esistente");
		lista = (ArrayList<String>) session.getAttribute("listaCose");
	} else {
		lista = new ArrayList<>();
		out.print("sessione NON esistente");
		session.setAttribute("listaCose", lista);
		
	}
	
	
	
	if (request.getParameter("cosaDaInserire")!=null && !request.getParameter("cosaDaInserire").trim().equals("")){
		richiestaUtente = (String) request.getParameter("cosaDaInserire");
		lista.add(richiestaUtente.trim());//aggiungo la nota all'al
	}

%>


		
		<form action="" method="post">
		
			<input class="form-control" type="text" name="cosaDaInserire" placeholder="Scrivi qui la tua nota">
			<br>
			<input class="btn btn-primary" type="submit" value="Aggiungi nota">
		
		
		</form>
		
		<form action="" method="post">
			<input class="btn btn-danger" name="svuotatore" type="submit" value="svuota lista">
		</form>		



		<ul>
			<% for (String nota : lista){ %>
		  		<li> <%= nota %> </li>
		  	<% } %>
		</ul>

