package ua.kozaks.example.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/first")
public class FirstController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        java.lang.String type = "text/html";
        resp.setContentType(type);

        try (PrintWriter writer = resp.getWriter()) {
            writer.println("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "    <style>\n" +
                    "body      {background-color: powderblue;}\n" +
                    "h1        {color: blue;}\n" +
                    "iframe    {color: red;}\n" +
                    "\n" +
                    "    </style>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "\n" +
                    "<h1>Yarmak Dike Pole</h1>\n" +
                    "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/mOOClonYKmc\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>\n" +
                    "</body>\n" +
                    "</html>");
        }
    }
}
