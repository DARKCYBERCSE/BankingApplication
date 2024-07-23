<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Banking Application</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
            color: #333;
        }
        header {
            background-color: #007bff;
            color: white;
            text-align: center;
            padding: 20px;
        }
        .logo {
            width: 150px;
            height: auto;
        }
        main {
            padding: 20px;
            text-align: center;
        }
        section {
            margin: 20px 0;
        }
        h2 {
            color: #007bff;
        }
        .section-logo {
            width: 100px;
            height: auto;
            display: block;
            margin: 0 auto 10px;
        }
        a {
            display: inline-block;
            padding: 10px 20px;
            margin: 10px;
            font-size: 18px;
            color: #fff;
            background-color: #007bff;
            text-decoration: none;
            border-radius: 5px;
        }
        a:hover {
            background-color: #0056b3;
        }
        footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            width: 100%;
            bottom: 0;
        }
    </style>
</head>
<body>
    <header>
        <img src="images/bank_logo.png" alt="Bank Logo" class="logo">
        <h1>Welcome to the Banking Application</h1>
    </header>
    
    <main>
        <section>
            <h2>Admin Area</h2>
            <img src="images/admin_logo.png" alt="Admin Logo" class="section-logo">
            <a href="admin/admin_login.jsp">Admin Login</a>
        </section>
        
        <section>
            <h2>Customer Area</h2>
            <img src="images/customer_logo.png" alt="Customer Logo" class="section-logo">
            <a href="customer/customer_login.jsp">Customer Login</a>
        </section>
    </main>

    <footer>
        <p>&copy; 2024 Banking Application. All rights reserved.</p>
    </footer>
</body>
</html>
