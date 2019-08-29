<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Car Pooling </title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/login.css">
    <link rel="stylesheet" href="css/signup.css">
    <link rel="stylesheet" href="css/findride.css">
    <!--  --> <!--  -->
    <!-- <link rel="stylesheet" href="css/font-awesome.min.css"> -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="js/jquery-3.2.1.slim.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

</head>
	<body>
        <nav id="navbar" class="navbar fixed-top navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand animated tada" href="http://localhost:8080/Car_Pool_Project/index.jsp">Car Pooling</a>
        
            <div data-aos="fade-in" class="ml-auto" id="">
                <a class="find_ride" href="findride.jsp"><i class="fa fa-search fa-lg" style="margin-right: 10px"></i>Find a ride</a>
                <% 
                HttpSession session2 = request.getSession(false);
                String name = (String) session2.getAttribute("name");
                if (name!=null) { %>
                <a> <%=request.getAttribute("name") %> </a>
                <form action="CarServlet" method="post">
                <input type="submit" name="action" value="logout"></input>
                </form>
                <% } else { %>
                <a class="login" href="login.jsp">Log In</a>
                <a  class="signup" href="signup.jsp">Sign Up</a>
                <% } %>
            </div>
        </nav>
		<div style="height: 60px; background: #f8f9fa"></div>
	</body>
	  <script src="https://unpkg.com/aos@next/dist/aos.js"></script>
	  <script>
	    AOS.init();
	  </script>
</html>







































<!-- 
<link rel="stylesheet" href="css/animate.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.2/animate.min.css">
    <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" /> -->