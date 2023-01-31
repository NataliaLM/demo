package com.example.demo;

import jakarta.servlet.http.*;

import java.io.IOException;

public class AddServlet extends HttpServlet {
    //doPost sólo funciona con un post request, No funciona con un method=get
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i + j;

        Cookie cookie = new Cookie("k",k+"");
        res.addCookie(cookie);

//        HttpSession session = req.getSession();
//        session.setAttribute("k",k);
        res.sendRedirect("sq");

        //res.sendRedirect("sq?k="+k); //redirige al cliente a otra página, URL Rewriting

        //req.setAttribute("k",k);

        //Enviar a otro servidor
//        RequestDispatcher rd = req.getRequestDispatcher("sq");
//        rd.forward(req, res);
    }
}
