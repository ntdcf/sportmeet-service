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
                <h1>项目报名</h1>
            </div>
            <div data-role="content">
                <ul data-role="listview">
                        <li>
                            <input type="text" name="username" data-clear-btn="true" placeholder="搜索"/>
                        </li>
                        <div>
                            <li>
                                <div data-role="controlgroup" data-type="horizontal" align="center">
                                    <a href="#" class="ui-btn">短跑</a>
                                    <a href="#" class="ui-btn">长跑</a>   
                                </div>
                            </li>
                            <li>
                                <div data-role="controlgroup" data-type="horizontal" align="center">
                                    <a href="#" class="ui-btn">接力</a>
                                    <a href="#" class="ui-btn">田赛</a>   
                                </div>
                            </li>
                        </div>
                    </ul>
            </div>
            <div>
                
            </div>
        </div>
    </body>

    <script src="js/jquery-1.11.3.min.js"></script>
    <script src="js/jquery.mobile-1.4.5.min.js"></script>
</html>