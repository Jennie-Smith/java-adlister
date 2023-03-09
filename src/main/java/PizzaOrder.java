import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet(name = "PizzaOrder", urlPatterns = "/pizza-order")
public class PizzaOrder extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String crust = request.getParameter("crust");
        String toppings = request.getParameter("toppings");
        String address = request.getParameter("address");

        String PizzaOrder = crust + " " + toppings + " " + address;
        request.setAttribute("pizzaOrder", PizzaOrder);
        request.getRequestDispatcher("/pizza_order.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("hey it's called!");
        String crust = request.getParameter("crust");
        String toppings = request.getParameter("toppings");
        String address = request.getParameter("address");
        System.out.println("Order is " + crust + " " + toppings + " " + address);

        request.getRequestDispatcher("/pizza_order.jsp").forward(request, response);

    }
}
