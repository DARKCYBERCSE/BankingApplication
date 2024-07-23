<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Withdraw</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <h1>Withdraw Funds</h1>
    <form action="withdraw" method="post">
        <label for="amount">Amount:</label>
        <input type="number" id="amount" name="amount" step="0.01" required>
        <br>
        <input type="submit" value="Withdraw">
    </form>
    <c:if test="${param.error == 'true'}">
        <p style="color: red;">Withdrawal failed</p>
    </c:if>
</body>
</html>
