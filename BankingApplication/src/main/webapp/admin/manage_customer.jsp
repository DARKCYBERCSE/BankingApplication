<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manage Customers</title>
    <link rel="stylesheet" href="css/styles.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        .container {
            max-width: 800px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        }
        h1 {
            text-align: center;
            color: #333;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        table, th, td {
            border: 1px solid #ddd;
        }
        th, td {
            padding: 12px;
            text-align: left;
        }
        th {
            background-color: #f4f4f4;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        .button {
            padding: 10px 15px;
            color: #fff;
            background-color: #28a745;
            border: none;
            border-radius: 5px;
            text-decoration: none;
            margin-right: 5px;
        }
        .button:hover {
            background-color: #218838;
        }
        .error-message {
            color: red;
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Manage Customers</h1>
        <c:if test="${param.error == 'true'}">
            <p class="error-message">An error occurred while processing your request.</p>
        </c:if>
        <table>
            <thead>
                <tr>
                    <th>Customer ID</th>
                    <th>Full Name</th>
                    <th>Email</th>
                    <th>Account Type</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <!-- Assuming `customers` is a List<Customer> passed to this JSP -->
                <c:forEach var="customer" items="${customers}">
                    <tr>
                        <td>${customer.customerId}</td>
                        <td>${customer.fullName}</td>
                        <td>${customer.email}</td>
                        <td>${customer.accountType}</td>
                        <td>
                            <form action="ManageCustomerServlet" method="get" style="display:inline;">
                                <input type="hidden" name="action" value="delete">
                                <input type="hidden" name="customerId" value="${customer.customerId}">
                                <button type="submit" class="button" style="background-color: #dc3545;">Delete</button>
                            </form>
                            <form action="modify_customer.jsp" method="get" style="display:inline;">
                                <input type="hidden" name="customerId" value="${customer.customerId}">
                                <button type="submit" class="button">Modify</button>
                            </form>
                            <form action="view_customer.jsp" method="get" style="display:inline;">
                                <input type="hidden" name="customerId" value="${customer.customerId}">
                                <button type="submit" class="button" style="background-color: #17a2b8;">View</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="register_customer.jsp" class="button">Register New Customer</a>
    </div>
</body>
</html>
