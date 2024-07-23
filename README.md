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

###Output

![Home Page](https://github.com/user-attachments/assets/be8c0bab-ef6f-4c04-98e3-1c3b01adc3fe)

![Admin Login](https://github.com/user-attachments/assets/bcd62156-7ef0-4676-8504-aad133973492)

![Admin Home](https://github.com/user-attachments/assets/2a997a08-4c6b-4a94-a230-4885898bfe47)

![Cutomer Register](https://github.com/user-attachments/assets/3d60fd13-ad52-45be-88e4-caea5e5e2592)

![Registartion](https://github.com/user-attachments/assets/ce816619-d918-47c4-84f2-9b652e112f91)

#Datbase Connection

![DataBaseAdmin](https://github.com/user-attachments/assets/8847c5aa-a095-40ca-b0c4-44c870445b0c)

![DataBaseCustomer](https://github.com/user-attachments/assets/55316e65-e87f-4b9d-9b41-3b86483f9157)

![DataBaseTransaction](https://github.com/user-attachments/assets/9530d994-c42e-49c5-93fa-55b427667bb8)

