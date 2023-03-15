package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.*;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = false;

        // TODO: find a record in your database that matches the submitted password
        // TODO: make sure we find a user with that username
        // TODO: check the submitted password against what you have in your database
        User user = null;

        try{
            user = DaoFactory.getUserDao().findByUsername(username);

            if(user.getPassword().equals(password)){
                validAttempt = true;
            };
        } catch(Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        if (validAttempt){
            request.getSession().setAttribute("user", user);
            response.sendRedirect("/profile");
        } else{
            response.sendRedirect("/login");
        }


//        Users dao = DaoFactory.getUserDao();
//        User user = dao.findByUsername(username);
//
//        boolean validAttempt = user.getPassword().equals(password);
//
//        if (validAttempt) {
//            // TODO: store the logged in user object in the session, instead of just the username
//            HttpSession session = request.getSession();
//            session.setAttribute("user", user);
//            response.sendRedirect("/profile");
//        } else {
//            response.sendRedirect("/login");
//        }
    }

}
