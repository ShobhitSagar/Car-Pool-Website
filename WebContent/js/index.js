_today: function fun() {
	  var myDate = document.querySelector(datePicker);
	  var today = new Date();
	  myDate.value = today.toISOString().substr(0, 10);
}