
<%@page import="model.Film"%>
<%@page import="java.util.List"%>
<%@ include file="header.jsp" %>

<% if(request.getAttribute("elenco") == null){ %>
<h1>Hei! Devi passare da all</h1>
<% } else{ %>
<table class="table table-striped">
  <tr>
    <th>Title</th>
    <th>Rating</th>
    <th>Anno</th>
  </tr>
<% List<Film> film = (List<Film>) request.getAttribute("elenco"); %>  
<% for(Film f: film){ %>
  <tr>
    <td><%=f.getTitolo() %></td>
    <td><%=f.getRating() %></td>
    <td><%=f.getAnno() %></td>
  </tr>
<% }%>
</table>

<% }%>

<%@ include file="footer.jsp" %>

