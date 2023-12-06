package ua.kozaks.example.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebFilter(urlPatterns = "/dispatcher/*", filterName = "authentication")
public class AuthenticationFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpSession session = httpRequest.getSession();

        boolean isLogin = session != null && session.getAttribute("authentication") != null;
        String loginUrl = httpRequest.getContextPath() + "dispatcher/login";
        boolean isLoginUrl = httpRequest.getRequestURI().equals(loginUrl);
        boolean isLoginPage = httpRequest.getContextPath().contains("login.jsp");
        boolean isGoingToLogin = isLoginUrl || isLoginPage;

        if(isLogin && isGoingToLogin){
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/dispatcher/accounts");
            requestDispatcher.forward(request, response);
        } else  if(isGoingToLogin){
            chain.doFilter(request, response);
        } else{
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/dispatcher/login");
            requestDispatcher.forward(request, response);
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }
}
