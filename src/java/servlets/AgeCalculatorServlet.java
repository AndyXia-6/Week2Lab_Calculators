/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 762212
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               
            String ageTemp = request.getParameter("age");  
            
            
            if (ageTemp == null || ageTemp.equals(""))
            {
                request.setAttribute("message", "You must give your current age");
            }
            else 
            {
                int age = Integer.parseInt(ageTemp);           
                age = age + 1;
                request.setAttribute("message", "Your age next birthday will be " + age);
            }
                        
            getServletContext().getRequestDispatcher("/WEB-INF/AgeCalculator.jsp")
                .forward(request, response);

    }


}
