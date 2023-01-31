package com.example.demo;

import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        //int k = Integer.parseInt(req.getParameter("k"));
        //HttpSession session = req.getSession();
        //session.removeAttribute("k");
        //int k = (int) session.getAttribute("k");
        int k=0;
        Cookie[] cookies = req.getCookies();

        for(Cookie c : cookies)
        {
            if(c.getName().equals("k"))
            {
                k = Integer.parseInt(c.getValue());
            }
        }

        k = k*k;

        PrintWriter out = res.getWriter();
        out.println("Result is " + k);
        System.out.println("sq called");

    }
}
