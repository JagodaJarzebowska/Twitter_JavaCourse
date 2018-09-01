package com.sda.twitter.filters;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class FilterForSession implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String user = servletRequest.getParameter("user");
        String pass = servletRequest.getParameter("pass");
        HttpSession session = ((HttpServletRequest) servletRequest).getSession();
        if ("admin".equals(user) && "pass".equals(pass)) {
            session.setAttribute("userName", user);
        }
        if (session.getAttribute("userName") != null) {
            System.out.println("uzytkownik autentykowany");
        } else {
            System.out.println("blad autentykacji");
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
