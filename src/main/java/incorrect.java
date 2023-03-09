import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "incorrect", urlPatterns = "/incorrect")
public class incorrect extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String number = request.getParameter("number");
        String lose = "You Lose! You guessed " + number;
        request.setAttribute("lose", lose);
        request.getRequestDispatcher("/guessAnswer.jsp").forward(request, response);
    }
}
