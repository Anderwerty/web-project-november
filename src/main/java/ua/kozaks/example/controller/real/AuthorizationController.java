package ua.kozaks.example.controller.real;

import ua.kozaks.example.controller.dispatcher.MethodType;
import ua.kozaks.example.controller.dispatcher.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthorizationController {

    @RequestMapping(url = "/login")
    public void login(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @RequestMapping(url = "/login2", method = MethodType.POST)
    public void login2(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
