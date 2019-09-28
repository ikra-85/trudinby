package com.trudinby.login;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import java.io.IOException;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

        UserService userService = UserServiceFactory.getUserService();
        if (userService.isUserLoggedIn()) {
            // Save the relevant profile info and store it in the session.
            User user = userService.getCurrentUser();
            req.getSession().setAttribute("userEmail", user.getEmail());
            req.getSession().setAttribute("userId", user.getUserId());

            String destination = (String) req.getSession().getAttribute("loginDestination");
            if (destination == null) {
                destination = "/books";
            }

            resp.sendRedirect(destination);
        } else {
            resp.sendRedirect(userService.createLoginURL("/login"));
        }
    }
}