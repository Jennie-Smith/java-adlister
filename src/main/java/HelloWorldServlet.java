//import java.io.*;
//import javax.servlet.http.*;
//import javax.servlet.annotation.WebServlet;
//
//@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
//extends HttpServlet
public class HelloWorldServlet  {
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<HTML>");
//        out.println("<HEAD> <TITLE> Hello World </TITLE> ");
//        out.println("<BODY> <H1> Hello World! </H1> </BODY></HEAD>");
//    }

public static void main(String[]args){
        String password = "password";
        String login = "login";
        if (password != null && password == "password" && login == "login"){
            System.out.println("yay");
        }
    }
}
