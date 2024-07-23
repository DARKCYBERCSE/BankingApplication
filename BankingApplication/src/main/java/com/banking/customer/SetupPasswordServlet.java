package com.banking.customer;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.banking.db.CustomerDAO;

@WebServlet("/setupPassword")
public class SetupPasswordServlet extends HttpServlet {
  
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accountNo = request.getParameter("accountNo");
        String tempPassword = request.getParameter("tempPassword");
        String newPassword = request.getParameter("newPassword");

        try {
            if (CustomerDAO.setupPassword(accountNo, tempPassword, newPassword)) {
                response.sendRedirect("customer/customer_login.jsp");
            } else {
                response.sendRedirect("customer/setup_password.jsp?error=true");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("customer/setup_password.jsp?error=true");
        }
    }
}
