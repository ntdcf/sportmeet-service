<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/jquery.mobile-1.4.5.css">
    </head>

    <body data-theme="b">
        <div data-role="page" id="pageone" data-theme="b">
            <div data-role="header">
                <h1>新用户注册</h1>
            </div>
            <div data-role="content">
                <form method="post" action="#">
                    <input type="text" name="username" data-clear-btn="true" placeholder="学号"/>
                    <input type="text" name="name" data-clear-btn="true" placeholder="真实姓名"/>
                    <input type="password" name="password" data-clear-btn="true" placeholder="密码"/>
                    <input type="password" name="repassword" data-clear-btm="true" placeholder="确认密码"/>
                    <select>
                        <option value=0>请选择学院</option>
                    </select>
                    <input type="submit" value="注册"/>
                    <input type="reset" value="重置"/>
                </form>
            </div>
        </div>
    </body>

    <script src="js/jquery-1.11.3.min.js"></script>
    <script src="js/jquery.mobile-1.4.5.min.js"></script>
</html>