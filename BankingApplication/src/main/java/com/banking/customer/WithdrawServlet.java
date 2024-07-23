package com.banking.customer;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.banking.db.TransactionDAO;

@WebServlet("/withdraw")
public class WithdrawServlet extends HttpServlet {
   
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accountNo = request.getParameter("accountNo");
        double amount = Double.parseDouble(request.getParameter("amount"));

        try {
            if (TransactionDAO.withdraw(accountNo, amount)) {
                response.sendRedirect("customer/customer_dashboard.jsp");
            } else {
                response.sendRedirect("customer/withdraw.jsp?error=true");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("customer/withdraw.jsp?error=true");
        }
    }
}