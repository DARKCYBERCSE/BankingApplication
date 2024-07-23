package com.banking.customer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.banking.db.TransactionDAO;
import com.banking.model.Transaction;
import com.banking.util.PDFGenerator;

@WebServlet("/downloadPDF")
public class DownloadPDFServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("accountNo") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        String accountNo = (String) session.getAttribute("accountNo");

        try {
            List<Transaction> transactions = TransactionDAO.getLast10Transactions(accountNo);
            PDFGenerator.generateTransactionsPDF(transactions, response);
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("customer/error.jsp");
        }
    }
}
