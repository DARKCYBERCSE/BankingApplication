<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Download PDF</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <h1>Download Transactions as PDF</h1>
    <form action="downloadPDF" method="get">
        <input type="submit" value="Download PDF">
    </form>
    <c:if test="${param.error == 'true'}">
        <p style="color: red;">Failed to generate PDF</p>
    </c:if>
</body>
</html>
