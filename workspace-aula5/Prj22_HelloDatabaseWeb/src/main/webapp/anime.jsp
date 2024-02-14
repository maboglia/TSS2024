<!DOCTYPE html>
<%@page import="model.Film"%>
<%@page import="java.util.ArrayList"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</head>
<body>
    <div class="container">
        <h1>Anime</h1>
        <table class="table table-striped">
            <thead>
                <tr>
                  <th scope="col">#</th>
                  <th scope="col">Titolo</th>
                  <th scope="col">Anno</th>
                  <th scope="col">Rating</th>
                </tr>
              </thead>
              <tbody>
              	<% ArrayList<Film> mieiFilm = (ArrayList<Film>)request.getAttribute("elenco"); %>
              	<% for(Film f : mieiFilm){ %>
                <tr>
                  <th scope="row"><%=f.getId()%></th>
                  <td><%=f.getTitolo() %></td>
                  <td><%=f.getAnno() %></td>
                  <td><%=f.getRating() %></td>
                </tr>
                <% } %>
              </tbody>
        </table>
    </div>
</body>
</html>