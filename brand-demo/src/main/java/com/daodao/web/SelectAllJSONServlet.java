package com.daodao.web;

import com.alibaba.fastjson.JSON;
import com.daodao.pojo.Brand;
import com.daodao.service.BrandService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllJSONServlet")
public class SelectAllJSONServlet extends HttpServlet {
    private BrandService brandService = new BrandService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Brand> brands = brandService.selectAll();

        String js = JSON.toJSONString(brands);
//        System.out.println(js);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(js);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
