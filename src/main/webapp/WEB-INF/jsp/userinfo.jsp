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
                <a href="#" class="ui-btn ui-icon-home ui-btn-icon-left">主页</a>
                <h1>运动会</h1>
                <a href="#" class="ui-btn ui-icon-back ui-btn-icon-left">退出登录</a>
            </div>
            <div  data-role="main" class="ui-content">
                <div>
                    <ul data-role="listview">
                        <li>用户：XXX</li>
                        <li>学号：XXX</li>
                        <li>
                            <div data-role="controlgroup" data-type="horizontal" align="center">
                                <a href="activity" class="ui-btn ui-icon-search ui-btn-icon-left">活动查询</a>
                                <a href="signup" class="ui-btn ui-icon-grid ui-btn-icon-left">项目报名</a>
                            </div>
                        </li>
                        <li>
                            <div data-role="controlgroup" data-type="horizontal" align="center">
                                <a href="#" class="ui-btn ui-icon-alert ui-btn-icon-left">天气查询</a>
                                <a href="#" class="ui-btn ui-icon-audio ui-btn-icon-left">信息发布</a>   
                            </div>
                        </li>
                        <li>
                            <div data-role="controlgroup" data-type="horizontal" align="center">
                                <a href="#" class="ui-btn ui-icon-info ui-btn-icon-left">用户详情</a>
                                <a href="#" class="ui-btn ui-icon-location ui-btn-icon-left">校园地图</a>   
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

<img w