<%@ include file="navbar.jsp" %>
<div id="body">
    <div id="main_body">
        <form id="form" class="border" method="POST" action="CarServlet?action=publish_offer">
            <label>Pick-up and drop-off points</label>
            <div class="dropdown-divider" style="margin: 10px -50px 20px -50px;"></div>
            <div class="row offer_row">
                <div class="col">
                <label>Pick-up</label>
                <input type="text" class="form-control" name="pickup" placeholder="Pick-up">
                </div>
                <div class="col">
                <label>Drop-off</label>
                <input type="text" class="form-control" name="dropoff" placeholder="Drop-off">
                </div>
            </div>
            <div class="row offer_row">
                <div class="col">
                <label>Date</label>
                <input type="date" class="form-control" name="date" placeholder="">
                </div>
                <div class="col">
                <label>Time</label>
                <input type="time" class="form-control" name="time" placeholder="">
                </div>
            </div>
            <div class="row offer_row">
                <div class="col">
                <label>Price per co-traveller</label>
                <input type="text" class="form-control" name="price" placeholder="Price per co-traveller">
                </div>
                <div class="col">
                <label>Number of seats</label>
                <input type="number" class="form-control" name="seats" value="3" placeholder="Number of seats">
                </div>
            </div>
            <div class="dropdown-divider" style="margin: 30px -50px 30px -50px;"></div>
            <button type="submit" class="btn btn-primary">Publish Offer</button>
        </form>
    </div>
</div>
