
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fricardo
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String userFirst = request.getParameter("first");
       String userSecond = request.getParameter("second");
       String userButton = request.getParameter("button");
       
       request.setAttribute("first", userFirst);
       request.setAttribute("second", userSecond);
       request.setAttribute("button", userButton);
       
       if(userFirst == null || userSecond == null){
           request.setAttribute("result", "---");
       } else if (userFirst == "" || userSecond == ""){
           request.setAttribute("result", "Invalid");
       } else {
            try{
                int userInput1 = Integer.parseInt(userFirst);
                int userInput2 = Integer.parseInt(userSecond);
                
                if(userButton.equals("+")){
                    request.setAttribute("result", "Result: " + (userInput1 + userInput2));
                } else if (userButton.equals("-")){
                    request.setAttribute("result", "Result: " + (userInput1 - userInput2));
                }else if (userButton.equals("*")){
                    request.setAttribute("result", "Result: " + (userInput1 * userInput2));
                }else if (userButton.equals("%")){
                    request.setAttribute("result", "Result: " + (userInput1 % userInput2));
                }
            } catch (NumberFormatException ex) {
                request.setAttribute("result", "Invalid");
            }
        }
       request.setAttribute("first", userFirst);
       request.setAttribute("second", userSecond);
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }
}
