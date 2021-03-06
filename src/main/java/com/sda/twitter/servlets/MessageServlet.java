package com.sda.twitter.servlets;


import com.sda.twitter.utils.Autentication;
import com.sda.twitter.model.Message;
import com.sda.twitter.utils.MessageCreator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "MessageServlet", value = "/message")
public class MessageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MessageCreator messageCreator = new MessageCreator();
        Message message = messageCreator.create(req.getParameter("content"),req.getParameter("author"));
        req.setAttribute("message",message);

        if (Autentication.isIsAuthenticated()){
            req.getRequestDispatcher("showMessage.jsp").forward(req,resp);
        }else {
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }

        // 'łączy strone jsp z naszym requestem' - w duzym uproszczeniu
        req.getRequestDispatcher("showMessage.jsp").forward(req,resp);
    }
}
