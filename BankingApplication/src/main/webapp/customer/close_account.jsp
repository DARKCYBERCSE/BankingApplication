<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Close Account</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
    
</head>
<body>
    <h1>Close Account</h1>
    <form action="closeAccount" method="post">
        <p>Are you sure you want to close your account?</p>
        <input type="submit" value="Close Account">
    </form>
    <c:if test="${param.error == 'true'}">
        <p style="color: red;">Account closure failed</p>
    </c:if>
</body>
</html>
