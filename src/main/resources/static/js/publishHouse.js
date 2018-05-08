var form = new Vue({
	el : $("#house"),
	data : {
		house : {
			sheng : "",
			shi : "",
			qu : "",
			xiaoquName : "",
			floor : "",
			area : "",
			shi : "",
			ting : "",
			wei : "",
			rent : "",
			checkInDate : "",
			contactName : "",
			contactPhone : ""
		}
	},
	method : {
		submit : function() {
			var vue = this;
			$.ajax({
				url : "",
				data : $.parseJSON(this.house),
				success : function() {

				}
			});
		}
	}
});