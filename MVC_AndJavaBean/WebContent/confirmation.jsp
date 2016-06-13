<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Title</title>
</head>
<body>
    <h1>You are now part of the list</h1>

    <p>The information you have entered is :</p>
    <label>Email:</label>
    <span>${ user.email }</span><br>
    <label>First Name:</label>
    <span>${ user.firstName }</span><br>
    <label>Last Name:</label>
    <span>${ user.lastName }</span><br>
    
    
    <p>To enter more, hit the return button :</p>
        <form action="" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>
    
</body>
</html>