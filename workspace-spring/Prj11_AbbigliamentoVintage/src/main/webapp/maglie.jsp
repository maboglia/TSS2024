<%@page import="model.Maglia"%>
<%@page import="java.util.List"%>
<main>
    <div class="container">

        <h1>
            <%=request.getAttribute("titolo")%>
        </h1>

	<table class="table">
	
		<tr>
			<th>Scritta</th>
			<th>Colore</th>
			<th>Taglia</th>
			<th>Prezzo</th>
		</tr>
	
	<% for (Maglia m : ((List<Maglia>) request.getAttribute("maglie"))){ %>
		<tr>
			<td><%= m.getScritta() %></td>
			<td><%= m.getColore() %></td>
			<td><%= m.getTaglia() %></td>
			<td><%= m.getPrezzo() %></td>
		</tr>
	
	<% } %>
	</table>


    </div>
</main>