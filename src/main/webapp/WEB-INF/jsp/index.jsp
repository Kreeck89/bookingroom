<%--
  Created by IntelliJ IDEA.
  User: ozzy
  Date: 05.03.2018
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        .navbar {
            margin-bottom: 0;
            border-radius: 0;
        }
        .row.content {
            height: 450px
        }
        footer {
            background-color: #555;
            color: white;
            padding: 15px;
        }
        @media screen and (max-width: 767px) {
            .row.content {
                height: auto;
            }
        }
    </style>
    <title>Main page</title>
</head>
<body>


<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/rest/allReserves">Show Reserves</a></li>
                <li class="active"><a href="/freeRooms">Free Rooms</a></li>
                <li class="active"><a href="/userSum">User Sum</a></li>
                <li class="active"><a href="/userReserves">Your reserves</a></li>
                <li><a href="/filters">Found With Filters</a></li>
                <li><a href="/reservation">Reservation</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="/registration"><span class="glyphicon glyphicon-log-in"></span>Registration</a></li>
            </ul>
        </div>
    </div>
</nav>
<br/>

<%--<div class="container-fluid text-center">--%>
    <%--<div class="row content">--%>
        <%--<div class="col-sm-8 text-left">--%>
            <%--<div>--%>
                <%--<div class="well">--%>
                    <%--<div class="panel-body">--%>
                        <%--<h1>Booking Rooms</h1>--%>
                        <%--<p>--%>
                            <%--It`s home project with <b>Spring framework</b><br/>--%>
                            <%--sources of this project you can see <a href="https://github.com/Kreeck89/Reminder">here</a>--%>
                        <%--</p>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>

            <%--<div th:each="remind : ${reminders}">--%>
                <%--<h3 th:text="${remind.title}"/>--%>
                <%--<p th:text="${remind.about}"/>--%>
                <%--<!--<p th:text="${remind.date}"/>-->--%>
                <%--<hr/>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>
</body>