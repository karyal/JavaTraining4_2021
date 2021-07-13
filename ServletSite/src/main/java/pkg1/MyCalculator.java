package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import unit_2.Calculator;

/**
 * Servlet implementation class Calculator
 */

@WebServlet("/myCalculator")
public class MyCalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyCalculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//Receive values from WebForm
		String txt_n1 = request.getParameter("txt_n1");  
		String txt_n2 = request.getParameter("txt_n2");
		int n1, n2, res;
		n1 = Integer.parseInt(txt_n1);
		n2 = Integer.parseInt(txt_n2);
		Calculator calc1 = new Calculator (n1, n2);
		calc1.sum();
		
		out.println("<h2>Result</h3>");
		out.println("<h3>First No : "+calc1.getNum1()+"</h3>");
		out.println("<h3>Second No : "+calc1.getNum2()+"</h3>");
		out.println("<h3>Result: "+calc1.getNum3()+"</h3>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
