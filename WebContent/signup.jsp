<%@ include file="navbar.jsp"%>

<div id="body">
	<form id="signup_form" method="post" class="border" name="form" action="CarServlet?action=register">
		<h1 class="text-center txt_clr_pri">Sign Up</h1>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Email</label> <input type="email"
					class="form-control" id="inputEmail4" name="email" placeholder="Email">
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Password</label> <input type="password"
					class="form-control" id="inputPassword4" name="password" placeholder="Password">
			</div>
		</div>
		<div class="form-group">
			<label for="inputAddress">Name</label> <input type="text"
				class="form-control" id="inputAddress" name="name" placeholder="Enter your name here">
		</div>
		<div class="form-group">
			<label for="inputAddress2">Contact</label> <input type="number"
				class="form-control" id="inputAddress2" name="contact"
				placeholder="XXXXXXXXXX">
		</div>
		<button type="submit" class="btn btn-primary">Sign Up</button>
	</form>
</div>