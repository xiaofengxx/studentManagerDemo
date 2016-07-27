<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>导航</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/css/custom-styles.css">

    <link rel="stylesheet" href="/static/css/hudongwuxianstyle.css">
</head>
<body>
<div id="wrapper">
    <nav class="navbar-default navbar-side top hdwx-bg clear-padding">
        <div>
            <img src="/static/images/logo.jpg" class="img-circle center-block logo">
            <div class=" name center-block text-center">
                <label class="word-white bottom-white pointer">
                    admin
                    <i class="glyphicon glyphicon-edit word-sm icon-btn"></i>
                </label>
                <br>
                <div class="center-block attach-top">
                    <label class="word-white pointer word-sm" href="index">基本信息</label>
                    <label class="word-white pointer word-sm attach-left" onclick="logout()">注销</label>
                </div>
            </div>
        </div>
        <div class="sidebar-collapse relative">
            <ul class="nav" id="main-menu">
                <li>
                    <a class="active-menu" onclick="index()">
                        <i class="glyphicon glyphicon-home"></i>
                        首页
                    </a>
                </li>
                <li>
                    <a>
                        <i class="glyphicon glyphicon-user"></i>
                        用户管理
                    </a>
                    <span class="glyphicon glyphicon-menu-down pull-right icon word-white"></span>
                    <ul class="nav nav-second-level collapse" aria-expanded="false" style="">
                        <li>
                            <a onclick="addUser()">添加用户</a>
                        </li>
                        <li>
                            <a onclick="addUserGroup()">添加用户组</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="index">
                        <i class="glyphicon glyphicon-education"></i>
                        学生管理
                    </a>
                </li>
                <li>
                    <a href="index">
                        <i class="glyphicon glyphicon-yen"></i>
                        还款管理
                    </a>
                </li>
                <li>
                    <a href="index">
                        <i class="glyphicon glyphicon-blackboard"></i>
                        出勤管理
                    </a>
                </li>
                <li>
                    <a href="index">
                        <i class="glyphicon glyphicon-book"></i>
                        证书管理
                    </a>
                </li>
                <li>
                    <a href="index">
                        <i class="glyphicon glyphicon-cog"></i>
                        通用设置
                    </a>
                </li>
                <li>
                    <a href="index">
                        <i class="glyphicon glyphicon-pencil"></i>
                        报名学生
                    </a>
                </li>
            </ul>
        </div>

    </nav>
    <div id="page-wrapper">
        <div id="hudongwuxian"></div>
	</div>
<script type="text/javascript" src="/static/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="/static/js/hudongwuxian.js" charset="UTF-8"></script>

<!-- Bootstrap Js -->
<script src="/static/js/bootstrap.min.js"></script>
</body>
</html>