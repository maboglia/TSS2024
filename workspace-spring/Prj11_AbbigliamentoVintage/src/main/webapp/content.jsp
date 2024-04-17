<main>
    <div class="container">

        <h1>
            <%=request.getAttribute("titolo")%>
        </h1>

        <div>
            <p>
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolor alias, delectus est veritatis obcaecati
                aut ducimus iste reiciendis pariatur libero assumenda vel sunt doloremque tenetur aperiam id itaque quam
                necessitatibus.
            </p>
        </div>

		<% if (session.getAttribute("logged")!=null && session.getAttribute("logged").equals("test")){ %>
			<h2>Benvenuto utente <%=session.getAttribute("logged") %></h2>
		<% } else { %>
        <form action="login" method="post">
            <input class="form-control" type="text" name="username" id="username" placeholder="username">
            <input class="form-control" type="password" name="password" id="password" placeholder="password">
            <input class="btn" type="submit" value="Login">
        </form>
		<% } %>
    </div>
</main>