package com.banking.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.banking.db.AdminDAO;

@WebServlet("/abc")
public class AdminLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (AdminDAO.validate(username, password)) {
            // Redirect to admin home page
            response.sendRedirect("admin_home.jsp");
        } else {
            // Redirect to login page with error
            response.sendRedirect("admin_login.jsp?error=true");
        }
    }
}
