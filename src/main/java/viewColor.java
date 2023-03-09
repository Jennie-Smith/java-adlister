import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "viewColor", urlPatterns = "/viewColor")
public class viewColor extends HttpServlet{

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                String color = request.getParameter("color");
                request.setAttribute("color", color);
                request.getRequestDispatcher("/coloredpage.jsp").forward(request, response);
        }

}
