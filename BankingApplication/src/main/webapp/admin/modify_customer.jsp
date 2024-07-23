
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modify Customer</title>
    <link rel="stylesheet" href="css/styles.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        .container {
            max-width: 600px;
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
        form {
            display: flex;
            flex-direction: column;
        }
        label {
            margin: 10px 0 5px;
        }
        input, select {
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-bottom: 20px;
        }
        .button {
            padding: 10px 15px;
            color: #fff;
            background-color: #28a745;
            border: none;
            border-radius: 5px;
            text-decoration: none;
            cursor: pointer;
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
        <h1>Modify Customer</h1>
        <c:if test="${param.error == 'true'}">
            <p class="error-message">An error occurred while processing your request.</p>
        </c:if>
        <form action="abc3" method="get">
            <input type="hidden" name="action" value="modify">
            <input type="hidden" name="customerId" value="${customer.customerId}">
            <label for="fullName">Full Name:</label>
            <input type="text" id="fullName" name="fullName" value="${customer.fullName}" required>
            <label for="address">Address:</label>
            <input type="text" id="address" name="address" value="${customer.address}" required>
            <label for="mobileNo">Mobile No:</label>
            <input type="text" id="mobileNo" name="mobileNo" value="${customer.mobileNo}" required>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" value="${customer.email}" required>
            <label for="accountType">Account Type:</label>
            <select id="accountType" name="accountType" required>
                <option value="Saving" <c:if test="${customer.accountType == 'Saving'}">selected</c:if>>Saving</option>
                <option value="Current" <c:if test="${customer.accountType == 'Current'}">selected</c:if>>Current</option>
            </select>
            <label for="dob">Date of Birth:</label>
            <input type="date" id="dob" name="dob" value="${customer.dob}" required>
            <label for="idProof">ID Proof:</label>
            <input type="text" id="idProof" name="idProof" value="${customer.idProof}" required>
            <button type="submit" class="button">Save Changes</button>
        </form>
    </div>
</body>
</html>
