
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Dashboard</title>
    <link rel="stylesheet" href="../styles.css">
</head>
<body>
    <header>
        <h1>Customer Dashboard</h1>
        <nav>
            <ul>
                <li><a href="view_transactions.jsp">View Transactions</a></li>
                <li><a href="deposit.jsp">Deposit Funds</a></li>
                <li><a href="withdraw.jsp">Withdraw Funds</a></li>
                <li><a href="close_account.jsp">Close Account</a></li>
                <li><a href="download_pdf.jsp">Download Transactions as PDF</a></li>
                <li><a href="setup_password.jsp">Setup Password</a></li>
            </ul>
        </nav>
    </header>
    <footer>
        <p>&copy; 2024 Banking Application. All rights reserved.</p>
    </footer>
</body>
</html>

