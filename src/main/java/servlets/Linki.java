package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Linki extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.addHeader("Content-Type", "text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<br>");
        writer.println( "<a href = \"https://jbzdy.pl/dzida\">JBZD</a> ");
        writer.println("</br>");
        writer.println("<br>");
        writer.println("<a href = \"https://pl.wikipedia.org/\">Wiki</a> ");
        writer.println("</br>");
        writer.println("<br>");
        writer.println("<a href = \"https://demotywatory.pl/\">Demo</a> ");
        writer.println("</br>");


    }
}
