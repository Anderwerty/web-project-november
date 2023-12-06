package ua.kozaks.example.controller.real;

import ua.kozaks.example.controller.dispatcher.MethodType;
import ua.kozaks.example.controller.dispatcher.RequestMapping;
import ua.kozaks.example.service.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// account
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(url = "/accounts", method = MethodType.GET)
    public void showAllAccount(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("accounts", accountService.findAll());

        System.out.println("first: " +request.getParameter("first"));
        System.out.println("second: " +request.getParameter("second"));
        try {
            request.getRequestDispatcher("/account.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace(); // need to handle
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(url = "/first", method = MethodType.GET)
    public void showFirstPage(HttpServletRequest request, HttpServletResponse response){
        try {
            request.getRequestDispatcher("/example.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
