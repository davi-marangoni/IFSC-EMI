

import java.io.IOException;
import java.io.PrintWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServeletLogin
 */
@WebServlet("/act")
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		DecimalFormat df = new DecimalFormat("0.00");
		StringBuilder resposta = new StringBuilder();
		df.setRoundingMode(RoundingMode.UP);
		
		String numero1 = request.getParameter("txNumero1");
		String numero2 = request.getParameter("txNumero2");
		
		int numero1t = Integer.parseInt(numero1);
		int numero2t = Integer.parseInt(numero2);
		
		
		float resultado = (Float.valueOf(numero1t).floatValue()*(Float.valueOf(numero2t).floatValue() *0.01f));
		response.setContentType("text/html");
		resposta.append("<style>table,th,td{border:1px solid black;}</style>");
		resposta.append("<table><tr><th> Numero inicial: </th><th>"+numero1t+"</th></tr><tr><th> Porcentagem aplicada: </th><th>"+numero2t+"%</th></tr> <tr><th>Resultado:</th> <th>"+df.format(resultado)+"</th></tr></table>");
		PrintWriter pw = response.getWriter();
		pw.println(resposta);

	}

}
