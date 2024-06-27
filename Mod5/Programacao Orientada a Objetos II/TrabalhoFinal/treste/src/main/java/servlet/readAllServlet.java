package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.AlunoDAO;
import objeto.Aluno;

/**
 * Servlet implementation class readAllServlet
 */
@WebServlet("/readAllServlet")
public class readAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public readAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String nome = request.getParameter("Nome");
		
		AlunoDAO dao = new AlunoDAO();
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		StringBuilder resposta = new StringBuilder();
		
		try {
			dao.consultaTudo();
			lista = dao.consultaTudo();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i< lista.size();i++) {
			//System.out.println(lista.get(i).getNome()+" "+lista.get(i).getTelefone());
			resposta.append("<h1>Nome = "+lista.get(i).getNome()+
							"<br>Matricula "+lista.get(i).getMatricula()+
							"<br>Telefone = "+lista.get(i).getTelefone()+"</h1>");
		}
		pw.println(resposta); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
