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
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first = request.getParameter("first");  
        String second = request.getParameter("second");
       
        if (first == null || first.equals("") || second == null || second.equals(""))
        {
            request.setAttribute("message", "invalid");           
        }
        else if (request.getParameter("addition") != null)
        {
            int firstNum = Integer.parseInt(first);         
            int secondNum = Integer.parseInt(second);  
            int total = firstNum + secondNum;
            request.setAttribute("message", total);                       
        }
        else if (request.getParameter("subtraction") != null)
        {
            int firstNum = Integer.parseInt(first);         
            int secondNum = Integer.parseInt(second);  
            int total = firstNum - secondNum;
            request.setAttribute("message", total);                       
        }
        else if (request.getParameter("multiplication") != null)
        {
            int firstNum = Integer.parseInt(first);         
            int secondNum = Integer.parseInt(second);  
            int total = firstNum * secondNum;
            request.setAttribute("message", total);                       
        }
        else if (request.getParameter("modulus") != null)
        {
            int firstNum = Integer.parseInt(first);         
            int secondNum = Integer.parseInt(second);  
            int total = firstNum % secondNum;
            request.setAttribute("message", total);                       
        } 
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmetic.jsp")
                .forward(request, response);

    }
}
