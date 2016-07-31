<!doctype html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="/static/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="/static/css/styles.css">
	<script type="text/javascript" src="/static/js/jquery-2.1.1.min.js"></script>
</head>
<body onload="load()">
<div class="wrapper">
    <div class="container">
        <h1>Welcome</h1>
        <form class="form">
            <input type="text" id="account" placeholder="用户名">
            <input type="password" id="pwd" placeholder="密码">
            <button type="button" id="login-button">登录</button>
        </form>
        <div class="alert alert-danger" id="fail"></div>
    </div>

    <ul class="bg-bubbles">
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
        <li></li>
    </ul>

</div>

<script type="text/javascript">

    function load() {
        $("#fail").hide();
    }
    $("#login-button").click(function (event) {
        event.preventDefault();
        var account = $("#account").val();
        var password = $("#pwd").val();
        var jsonObj = {
            "account":account,
            "password":password
        };
        
        
        /* var req = $.post("User/login",jsonObj,function(data){
            $("#fail").addClass("sr-only");
            if(data == "succese"){
                $("form").fadeOut(500);
                $(".wrapper").addClass("form-success");
                setTimeout(function () {
                    location.href="index";
                },1000);
            }else if(data == "fail"){
            	
                $("#fail").text("账号或密码错误");
                $("#fail").fadeIn(500);
				
            }
        }).error(function(){
            $("#fail").text("服务器错误!");
            $("#fail").fadeIn(500);
        }); */
		var req=$.ajax({type:"post",
                url:"User/login",
                dataType:"json",
                data:jsonObj,
                success:function(data){
                    if(data.state == "succese"){
                        $("form").fadeOut(500);
                        $(".wrapper").addClass("form-success");
                        setTimeout(function () {
                            location.href="index";
                        },1000);
                    }else{
                        $("#fail").text("账号或密码错误");
                        $("#fail").fadeIn(500);

                    }
                },
                error:function(){
                    $("#fail").text("服务器错误!");
                    $("#fail").fadeIn(500);
                }
        })
        
        req.complete(function () {
            $("#fail").delay(1000).fadeOut(500);
        });
    });
</script>
</body>
</html>