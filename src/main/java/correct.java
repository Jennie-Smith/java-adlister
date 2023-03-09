import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "correct", urlPatterns = "/correct")
public class correct extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String number = request.getParameter("number");
        String win = "You Win! You guessed " + number;
        request.setAttribute("win", win);
        request.getRequestDispatcher("/guessAnswer.jsp").forward(request, response);
    }
}
