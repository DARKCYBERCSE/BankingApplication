<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Deposit</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <h1>Deposit Funds</h1>
    <form action="deposit" method="post">
        <label for="amount">Amount:</label>
        <input type="number" id="amount" name="amount" step="0.01" required>
        <br>
        <input type="submit" value="Deposit">
    </form>
    <c:if test="${param.error == 'true'}">
        <p style="color: red;">Deposit failed</p>
    </c:if>
</body>
</html>
