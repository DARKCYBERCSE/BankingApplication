# Banking Application

## Overview

The Banking Application is a web-based system designed to manage customer bank accounts. It allows customers to register, log in, and manage their accounts, including viewing account details, depositing, withdrawing, and transferring funds. Admin users can manage customer accounts, including registering new customers and modifying or deleting existing accounts.

## Features

### Customer Features
- **Customer Registration:** Allows new customers to register by providing personal and account details.
- **Customer Login:** Customers can log in using their email and password.
- **View Account Details:** Customers can view their account details, including account number, balance, and transaction history.
- **Deposit and Withdraw Funds:** Customers can deposit or withdraw funds from their accounts.
- **Transfer Funds:** Customers can transfer funds to other accounts within the same bank.

### Admin Features
- **Admin Login:** Admins can log in using their credentials.
- **Register Customer:** Admins can register new customers by providing necessary details.
- **Manage Customers:** Admins can view, modify, and delete customer accounts.
- **View All Customers:** Admins can view a list of all customers.

## Technologies Used

- **Frontend:** HTML, CSS, JSP
- **Backend:** Java Servlets
- **Database:** MySQL
- **Tools:** Eclipse IDE, Apache Tomcat 9, MySQL Workbench

## Setup Instructions

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Apache Tomcat 9
- MySQL Server
- Eclipse IDE
- MySQL Workbench (optional, for database management)

### Database Setup
1. Install MySQL Server and MySQL Workbench.
2. Create a new database named `banking`.
3. Execute the following SQL script to create the necessary tables:


###Project Structure:

```sql
BankingApplication/
├── src/
│   ├── com/
│   │   └── banking/
│   │       ├── admin/
│   │       │   ├── AdminLoginServlet.java
│   │       │   ├── RegisterCustomerServlet.java
│   │       │   ├── ManageCustomerServlet.java
│   │       ├── customer/
│   │       │   ├── CustomerLoginServlet.java
│   │       │   ├── SetupPasswordServlet.java
│   │       │   ├── CustomerDashboardServlet.java
│   │       │   ├── ViewTransactionsServlet.java
│   │       │   ├── DepositServlet.java
│   │       │   ├── WithdrawServlet.java
│   │       │   ├── CloseAccountServlet.java
│   │       │   ├── DownloadPDFServlet.java
│   │       ├── db/
│   │       │   ├── DBConnection.java
│   │       │   ├── AdminDAO.java
│   │       │   ├── CustomerDAO.java
│   │       │   ├── TransactionDAO.java
│   │       ├── model/
│   │       │   ├── Admin.java
│   │       │   ├── Customer.java
│   │       │   ├── Transaction.java
│   │       ├── util/
│   │           ├── PasswordUtil.java
│   │           ├── PDFGenerator.java
├── WebContent/
│   ├── META-INF/
│   │   └── context.xml
│   ├── WEB-INF/
│   │   ├── lib/
│   │   ├── web.xml
│   ├── css/
│   │   └── styles.css
│   ├── admin/
│   │   ├── admin_login.jsp
│   │   ├── register_customer.jsp
│   │   ├── manage_customer.jsp
│   ├── customer/
│   │   ├── customer_login.jsp
│   │   ├── setup_password.jsp
│   │   ├── customer_dashboard.jsp
│   │   ├── view_transactions.jsp
│   │   ├── deposit.jsp
│   │   ├── withdraw.jsp
│   │   ├── close_account.jsp
│   │   ├── download_pdf.jsp
│   ├── index.jsp
├── .classpath
├── .project
└── README.md

