import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class FinalServlet
 */
public class FinalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String customerName=request.getParameter("customerName");
		String mobileNumber = request.getParameter("mobileNumber");
        String pickupAddress= request.getParameter("pickupAddress");
        String dropAddress = request.getParameter("dropAddress");
        String pickupdate = request.getParameter("pickupDate");
        String pickupTime = request.getParameter("pickupTime");
        System.out.println(customerName);
        System.out.println(pickupAddress);
        System.out.println(dropAddress);
        System.out.println(pickupdate);
        System.out.println(pickupTime);
        
        
        HelloFinal obj = new HelloFinal(customerName,mobileNumber,pickupAddress,dropAddress,pickupdate,pickupTime);
        obj.store();
        response.sendRedirect("Page3.html");
		doGet(request, response);
	}

}
