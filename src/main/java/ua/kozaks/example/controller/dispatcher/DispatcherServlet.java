package ua.kozaks.example.controller.dispatcher;

import ua.kozaks.example.injector.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//Front Controller


@WebServlet("/dispatcher/*")
public class DispatcherServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String httpMethod = req.getMethod();
        String uri = req.getRequestURI();
//        String servletPath = req.getServletPath();
//        System.out.println("Uri: " + uri);
//        System.out.println("path info: " + req.getPathInfo());
//        System.out.println("query string: " + req.getQueryString());
//        System.out.println("method: " + req.getMethod());
//        System.out.println("context path: " + req.getContextPath());
//        System.out.println("path translated: " + req.getPathTranslated());
//        System.out.println("local addr: " + req.getLocalAddr());
//        System.out.println("auth type: " + req.getAuthType());
//        System.out.println("servlet path: " + req.getServletPath());

        System.out.println("request processing");
        System.out.println("=====================================================");
        String url = uri.replace(req.getContextPath(), "").replace(req.getServletPath(), "");
        System.out.println("url: " + url);


        MethodMap methodMap = ApplicationContext.URL_TO_METHODMAP.get(url);
//        System.out.println("size: " + URL_TO_METHODMAP.size());
//        URL_TO_METHODMAP.forEach((k, v) -> System.out.println(k + ":" + v));

        Method method = methodMap.getMethod();
        Object controller = methodMap.getControllerInstance();
        MethodType methodType = methodMap.getMethodType();

        if (httpMethod.equalsIgnoreCase(methodType.name())) {
            try {
                method.invoke(controller, req, resp);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
