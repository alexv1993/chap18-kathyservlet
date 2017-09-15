package com.ucs.headfirstjava.kathyServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by vendin on 15.09.2017.
 */
public class KathyServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = "PhraseoMatic has generated the following phrase.";

        response.setContentType("text/html; charset=UTF-8");



        PrintWriter out = response.getWriter();

        out.println("<HTML><HEAD><TITLE>");
        out.println("PhraseOmatic");
        out.println("</TITLE></HEAD><BODY>");
        out.println("<H1>" + title + "<H1>");
        out.println("<P>" + PhraseOMatic.makePhrase());
        out.println("<P><a href = \"test\">Make anouther phrase</a></p>");
        out.println("</BODY></HTML>");

        out.close();

    }
}
