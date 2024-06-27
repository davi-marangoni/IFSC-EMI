

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServeletLogin
 */
@WebServlet("/conta")
public class ServeletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String numero1 = request.getParameter("txNumero1");
		String numero2 = request.getParameter("txNumero2");
		
		int numero1t = Integer.parseInt(numero1);
		int numero2t = Integer.parseInt(numero2);
		
		Numero n = new Numero();
		n.setNumero1(numero1t);
		n.setNumero2(numero2t);
		
		int soma = n.soma();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Número 1:</h1>" + numero1t );
		out.print("<h1>Número 2:</h1>" + numero2t );
		out.print("<h1>Soma -></h1>" + soma);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
