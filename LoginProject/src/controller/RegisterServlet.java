package controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        String pw = request.getParameter("pw");

        // ⚠️ 실제로는 DB 저장해야 함
        System.out.println("가입됨: " + id + " / " + pw);

        response.sendRedirect("index.html");
    }
}
