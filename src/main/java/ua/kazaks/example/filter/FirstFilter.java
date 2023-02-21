package ua.kazaks.example.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//https://www.javacodegeeks.com/2012/07/anti-cross-site-scripting-xss-filter.html
@WebFilter(filterName = "firstFilter")
public class FirstFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // some logic

        chain.doFilter(request, response);

    }
}

// <script> js ...</script>