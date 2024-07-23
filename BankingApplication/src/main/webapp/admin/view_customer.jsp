<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Customer</title>
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
        .detail {
            margin-bottom: 20px;
        }
        .detail span {
            font-weight: bold;
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
    </style>
</head>
<body>
    <div class="container">
        <h1>View Customer</h1>
        <div class="detail">
            <span>Customer ID:</span> ${customer.customerId}
        </div>
        <div class="detail">
            <span>Full Name:</span> ${customer.fullName}
        </div>
        <div class="detail">
            <span>Email:</span> ${customer.email}
        </div>
        <div class="detail">
            <span>Account Type:</span> ${customer.accountType}
        </div>
        <div class="detail">
            <span>Address:</span> ${customer.address}
        </div>
        <div class="detail">
            <span>Mobile No:</span> ${customer.mobileNo}
        </div>
        <div class="detail">
            <span>Date of Birth:</span> ${customer.dob}
        </div>
        <div class="detail">
            <span>ID Proof:</span> ${customer.idProof}
        </div>
        <a href="manage_customer.jsp" class="button">Back to Manage Customers</a>
    </div>
</body>
</html>
