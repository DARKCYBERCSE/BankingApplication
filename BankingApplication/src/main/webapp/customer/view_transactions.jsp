<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>View Transactions</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <h1>Last 10 Transactions</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Transaction ID</th>
                <th>Account No</th>
                <th>Date</th>
                <th>Type</th>
                <th>Amount</th>
                <th>Description</th>
            </tr>
        </thead>
        <tbody>
            <!-- Assuming `transactions` is a List<Transaction> passed to this JSP -->
            <c:forEach var="transaction" items="${transactions}">
                <tr>
                    <td>${transaction.transactionId}</td>
                    <td>${transaction.accountNo}</td>
                    <td>${transaction.transactionDate}</td>
                    <td>${transaction.transactionType}</td>
                    <td>${transaction.amount}</td>
                    <td>${transaction.description}</td>
                </tr>
            </c:forEach>
            <c:if test="${empty transactions}">
                <tr>
                    <td colspan="6">No transactions found.</td>
                </tr>
            </c:if>
        </tbody>
    </table>
    <a href="customer/customerDashboard">Back to Dashboard</a>
</body>
</html>
