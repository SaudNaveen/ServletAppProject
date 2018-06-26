/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naveen.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request
            , HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("name", "Naveen Singh Saud");
        request.getRequestDispatcher("/WEB-INF/views/index.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request
            , HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter()
                .println("<h1> "+ request.getParameter("email")
                +"</h1>");
    }
    
    
}