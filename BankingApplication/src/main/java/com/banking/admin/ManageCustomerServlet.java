package com.banking.admin;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.banking.db.CustomerDAO;
import com.banking.model.Customer;

@WebServlet("/abc3")
public class ManageCustomerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        String customerId = request.getParameter("customerId");

        try {
            if (action.equals("delete")) {
                CustomerDAO.deleteCustomer(customerId);
            } else if (action.equals("modify")) {
                String fullName = request.getParameter("fullName");
                String address = request.getParameter("address");
                String mobileNo = request.getParameter("mobileNo");
                String email = request.getParameter("email");
                String accountType = request.getParameter("accountType");
                String dob = request.getParameter("dob");
                String idProof = request.getParameter("idProof");

                Customer customer = new Customer();
                customer.setAccountNo(customerId);
                customer.setFullName(fullName);
                customer.setAddress(address);
                customer.setMobileNo(mobileNo);
                customer.setEmail(email);
                customer.setAccountType(accountType);
                customer.setDob(dob);
                customer.setIdProof(idProof);

                CustomerDAO.updateCustomer(customer);
            }
            response.sendRedirect("manage_customer.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("manage_customer.jsp?error=true");
        }
    }
}
