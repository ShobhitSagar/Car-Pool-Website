<%@ include file="navbar.jsp"%>

<div id="body" align-text="center">
	<form id="login_form" class="border" method="post" action="CarServlet?action=login">
		<h1 class="text-center txt_clr_pri">Log In</h1>
		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label>
			<input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email"> 
				<small id="emailHelp" class="form-text text-muted">We'll never
				share your email with anyone else.</small>
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Password</label> 
			<input name="password" type="password" class="form-control" id="exampleInputPassword1"
				placeholder="Password">
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</div>