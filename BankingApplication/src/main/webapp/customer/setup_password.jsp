<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Setup Password</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <h1>Setup New Password</h1>
    <form action="setupPassword" method="post">
        <label for="accountNo">Account Number:</label>
        <input type="text" id="accountNo" name="accountNo" required>
        <br>
        <label for="tempPassword">Temporary Password:</label>
        <input type="password" id="tempPassword" name="tempPassword" required>
        <br>
        <label for="newPassword">New Password:</label>
        <input type="password" id="newPassword" name="newPassword" required>
        <br>
        <input type="submit" value="Set Password">
    </form>
    <c:if test="${param.error == 'true'}">
        <p style="color: red;">Failed to set new password</p>
    </c:if>
</body>
</html>
