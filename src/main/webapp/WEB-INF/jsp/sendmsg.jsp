<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>校园运动会-发布消息</title>
    <link rel="stylesheet" type="text/css" href="css/jquery.mobile-1.4.5.css">

    <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="js/jquery.mobile-1.4.5.min.js"></script>
</head>
<body>
<div data-role="page" data-theme="a">
    <div data-role="main" class="ui-content">
        <form action="sendtomsg2" method="post">
        <table>
            <tr>
                <td>
                    <input type="text" name="msg" id="msg" placeholder="请输入想要发布的消息">
                    <input type="hidden" name="user" id="userid" value="${userid}">
                </td>
                <td><input type="submit" value="发布"></td>
            
            </tr>
        </table>
        </form>

        <ul data-role="listview" data-inset="true">
            <c:forEach var="msg" items="${msg}">
              <li user="${userid}">用户 ${msg.internetname == "" ? msg.username : msg.internetname} 说:<br/>${msg.msg}</li>
            </c:forEach>
        </ul>
    </div>
</div>
</body>
    
    <!-- <script type="text/javascript" src="js/sendmsg.js"></script> -->
</html>