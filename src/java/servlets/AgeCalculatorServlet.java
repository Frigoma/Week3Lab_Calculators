
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fricardo
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userAge = request.getParameter("age");
        request.setAttribute("userAge", userAge);
        
        if(userAge == null || userAge.equals("")){
            request.setAttribute("message", "You must give your current age");
        } else{
            try{
                int age = Integer.parseInt(userAge);
                request.setAttribute("message", "Your age next birthday will be " + (age + 1));
            } catch (NumberFormatException ex) {
                request.setAttribute("message", "Please enter your current age in a number format");
            }
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }
}
