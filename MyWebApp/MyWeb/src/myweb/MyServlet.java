package myweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>MyServlet</title></head>");
        out.println("<body>");
        out.println("<p>" + "HELLO!" + "</p>");
        out.println("<p>" + request.getRemoteAddr() + "</p>");
        out.println("<p>" + request.getRequestURL() + "</p>");
        out.println("<p>" + request.getRequestURI() + "</p>");
        out.println("<p>The servlet has received a GET. This is the reply.</p>");
        out.println("</body></html>");
        out.close();
    }

}
