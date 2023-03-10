import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@WebServlet(name = "ads", urlPatterns = "/ads")
public class ListAdsDaoServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/products/create.jsp").forward(request, response);
    }
//    list ads dao method make a factory

}
