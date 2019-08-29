<%@ include file="navbar.jsp"%>

<video autoplay muted loop id="carpoolvid">
	<source src="img/carpoolvid.mp4">
</video>

<div id="vid_content" align="center">
	<h1 id="banner" class="animated slideInDown">Car Pooling</h1>
	<p id="desc" class="animated slideInDown">Share your travel costs
		with our community.</p>
	<a class="btn btn-primary animated slideInUp" href="findride.jsp"
		role="button">Find a ride</a>
</div>


<div id="find_ride" class="container">
	<div class="row">
		<div class="col col-sm-12 col-lg-6">
			<img id="driver_img" alt="error" src="img/driver.jpg">
		</div>
		<div class="col col-sm-12 col-lg-6" data-aos="fade-left"
			style="margin-top: 10%;">
			<h2 class="align-middle" style="color: rgb(5, 71, 82);">Driving in your car soon?</h2>
			<p>Let's make this your least expensive journey ever.</p>
			<a class="btn btn-primary" href="findride.jsp" role="button">Offer a ride</a>
		</div>
	</div>
</div>

<div id="wrapper">
	<div class="container">
		<h2 style="color: white;" data-aos="fade-down">Where do you want
			to go?</h2>
		<div class="row">
			<div class="col-sm-12 col-lg-4" data-aos="flip-left">
				<a id="wrapper_btn" class="btn btn-light" href="#" role="button">Delhi
					> Chandigarh
					<div id="wr_btn_price">
						Rs.500 <i class="fa fa-arrow-circle-right fa-lg"></i>
					</div>
				</a>
			</div>
			<div class="col-sm-12 col-lg-4" data-aos="flip-up">
				<a id="wrapper_btn" class="btn btn-light" href="#" role="button">Mumbai
					> Pune
					<div id="wr_btn_price">
						Rs.300 <i class="fa fa-arrow-circle-right fa-lg"></i>
					</div>
				</a>
			</div>
			<div class="col-sm-12 col-lg-4" data-aos="flip-right">
				<a id="wrapper_btn" class="btn btn-light" href="#" role="button">Bengaluru
					> Chennai
					<div id="wr_btn_price">
						Rs.600 <i class="fa fa-arrow-circle-right fa-lg"></i>
					</div>
				</a>
			</div>
		</div>
	</div>
</div>

<div class="container">
	<h1
		style="color: rgb(5, 71, 82); margin-top: 80px; margin-bottom: 20px;">Go
		literally anywhere. From anywhere.</h1>
	<div id="brief" class="row">
		<div class="col-sm-12 col-lg-4" data-aos="fade-right">
			<div class="card-body">
				<h5 class="card-title">Smart</h5>
				<h6 class="card-text mb-2 text-muted">With access to millions
					of journeys, you can quickly find people nearby travelling your
					way.</h6>
			</div>
		</div>
		<div class="col-sm-12 col-lg-4" data-aos="fade-in">
			<div class="card-body">
				<h5 class="card-title">Simple</h5>
				<h6 class="card-text mb-2 text-muted">Enter your exact address
					to find the perfect ride. Choose who you’d like to travel with. And
					book!</h6>
			</div>
		</div>
		<div class="col-sm-12 col-lg-4" data-aos="fade-left">
			<div class="card-body">
				<h5 class="card-title">Seamless</h5>
				<h6 class="card-text mb-2 text-muted">Get to your exact
					destination, without the hassle. No queues. No waiting around.</h6>
			</div>
		</div>
	</div>
	<h1
		style="color: rgb(5, 71, 82); margin-top: 80px; margin-bottom: 70px;">3
		things you'll love about Car Pooling</h1>
	<div class="row">
		<div class="col-sm-12 col-lg-4" data-aos="fade-right" align="center">
			<svg viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"
				width="90" height="90" aria-hidden="true" fill="#708C91">
				<path
					d="M22.9,8.2l-3-4C19.807,4.074,19.657,4,19.5,4H15V1.5C15,1.224,14.775,1,14.5,1h-6C8.224,1,8,1.224,8,1.5V4H2.5 C2.224,4,2,4.224,2,4.5v8C2,12.775,2.224,13,2.5,13H8v10.5C8,23.775,8.224,24,8.5,24h6c0.275,0,0.5-0.225,0.5-0.5V13h4.5 c0.157,0,0.307-0.074,0.4-0.2l3-4C23.033,8.622,23.033,8.378,22.9,8.2z M9,2h5v2H9V2z M14,23H9V13h5V23z M19.25,12H3V5h16.25 l2.625,3.5L19.25,12z"></path></svg>
			<div class="card-body">
				<h5 class="card-title">Choice.</h5>
				<p class="card-text text-muted">We go everywhere. Literally
					thousands of destinations. No station required.</p>
			</div>
		</div>
		<div class="col-sm-12 col-lg-4" data-aos="fade-in" align="center">
			<svg viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"
				width="90" height="90" aria-hidden="true" fill="#708C91">
				<g>
				<path
					d="M19.33,8.5c0-0.276-0.225-0.5-0.5-0.5h-3.855c-0.275,0-0.5,0.224-0.5,0.5s0.225,0.5,0.5,0.5h3.855 C19.105,9,19.33,8.776,19.33,8.5z"></path>
				<path
					d="M9.906,8.492V8.133c0-0.994-0.798-1.799-1.781-1.799S6.344,7.139,6.344,8.133v0.359 c0,0.994,0.798,1.799,1.781,1.799S9.906,9.486,9.906,8.492z"></path>
				<path
					d="M4.167,13.422v0.528c0,0.165,0.134,0.3,0.3,0.3h7.316c0.166,0,0.3-0.135,0.3-0.3v-0.528 c0-0.713-0.474-1.339-1.162-1.526c-0.75-0.204-1.773-0.417-2.797-0.417s-2.047,0.213-2.797,0.417 C4.641,12.083,4.167,12.709,4.167,13.422z"></path>
				<path
					d="M12,18H1.982V1h2.904C5.11,2.139,6.086,3,7.265,3c1.178,0,2.154-0.861,2.379-2h4.88 c0.225,1.139,1.201,2,2.379,2s2.154-0.861,2.379-2h2.903v9c0,0.276,0.224,0.5,0.5,0.5s0.5-0.224,0.5-0.5V0.5 c0-0.276-0.224-0.5-0.5-0.5H18.83c-0.276,0-0.5,0.224-0.5,0.5c0,0.833-0.643,1.5-1.428,1.5s-1.428-0.667-1.428-1.5 c0-0.276-0.224-0.5-0.5-0.5H9.192c-0.276,0-0.5,0.224-0.5,0.5c0,0.833-0.643,1.5-1.427,1.5S5.837,1.333,5.837,0.5 c0-0.276-0.224-0.5-0.5-0.5H1.482c-0.276,0-0.5,0.224-0.5,0.5v18c0,0.276,0.224,0.5,0.5,0.5H12c0.276,0,0.5-0.224,0.5-0.5 S12.276,18,12,18z"></path>
				<path
					d="M25.354,13.646c-0.195-0.195-0.512-0.195-0.707,0L19,19.293l-2.646-2.646c-0.195-0.195-0.512-0.195-0.707,0 s-0.195,0.512,0,0.707l3,3c0.195,0.195,0.512,0.195,0.707,0l6-6C25.549,14.158,25.549,13.842,25.354,13.646z"></path></g></svg>
			<div class="card-body">
				<h5 class="card-title">Carpool with confidence</h5>
				<p class="card-text text-muted">Government ID verification adds
					another level of security to member profiles.</p>
			</div>
		</div>
		<div class="col-sm-12 col-lg-4" data-aos="fade-left" align="center">
			<svg viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"
				width="90" height="90" aria-hidden="true" fill="#708C91">
				<g>
				<path
					d="M9,23.5c-0.133,0-0.261-0.053-0.355-0.147C8.312,23.017,0.5,15.085,0.5,10c0-5.321,4.322-8.5,8.5-8.5 c4.178,0,8.5,3.179,8.5,8.5c0,1.083-0.353,2.37-1.049,3.825c-0.119,0.249-0.419,0.354-0.667,0.235 c-0.249-0.119-0.354-0.418-0.235-0.667C16.18,12.074,16.5,10.932,16.5,10c0-4.695-3.813-7.5-7.5-7.5S1.5,5.305,1.5,10 c0,4.098,5.967,10.661,7.5,12.279c0.462-0.487,1.327-1.424,2.303-2.599c0.177-0.213,0.492-0.241,0.704-0.065 c0.212,0.177,0.242,0.492,0.065,0.704c-1.475,1.776-2.667,2.982-2.718,3.032C9.261,23.446,9.133,23.5,9,23.5z"></path>
				<path
					d="M9,13.5c-1.93,0-3.5-1.57-3.5-3.5S7.07,6.5,9,6.5s3.5,1.57,3.5,3.5S10.93,13.5,9,13.5z M9,7.5 c-1.378,0-2.5,1.122-2.5,2.5s1.122,2.5,2.5,2.5s2.5-1.122,2.5-2.5S10.378,7.5,9,7.5z"></path>
				<path
					d="M20,20.5c-0.128,0-0.256-0.049-0.354-0.146c-0.195-0.195-0.195-0.512,0-0.707l2.146-2.146H14 c-0.276,0-0.5-0.224-0.5-0.5s0.224-0.5,0.5-0.5h7.793l-2.146-2.146c-0.195-0.195-0.195-0.512,0-0.707s0.512-0.195,0.707,0 l2.999,2.999c0.004,0.004,0.008,0.008,0.011,0.012l0,0c0.001,0,0.001,0,0.001,0c0,0.001,0.001,0.001,0.001,0.001l0,0 c0.042,0.046,0.075,0.097,0.097,0.151c0.022,0.055,0.036,0.113,0.038,0.176l0,0c0,0,0,0,0,0.001c0,0,0,0,0,0.001l0,0 c0,0.009,0,0.017,0,0.025l0,0c0,0.001,0,0.001,0,0.001c0,0.001,0,0.001,0,0.001l0,0c-0.002,0.062-0.016,0.121-0.038,0.176 c-0.021,0.055-0.055,0.105-0.097,0.151l0,0c0,0-0.001,0-0.001,0.001c0,0,0,0-0.001,0l0,0c-0.003,0.004-0.007,0.008-0.011,0.012 l-2.999,2.999C20.256,20.451,20.128,20.5,20,20.5z"></path></g></svg>
			<i class="fas fa-sign"></i>
			<div class="card-body">
				<h5 class="card-title">Get going faster</h5>
				<p class="card-text text-muted">No need to travel across town,
					catch a ride leaving near you.</p>
			</div>
		</div>
	</div>
</div>

<%@ include file="footer.jsp"%>