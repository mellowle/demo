$(function() {
	$("#loginBtn").click(function() {
		console.log("login");
		var username = $("input[name=username]").val();
		//var password = hex_md5($("input[name=password]").val());
		var password = $("input[name=password]").val();
		var user = {
			"username" : username,
			"password" : password
		};
		$.ajax({
			type : "post",
			dataType : "json",
			data : user,
			contentType : "application/x-www-form-urlencoded;charset=UTF-8",
			url : "user/login",
			async : false,
			success : function(data) {
				if (false == data.loginResult) {
					alert("error login");
				} else if (true == data.loginResult) {
					alert("successful");
					var indexUrl = window.location.protocol+"//"+window.location.host+window.location.pathname+"jsp/main.jsp";
					window.location = indexUrl;
				}
			},
			error : function() {
				alert("server error");
			}
		});
	});

});
