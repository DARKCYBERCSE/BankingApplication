package com.banking.customer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.banking.db.CustomerDAO;

@WebServlet("/customerLogin")
public class CustomerLoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accountNo = request.getParameter("accountNo");
        String password = request.getParameter("password");

        if (CustomerDAO.validate(accountNo, password)) {
            response.sendRedirect("customer/customer_dashboard.jsp");
        } else {
            response.sendRedirect("customer/customer_login.jsp?error=true");
        }
    }
}
