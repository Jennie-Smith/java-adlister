import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "guess", urlPatterns = "/guess")
public class guess extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/userguess.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String number = request.getParameter("number");
        System.out.println(number);
        if(number.equals("3")) {
            response.sendRedirect("/correct?number=" + number);
        } else {
            response.sendRedirect("/incorrect?number=" + number);
        }
    }
}
