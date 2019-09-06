<%@page import="com.service.Service"%>
<%@ include file="navbar.jsp"%>
<%@ page import="com.service.*" %>
<%@ page import="java.util.*" %>
<%@ page import="com.models.*" %>

<div id="body">
	<form id="find_ride_form" method="post" action="CarServlet?action=search">
		<h1 class="text-center txt_clr_pri">Find a ride</h1>
		<!-- <div class="form-group">
			<input type="text" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Leaving from">
		</div> -->
		<div class="row">
			<div class="col-md-6">
				<select id="select_loc">
				<option>Leaving from</option>
				<%
				Service service = new ServiceImpl();
				List<String> list = service.getAllLocations();
				Iterator<String> i = list.iterator();
				while (i.hasNext()) {
					String s = i.next();
				%>
				<option name="pick"><%= s %></option>
				<% } %>
				</select>
			</div>
			<div class="col-md-6">
				<select id="select_loc">
				<option>Going to</option>
				<%
				Service service1 = new ServiceImpl();
				List<String> list1 = service1.getAllLocations();
				Iterator<String> i1 = list1.iterator();
				while (i1.hasNext()) {
					String s = i1.next();
				%>
				<option name="drop"><%= s %></option>
				<% } %>
				</select>
			</div>
		</div>
		<!-- <div class="form-group">
			<input type="password" class="form-control"
				id="exampleInputPassword1" placeholder="Going to">
		</div> -->
		<button type="submit" class="btn btn-primary btn-block">
			<i class="fa fa-search" style="margin-right: 10px"></i>Search
		</button>
	</form>
	
	
</div>