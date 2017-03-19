$("#login").click(function() {
    var username = $("#username").val();
    var password = $("#password").val();
    var array = {
        "username":username,
        "password":password,
    };
    var userdata = JSON.stringify(array);

    $.ajax({
        url:"login",
        data:"data="+userdata,
        type:"post",
        dataType:"json",
        success: function(data) {
            if (data) {
                location.replace(location.href);
            }
            else
                $("#msg").html("用户名或者密码输入错误，请重试");
        }
    });
});

$("#logout").click(function() {
    $.ajax({
        url:"logout.do",
        type:"get",
        success:function(data) {
            location.replace(location.href);
        }
    });
});
