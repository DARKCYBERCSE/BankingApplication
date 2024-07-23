<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Home</title>
    <link rel="stylesheet" type="text/css" href="../css/styles.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        header {
            background-color: #007BFF;
            color: #fff;
            padding: 20px;
            text-align: center;
            position: relative;
        }
        .logo {
            width: 50px;
            height: 50px;
            position: absolute;
            top: 20px;
            left: 20px;
        }
        h1 {
            margin: 0;
            font-size: 2em;
        }
        main {
            padding: 20px;
            max-width: 800px;
            margin: 20px auto;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h2 {
            color: #333;
        }
        .button {
            display: inline-block;
            margin: 10px 0;
            padding: 10px 20px;
            font-size: 18px;
            color: #fff;
            background-color: #007BFF;
            border: none;
            border-radius: 5px;
            text-decoration: none;
            text-align: center;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        .button:hover {
            background-color: #0056b3;
        }
        footer {
            background-color: #007BFF;
            color: #fff;
            text-align: center;
            padding: 10px;
            position: absolute;
            width: 100%;
            bottom: 0;
        }
    </style>
</head>
<body>
    <header>
        <img src="../images/admin_logo.png" alt="Admin Logo" class="logo">
        <h1>Admin Home</h1>
    </header>

    <main>
        <section>
            <h2>Welcome, Admin!</h2>
            <form action="AdminHomeServlet" method="post">
            <a href="register_customer.jsp" class="button">Register Customer</a>
            <a href="manage_customer.jsp" class="button">Manage Customers</a>
            </form>
        </section>
    </main>

    <footer>
        <p>&copy; 2024 Banking Application. All rights reserved.</p>
    </footer>
</body>
</html>
