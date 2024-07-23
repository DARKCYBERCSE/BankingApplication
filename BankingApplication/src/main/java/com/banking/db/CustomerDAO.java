package com.banking.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.banking.model.Customer;


public class CustomerDAO {
	public static void registerCustomer(Customer customer) throws SQLException {
        try (Connection connection = DBConnection.getConnection()) {
            String query = "INSERT INTO Customer (full_name, address, mobile_no, email, account_type, initial_balance, dob, id_proof, account_no, password, balance) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, customer.getFullName());
            preparedStatement.setString(2, customer.getAddress());
            preparedStatement.setString(3, customer.getMobileNo());
            preparedStatement.setString(4, customer.getEmail());
            preparedStatement.setString(5, customer.getAccountType());
            preparedStatement.setDouble(6, customer.getInitialBalance());
            preparedStatement.setString(7, customer.getDob());
            preparedStatement.setString(8, customer.getIdProof());
            preparedStatement.setString(9, customer.getAccountNo());
            preparedStatement.setString(10, customer.getPassword());
            preparedStatement.setDouble(11, customer.getBalance());
            preparedStatement.executeUpdate();
        }
    }

    
    public static void deleteCustomer(String customerId) throws SQLException {
        try (Connection connection = DBConnection.getConnection()) {
            String query = "DELETE FROM Customer WHERE account_no = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, customerId);
            preparedStatement.executeUpdate();
        }
    }

    public static boolean validate(String accountNo, String password) {
        try (Connection connection = DBConnection.getConnection()) {
            String query = "SELECT * FROM Customer WHERE account_no = ? AND password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, accountNo);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean setupPassword(String accountNo, String tempPassword, String newPassword) throws SQLException {
        try (Connection connection = DBConnection.getConnection()) {
            String query = "UPDATE Customer SET password = ? WHERE account_no = ? AND password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, newPassword);
            preparedStatement.setString(2, accountNo);
            preparedStatement.setString(3, tempPassword);
            return preparedStatement.executeUpdate() > 0;
        }
    }

    public static boolean closeAccount(String accountNo) throws SQLException {
        try (Connection connection = DBConnection.getConnection()) {
            String query = "DELETE FROM Customer WHERE account_no = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, accountNo);
            return preparedStatement.executeUpdate() > 0;
        }
    }
    
    public static void updateCustomer(Customer customer) throws SQLException {
        try (Connection connection = DBConnection.getConnection()) {
            String query = "UPDATE Customer SET full_name = ?, address = ?, mobile_no = ?, email = ?, account_type = ?, dob = ?, id_proof = ? WHERE account_no = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, customer.getFullName());
            preparedStatement.setString(2, customer.getAddress());
            preparedStatement.setString(3, customer.getMobileNo());
            preparedStatement.setString(4, customer.getEmail());
            preparedStatement.setString(5, customer.getAccountType());
            preparedStatement.setString(6, customer.getDob());
            preparedStatement.setString(7, customer.getIdProof());
            preparedStatement.setString(8, customer.getAccountNo());
            preparedStatement.executeUpdate();
        }
    }
    
    public static Customer getCustomerByAccountNo(String accountNo) throws SQLException {
        Customer customer = null;
        try (Connection connection = DBConnection.getConnection()) {
            String query = "SELECT * FROM Customer WHERE account_no = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, accountNo);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                customer = new Customer();
                customer.setCustomerId(resultSet.getString("customer_id"));
                customer.setFullName(resultSet.getString("full_name"));
                customer.setAddress(resultSet.getString("address"));
                customer.setMobileNo(resultSet.getString("mobile_no"));
                customer.setEmail(resultSet.getString("email"));
                customer.setAccountType(resultSet.getString("account_type"));
                customer.setInitialBalance(resultSet.getDouble("initial_balance"));
                customer.setDob(resultSet.getString("dob"));
                customer.setIdProof(resultSet.getString("id_proof"));
                customer.setAccountNo(resultSet.getString("account_no"));
                customer.setPassword(resultSet.getString("password"));
                customer.setBalance(resultSet.getDouble("balance"));
            }
        }
        return customer;
    }
    
    public static Customer getCustomerById(String customerId) throws SQLException {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            connection = DBConnection.getConnection();
            String query = "SELECT * FROM customers WHERE customer_id = ?";
            stmt = connection.prepareStatement(query);
            stmt.setString(1, customerId);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Customer customer = new Customer();
                customer.setCustomerId(rs.getString("customer_id"));
                customer.setFullName(rs.getString("full_name"));
                customer.setAddress(rs.getString("address"));
                customer.setMobileNo(rs.getString("mobile_no"));
                customer.setEmail(rs.getString("email"));
                customer.setAccountType(rs.getString("account_type"));
                customer.setInitialBalance(rs.getDouble("initial_balance"));
                customer.setDob(rs.getString("dob"));
                customer.setIdProof(rs.getString("id_proof"));
                customer.setAccountNo(rs.getString("account_no"));
                customer.setPassword(rs.getString("password"));
                return customer;
            } else {
                return null; // Customer not found
            }
        } finally {
            DBConnection.close(rs, stmt, connection);
        }
    }
}
