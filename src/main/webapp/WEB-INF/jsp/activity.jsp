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
                <h1>活动查询</h1>
            </div>
            <div data-role="content">
                <form>
                    <input type="text" name="username" data-clear-btn="true" placeholder="请输入要查询的内容"/>
                </form>
            </div>
            <div  data-role="main" class="ui-content">
            <div>
                <ul data-role="listview" id="listAct">
                                   <li>
                                       <div data-role="controlgroup" data-type="horizontal" align="center">
                                           <a href="activity" class="ui-btn ui-icon-search ui-btn-icon-left">活动查询</a>
                                           <a href="signup" class="ui-btn ui-icon-grid ui-btn-icon-left">项目报名</a>
                                       </div>
                                   </li>
                </ul>
            </div>
        </div>
    </div>
    </body>

    <script src="js/jquery-1.11.3.min.js"></script>
    <script src="js/jquery.mobile-1.4.5.min.js"></script>
</html>