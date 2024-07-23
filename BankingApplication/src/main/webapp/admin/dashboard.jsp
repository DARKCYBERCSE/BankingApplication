<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="../styles.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: #007BFF;
            color: white;
            padding: 20px;
            text-align: center;
        }
        h1 {
            margin: 0;
        }
        nav {
            margin-top: 10px;
        }
        nav ul {
            list-style-type: none;
            padding: 0;
            display: flex;
            justify-content: center;
        }
        nav ul li {
            margin: 0 15px;
        }
        nav ul li a {
            color: white;
            text-decoration: none;
            font-size: 18px;
            padding: 10px 20px;
            border: 2px solid white;
            border-radius: 5px;
            background-color: transparent;
            transition: background-color 0.3s, color 0.3s;
        }
        nav ul li a:hover {
            background-color: white;
            color: #007BFF;
        }
        footer {
            background-color: #007BFF;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>
<body>
    <header>
        <h1>Admin Dashboard</h1>
        <nav>
            <ul>
                <li><a href="register_customer.jsp">Register Customer</a></li>
                <li><a href="manage_customer.jsp">Manage Customers</a></li>
            </ul>
        </nav>
    </header>
    <main>
        <!-- Content goes here -->
    </main>
    <footer>
        <p>&copy; 2024 Banking Application. All rights reserved.</p>
    </footer>
</body>
</html>
