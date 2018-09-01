package com.sda.twitter.filters;

import com.sda.twitter.utils.Autentication;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Enumeration names = servletRequest.getParameterNames();
        while (names.hasMoreElements()) {
            Object currentParam = names.nextElement();
            if (currentParam.equals("secret")) {
               String secretParam = servletRequest.getParameter("secret");
                Autentication.setIsAuthenticated(false);
                if (secretParam != null) {
                    if (secretParam.equals("123")) {
                        Autentication.setIsAuthenticated(true);
                    }
                }
            }
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
