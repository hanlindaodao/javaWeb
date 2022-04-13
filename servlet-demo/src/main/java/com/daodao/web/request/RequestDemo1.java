package com.daodao.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/req1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //* getMethod()获取请求方式
        //* getContextPath()获取项目访问路径
        //* getRequestURL()获取请求URL
        //* getRequestURI()获取请求URI
        //* getQueryString()获取GET请求方式的请求参数
        System.out.println(req.getMethod());
        System.out.println(req.getContextPath());//默认模块访问名称
        System.out.println(req.getRequestURL());
        System.out.println(req.getRequestURI());
        System.out.println(req.getQueryString());
//        super.doGet(req, resp);


        String header = req.getHeader("user-agent");
        System.out.println(header);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader reader = req.getReader();
        String line = reader.readLine();
        System.out.println(line);
    }
}

