<%--
  Created by IntelliJ IDEA.
  User: ozzy
  Date: 11.03.2018
  Time: 00:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>summary</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/rest/summary" method="post">
    <div class="form-group">
        <label for="exampleInputSurname">Surname</label>
        <input type="text" name="surname" class="form-control" id="exampleInputSurname" aria-describedby="emailHelp" placeholder="Enter surname" />
    </div>
    <div class="form-group">
        <label for="exampleInputPassword">Password</label>
        <input type="password" name="password" class="form-control" id="exampleInputPassword" placeholder="Password" />
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
