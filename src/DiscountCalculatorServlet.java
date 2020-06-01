import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalculator Servlet" ,urlPatterns = "/discount")
public class DiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int price = Integer.parseInt(request.getParameter("price"));
        int percent = Integer.parseInt(request.getParameter("percent"));
        float DiscountAmount = (float) (price*percent*0.01);
        String description = request.getParameter("description");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println(" <meta charset=\"UTF-8\">");
        writer.println("<h1>Description : "+description+"<br/>");
        writer.println("<h1>Discount amount : "+DiscountAmount);
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
