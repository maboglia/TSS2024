<ul id="menu">
  <li> <a href="index.jsp">home</a></li>
  <% if (session.getAttribute("logged")!=null){ %>
	  <li> <a href="index.jsp?pagina=uno">pagina 1</a></li>
	  <li> <a href="index.jsp?pagina=due">pagina 2</a></li>
	  <li> <a href="index.jsp?pagina=tre">pagina 3</a></li>
	  <li> <a href="index.jsp?pagina=quattro">pagina 4</a></li>
	  <li> <a href="index.jsp?pagina=logout">logout</a></li>
  <% } %>
</ul>
