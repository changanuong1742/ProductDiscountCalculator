import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculatorServlet",urlPatterns = "/calculate")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

String description = request.getParameter("description");
float price = Float.parseFloat(request.getParameter("price"));
float percent = Float.parseFloat(request.getParameter("percent"));

float amount = (float) (price * percent * 0.1);

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2> Description: " + description + "</h2><br/>");
        writer.println("<h2> Rrice: " + price + "</h2><br/>");
        writer.println("<h2> Percent: " + percent + "</h2><br/><br/><br/>");
        writer.println("<h2> Amount: " + amount + "</h2><br/>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
