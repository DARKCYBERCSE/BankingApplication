package com.banking.customer;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.banking.db.CustomerDAO;
import com.banking.model.Customer;

@WebServlet("/viewCustomer")
public class ViewCustomerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String customerId = request.getParameter("customerId");

        try {
            Customer customer = CustomerDAO.getCustomerById(customerId);
            request.setAttribute("customer", customer);
            request.getRequestDispatcher("view_customer.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("manage_customer.jsp?error=true");
        }
    }
}
