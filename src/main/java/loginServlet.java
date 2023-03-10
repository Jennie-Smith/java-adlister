import javax.servlet.http.HttpServlet;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "login", urlPatterns = "/login")
public class loginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        System.out.println("hey");
        if (login != null && login.equals("admin" ) && password != null && password.equals("password") ){
            request.setAttribute("login", login);
            request.setAttribute("password", password);
            request.getRequestDispatcher("/profile.jsp").forward(request, response);
        }
    }
}
