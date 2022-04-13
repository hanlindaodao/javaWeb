package com.daodao.web.request;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo5", loadOnStartup = -1)
public class ServletDemo5 implements Servlet {
    private ServletConfig servletConfig;

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        System.out.println("serviceDemo5里边的service接口函数被执行了");
        String method = request.getMethod();
        if ("GET".equals(method)) {

        } else if ("POST".equals(method)) {

        }
    }


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
        System.out.println("serviceDemo5里边的init方法被调用");
    }

    @Override
    public void destroy() {
        System.out.println("serviceDemo5里边的destroy方法被调用");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }


    @Override
    public String getServletInfo() {
        return null;
    }


}
