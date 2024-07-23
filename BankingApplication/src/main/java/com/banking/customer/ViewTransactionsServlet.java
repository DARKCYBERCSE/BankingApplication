package com.banking.customer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.banking.db.TransactionDAO;
import com.banking.model.Transaction;

@WebServlet("/viewTransactions")
public class ViewTransactionsServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve account number from session
        String accountNo = (String) request.getSession().getAttribute("accountNo");

        if (accountNo == null) {
            response.sendRedirect("login.jsp"); // Redirect to login if session is invalid
            return;
        }

        try {
            // Fetch the last 10 transactions
            List<Transaction> transactions = TransactionDAO.getLast10Transactions(accountNo);

            // Set transactions as a request attribute
            request.setAttribute("transactions", transactions);

            // Forward to JSP to display transactions
            request.getRequestDispatcher("customer/view_transactions.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("customer/error.jsp?error=true"); // Redirect to an error page
        }
    }
}
