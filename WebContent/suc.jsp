<%@ include file="navbar.jsp" %> 
<h1>Success</h1>
<p>Thank you <%=request.getAttribute("name") %> </p>

<form method="post" action="CarServlet?action=viewall">
<input type="submit" value="View all users">
</form>