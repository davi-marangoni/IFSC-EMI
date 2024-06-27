import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/Login")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		String nome = "Davi";
		String senha = "999";
		Cliente c = new Cliente();
		c.setNome(nome);
		c.setSenha(senha);
	
	response.setContentType("text/html");
	PrintWriter pw = response.getWriter();
	
	/* pw.println("<h1> nome: "+ nome + "<br> senha: "+ senha +" </h1>");
	} */
	
	String novasenha = request.getParameter("txtsenha");
	String novonome = request.getParameter("txtnome");
	
	if (nome.equals(novonome) && senha.equals(novasenha))
	{
		pw.println("<h1> SALVO COM SUCESSO! :) <h1>");
	}
	
	else
	{
		pw.println("<h1> FALHA! :( <h1>");
		pw.println("Salvos anteriormentes: ");
		pw.println("<h1> nome: "+ nome + "<br> senha: "+ senha +" </h1>");
	}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}