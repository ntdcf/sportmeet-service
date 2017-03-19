<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/jquery.mobile-1.4.5.css">
    </head>

    <body data-theme="b">
        <div data-role="page" id="pageone" data-theme="b">
            <div data-role="header">
                <h1>用户登录</h1>
            </div>
            <div data-role="content">
                    <div id="msg"></div>
                    <input type="text" name="username" id="username" data-clear-btn="true" placeholder="用户名/学号"/>
                    <input type="password" name="password" id="password" data-clear-btn="true" placeholder="密码"/>
                    <input type="button" id="login" value="登录"/>
                    <input type="reset" value="重置"/>
                    <a href="addUser" class="ui-btn"/> 没有账号？注册一个</a>
            </div>
        </div>
    </body>

    <script src="js/jquery-1.11.3.min.js"></script>
    <script src="js/jquery.mobile-1.4.5.min.js"></script>
    <script src="js/jump.js"/></script>
</html>