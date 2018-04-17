function check() {
	$.ajax({
		url : "http://localhost:8888/rp/account/verifyUsername",
		dataType : "text",
		success : function(result) {
			console.log(result);
		}
	});
}
var account = new Vue({
	el : '#accountForm',
	data : {
		username : '',
		password : '',
		confirmpass : '',
		phone : '',
		verifyUsername : ''
	},
	watch : {
		username : function() {
			this.verifyUsernameM();
		},
		confirmpass : function() {
			this.confirmPass();
		}
	},
	methods : {
		verifyUsernameM : _.debounce(function() {
			var message;
			$.ajax({
				url : verifyUsernamePath,
				async : false,
				data : {
					username : this.username
				},
				dataType : 'json',
				success : function(result) {
					if (result) {

					} else {
						message = "该用户名已被使用";
					}
				}
			});
			this.verifyUsername = message;
		}, 500),
		confirmPass : _.debounce(function() {
			var vue = this;
			if (vue.password == null || vue.password == '') {
				console.log("请输入密码");
			} else if (!(vue.password === vue.confirmpass)) {
				console.log("两次输入密码不一致");
				$("#confirmPass").html("两次输入密码不一致")
			} else {
				console.log(vue.password === vue.confirmpass);
			}
		}, 500)
	}
})