package com.banking.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.banking.model.Transaction;

public class TransactionDAO {
    public static void deposit(String accountNo, double amount) throws SQLException {
        try (Connection connection = DBConnection.getConnection()) {
            String updateBalance = "UPDATE Customer SET balance = balance + ? WHERE account_no = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateBalance);
            preparedStatement.setDouble(1, amount);
            preparedStatement.setString(2, accountNo);
            preparedStatement.executeUpdate();

            String insertTransaction = "INSERT INTO Transaction (account_no, transaction_date, transaction_type, amount) VALUES (?, NOW(), 'Deposit', ?)";
            preparedStatement = connection.prepareStatement(insertTransaction);
            preparedStatement.setString(1, accountNo);
            preparedStatement.setDouble(2, amount);
            preparedStatement.executeUpdate();
        }
    }

    public static boolean withdraw(String accountNo, double amount) throws SQLException {
        try (Connection connection = DBConnection.getConnection()) {
            String checkBalance = "SELECT balance FROM Customer WHERE account_no = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(checkBalance);
            preparedStatement.setString(1, accountNo);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next() && resultSet.getDouble("balance") >= amount) {
                String updateBalance = "UPDATE Customer SET balance = balance - ? WHERE account_no = ?";
                preparedStatement = connection.prepareStatement(updateBalance);
                preparedStatement.setDouble(1, amount);
                preparedStatement.setString(2, accountNo);
                preparedStatement.executeUpdate();

                String insertTransaction = "INSERT INTO Transaction (account_no, transaction_date, transaction_type, amount) VALUES (?, NOW(), 'Withdraw', ?)";
                preparedStatement = connection.prepareStatement(insertTransaction);
                preparedStatement.setString(1, accountNo);
                preparedStatement.setDouble(2, amount);
                preparedStatement.executeUpdate();
                return true;
            } else {
                return false;
            }
        }
    }
    
    public static List<Transaction> getLast10Transactions(String accountNo) throws SQLException {
        List<Transaction> transactions = new ArrayList<>();
        try (Connection connection = DBConnection.getConnection()) {
            String query = "SELECT * FROM Transactions WHERE account_no = ? ORDER BY transaction_date DESC LIMIT 10";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, accountNo);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Transaction transaction = new Transaction();
                transaction.setTransactionId(resultSet.getString("transaction_id"));
                transaction.setAccountNo(resultSet.getString("account_no"));
                transaction.setTransactionType(resultSet.getString("transaction_type"));
                transaction.setAmount(resultSet.getDouble("amount"));
                transaction.setTransactionDate(resultSet.getDate("transaction_date"));
                
                transactions.add(transaction);
            }
        }
        return transactions;
    }
}
