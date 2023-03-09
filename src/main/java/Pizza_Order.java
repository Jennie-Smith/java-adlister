import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet(name = "Pizza_Order", urlPatterns = "/pizza_order")
public class Pizza_Order {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String crust = request.getParameter("crust");
        String toppings = request.getParameter("toppings");
        String address = request.getParameter("address");
        if(crust == null || address == null) {
            System.out.println("Name and age cannot be null!");
            request.setAttribute("errorMessage", "Name and age cannot be null!");
            request.getRequestDispatcher("/error.jsp").forward(request, response);
            return;
        }

        String PizzaOrder = crust + " " + toppings + " " + address;

        request.setAttribute("pizzaOrder", PizzaOrder);
        request.getRequestDispatcher("/pizza_order.jsp").forward(request, response);
    }

}
