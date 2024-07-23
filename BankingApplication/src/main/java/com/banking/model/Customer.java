package com.banking.model;

public class Customer {
    private String customerId;
    private String fullName;
    private String address;
    private String mobileNo;
    private String email;
    private String accountType;
    private double initialBalance;
    private String dob;
    private String idProof;
    private String accountNo;
    private String password;
    private double balance;

    // Default constructor
    public Customer() {}

    // Constructor with all fields
    public Customer(String customerId, String fullName, String address, String mobileNo, String email, String accountType, double initialBalance, String dob, String idProof, String accountNo, String password) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.address = address;
        this.mobileNo = mobileNo;
        this.email = email;
        this.accountType = accountType;
        this.initialBalance = initialBalance;
        this.dob = dob;
        this.idProof = idProof;
        this.accountNo = accountNo;
        this.password = password;
        this.balance = initialBalance; // Initially, balance is equal to the initial balance
    }

    // Getters and Setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getIdProof() {
        return idProof;
    }

    public void setIdProof(String idProof) {
        this.idProof = idProof;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
