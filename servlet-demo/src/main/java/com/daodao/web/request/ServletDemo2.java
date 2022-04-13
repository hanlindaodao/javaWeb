package com.daodao.web.request;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo2", loadOnStartup = -1)
public class ServletDemo2 implements Servlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("serviceDemo2里边的service接口函数被执行了");
    }


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("serviceDemo2里边的init方法被调用");
    }

    @Override
    public void destroy() {
        System.out.println("serviceDemo2里边的destroy方法被调用");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


    @Override
    public String getServletInfo() {
        return null;
    }


}
