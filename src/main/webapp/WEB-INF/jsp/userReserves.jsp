<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>reserves</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/rest/reserves" method="post">
    <div class="form-group">
        <label for="exampleInputSurname">Surname</label>
        <input type="text" name="surname" class="form-control" id="exampleInputSurname" aria-describedby="emailHelp"
               placeholder="Enter surname"/>
    </div>
    <div class="form-group">
        <label for="exampleInputPassword">Password</label>
        <input type="password" name="password" class="form-control" id="exampleInputPassword" placeholder="Password"/>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
