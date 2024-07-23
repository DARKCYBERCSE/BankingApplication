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


###OUTPUT
![Home Page](https://github.com/user-attachments/assets/c0af1ad9-24a7-4692-867b-54149447c78c)
![Admin Home](https://github.com/user-attachments/assets/1df031ba-d7d0-452c-9140-bfdb87246046)
![Admin Login](https://github.com/user-attachments/assets/6e5e1947-c218-4f3f-b203-cab74331eeef)
![Cutomer Register](https://github.com/user-attachments/assets/6a52692f-1caa-4a3b-8bd0-420032587e86)
![Registartion](https://github.com/user-attachments/assets/7fd5e30d-1416-4236-b0a8-7501ab7ebe37)

#DATABASE 

![DataBaseAdmin](https://github.com/user-attachments/assets/1c06c379-d83f-4f85-b83d-83d652510a54)
![DataBaseCustomer](https://github.com/user-attachments/assets/71534310-3e7b-4382-ba72-f9daef6ed74e)
![DataBaseTransaction](https://github.com/user-attachments/assets/a78bf030-bdd4-4943-a593-c692dc36b182)


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
