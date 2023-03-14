import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        if they are logged in they can go to the profile page
        HttpSession session = request.getSession();
//        grab x  make sure it's true
        String username = (String) session.getAttribute("username");
        String password = (String) session.getAttribute("password");


        if (username.equals("admin") && username != null && password.equals("password") && password != null ) {
            String user = (String) session.getAttribute("key");
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);
        } else {
            response.sendRedirect("/login");
        }

    }
}
