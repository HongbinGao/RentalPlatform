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
		usernameType : {
			canUse : null,
			message : ''
		},
		password : '',
		passwordType : {
			message : ''
		},
		confirmPass : '',
		confirmPassType : {
			canUse : null,
			message : ''
		},
		phone : '',
		phoneType : {
			canUse : null,
			message : ''
		}
	},
	watch : {
		username : function() {
			this.verifyUsername();
		},
		password : function() {
			this.passwordM();
		},
		confirmPass : function() {
			this.confirmPassM();
		},
		phone : function() {
			this.verifyPhoneM();
		}
	},
	methods : {
		verifyUsername : _.debounce(function() {
			var canUse;
			var message;
			$.ajax({
				url : verifyUsernamePath,
				async : false,
				method : 'post',
				data : {
					username : this.username.value
				},
				dataType : 'json',
				success : function(result) {
					console.log(result);
					if (result) {
						canUse = true;
						message = "该用户名可以使用";
					} else {
						canUse = false;
						message = "该用户名已被使用";
					}
				}
			});
			this.usernameType.canUse = canUse;
			this.usernameType.message = message;
		}, 500),
		passwordM : _.debounce(function() {
			var message;
			if (this.confirmPass != null && this.confirmPass != '') {
				if (this.password.value === this.confirmPass.value) {
					this.confirmPassType.canUse = true;
					this.confirmPassType.message = "";
				} else {
					this.confirmPassType.canUse = false;
					this.confirmPassType.message = "两次输入密码不一致";
				}
			}
		}, 500),
		confirmPassM : _.debounce(function() {
			if (this.password.value == null || this.password.value == '') {
				console.log("请输入密码");
			} else if (this.password.value === this.confirmPass.value) {
				this.confirmPassType.canUse = true;
				this.confirmPassType.message = "";
			} else {
				this.confirmPassType.canUse = false;
				this.confirmPassType.message = "两次输入密码不一致";
			}
		}, 500),
		verifyPhoneM : _.debounce(function() {
			var message;
			$.ajax({
				url : verifyPhonePath,
				async : false,
				method : 'post',
				data : {
					phone : this.phone.value
				},
				dataType : 'json',
				success : function(result) {
					console.log(result);
					if (result) {
						message = "该号码可以使用";
					} else {
						message = "该号码已被使用";
					}
				}
			});
			this.phoneType.message = message;
		}, 500),
		submit : function() {
			console.log("我去注册了")
			$.ajax({
				url : signUpPath,
				method : 'post',
				data : {
					username : this.username,
					password : this.password,
					phone : this.phone
				},
				success : function(result) {

				}
			});
		}
	}
})