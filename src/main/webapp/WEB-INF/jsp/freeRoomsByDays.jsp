<%--
  Created by IntelliJ IDEA.
  User: ozzy
  Date: 11.03.2018
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>free rooms</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/rest/allFreeRooms">
    <div align="left" style="width: 300px;margin-top: 50px">
        <div class="form-group">
            <label for="exampleInputFrom">From Date</label>
            <input type="text" name="from" class="form-control" id="exampleInputFrom" placeholder="yyyy/mm/dd" />
        </div>
        <div class="form-group">
            <label for="exampleInputFrom">To Date</label>
            <input type="text" name="to" class="form-control" id="exampleInputTo" placeholder="yyyy/mm/dd" />
        </div>
    </div>
    <div style="margin-top: 20px">
        <button type="submit" class="btn btn-primary">SHOW</button>
    </div>
</form>
</body>
</html>
