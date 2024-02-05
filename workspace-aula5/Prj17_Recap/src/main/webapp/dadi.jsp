<%@page import="model.Dado"%>

<%

	Dado dado1 = new Dado();
	Dado dado2 = new Dado();
	
	int vittorie = 0;
	if (session.getAttribute("punteggio") != null){
		vittorie = (int) session.getAttribute("punteggio");		
	} else {
		session.setAttribute("punteggio", vittorie);
	}

	dado1.lancia(); 
	dado2.lancia(); 
	
	if (dado1.getFaccia() == dado2.getFaccia()){
		vittorie++;
		session.setAttribute("punteggio", vittorie);
	}
	
	String img1 = "https://github.com/maboglia/ProgrammingResources/blob/master/images/dadi/f"+ dado1.getFaccia() +".jpg?raw=true";
	String img2 = "https://github.com/maboglia/ProgrammingResources/blob/master/images/dadi/f"+ dado2.getFaccia() +".jpg?raw=true";

%>
		
		<div class="row">
			<img class="img col-2" alt="dado1" src="<%=img1%>">
			<img class="img col-2" alt="dado2" src="<%=img2%>">
		</div>
		
		<div class="row">
			<a class="btn btn-primary" href="?pagina=uno">Lancia dadi</a>
		</div>
		
		<div class="row">
			<h2>Risultato <%= vittorie %></h2>
		</div>
		
