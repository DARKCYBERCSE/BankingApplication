package com.banking.model;

import java.util.Date;

public class Transaction {
    private String transactionId;
    private String accountNo;
    private Date transactionDate;
    private String transactionType;
    private double amount;

    // Constructor
    public Transaction() {
    }

    public Transaction(String transactionId, String accountNo, Date transactionDate, String transactionType, double amount) {
        this.transactionId = transactionId;
        this.accountNo = accountNo;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    // Getters and Setters
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
