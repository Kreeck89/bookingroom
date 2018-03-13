<%--
  Created by IntelliJ IDEA.
  User: ozzy
  Date: 10.03.2018
  Time: 23:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Filters</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
<form action="/register/reservation" method="post">
    <div align="left" style="width: 300px;margin-top: 50px">
        <select id="selectbasic1" name="category" class="form-control">
            <option value="default">Select Category</option>
            <option value="STANDARD">STANDARD</option>
            <option value="LUX">LUX</option>
        </select>
        <div class="form-group">
            <label for="exampleInputSurname">Surname</label>
            <input type="text" name="surname" class="form-control" id="exampleInputSurname" aria-describedby="emailHelp" placeholder="Enter surname" />
        </div>
        <div class="form-group">
            <label for="exampleInputPassword">Password</label>
            <input type="password" name="password" class="form-control" id="exampleInputPassword" placeholder="Password" />
        </div>
        <div class="form-group">
            <label for="exampleInputFrom">From Date</label>
            <input type="date" name="from" class="form-control" id="exampleInputFrom" aria-describedby="emailHelp" placeholder="yyyy/mm/dd" />
        </div>
        <div class="form-group">
            <label for="exampleInputTo">To Date</label>
            <input type="date" name="to" class="form-control" id="exampleInputTo" placeholder="yyyy/mm/dd" />
        </div>
    </div>
        <div style="margin-top: 20px">
            <button type="submit" class="btn btn-primary">RESERVE</button>
        </div>
    </form>
</body>
</html>
