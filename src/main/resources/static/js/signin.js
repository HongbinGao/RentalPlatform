var account = new Vue({
	el : '#accountForm',
	data : {
		submitData : {
			username : '',
			password : '',
			role : ''
		}
	},
	methods : {
		submit : function() {
			var vue = this;
			$.ajax({
				url : "account/signIn",
				method:"post",
				data : vue.submitData
			})
		}
	}
})