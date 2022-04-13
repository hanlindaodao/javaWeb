package com.daodao.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
//        chain.doFilter(request, response);
//        return;
        HttpServletRequest req = (HttpServletRequest) request;
        String[] urls = {"/login.jsp", "/imgs", "/css", "loginServlet", "register.jsp", "RegisterServlet", "CheckCodeServlet"};

        String url = req.getRequestURL().toString();
        for (String u : urls) {
            if (url.contains(u)) {
                chain.doFilter(request, response);
                return;
            }
        }


        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");

        if (user != null) {
            chain.doFilter(request, response);
        } else {
            req.setAttribute("login_msg", "您尚未登陆");
            req.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }
}
