
<%@page import="model.Film"%>
<%@page import="java.util.List"%>
<%@ include file="header.jsp" %>

<form method="post" action="all">

	<input class="form-control" type="text" name="titolo" placeholder="titolo">
	<input class="form-control" type="number" name="anno" placeholder="anno">
	<input class="form-control" type="number" name="rating" placeholder="rating">
	<input class="btn btn-primary" type="submit" value="aggiungi film">

</form>

<%@ include file="footer.jsp" %>

