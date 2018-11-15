package servlets.users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class UserServlet extends HttpServlet {
    private List<User> users;



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.addHeader("Content-Type", "text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>Działam</h1>");
        createForm(writer);
       for (User user: users){
           writer.println("<br/>");
           writer.println("<a href = \"" + "\"" + user.getFirstName() + "\"" + user.getGender() + "\"" + user.getLastName() + "</a>");

       }
}

    private void createForm(PrintWriter writer) {
        String form = "<form action=\"\" method=\"post\">\n" +
                "    FirstName: <input type=\"text\" name=\"First Name\">\n" +
                "    <br>\n" +
                "    LastName: <input type=\"text\" name=\"Last Name\">\n" +
                "    <br>\n" +
                "    Age: <input type=\"text\" name=\"Age\">\n" +
                "    <br>\n" +
                "    Gender: <input type=\"text\" gender=\"Gender\">\n" +
                "    <br>\n" +
                "    <input type=\"submit\">\n" +
                "</form>";

        writer.println(form);
    }
    public void init() throws ServletException {
        this.users = new ArrayList<>();
        users.add(new User("Jan","Warszak","22","Men"));
        users.add(new User("Monika","Sander","30","Women"));
        users.add(new User("Goerge","Lucas","44","Men"));

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String age = req.getParameter("age");
        String gender = req.getParameter("gender");

        users.add(new User( name, lastName, age, gender));
        resp.sendRedirect(req.getContextPath() + req.getServletPath());

    }
}
