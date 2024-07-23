package com.banking.admin;

import java.io.IOException;
import java.sql.SQLException;
import java.util.UUID;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.banking.db.CustomerDAO;
import com.banking.model.Customer;
import com.banking.util.PasswordUtil;

@WebServlet("/abc2")
public class RegisterCustomerServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fullName = request.getParameter("fullName");
        String address = request.getParameter("address");
        String mobileNo = request.getParameter("mobileNo");
        String email = request.getParameter("email");
        String accountType = request.getParameter("accountType");
        double initialBalance = Double.parseDouble(request.getParameter("initialBalance"));
        String dob = request.getParameter("dob");
        String idProof = request.getParameter("idProof");

        String accountNo = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
        String tempPassword = PasswordUtil.generateRandomPassword();
        String customerId = UUID.randomUUID().toString(); // Generate a unique customer ID

        Customer customer = new Customer(customerId, fullName, address, mobileNo, email, accountType, initialBalance, dob, idProof, accountNo, tempPassword);

        try {
            CustomerDAO.registerCustomer(customer);
            request.setAttribute("accountNo", accountNo);
            request.setAttribute("password", tempPassword);
            request.getRequestDispatcher("success.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Registration failed due to a database error.");
            request.getRequestDispatcher("register_customer.jsp").forward(request, response);
        }
    }
}
