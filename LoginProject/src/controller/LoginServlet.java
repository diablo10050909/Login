package controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        String pw = request.getParameter("pw");

        // 🔴 임시 계정 (DB 대신)
        if(id.equals("test") && pw.equals("1234")) {
            HttpSession session = request.getSession();
            session.setAttribute("user", id);
            response.sendRedirect("main.jsp");
        } else {
            response.sendRedirect("index.html");
        }
    }
}
