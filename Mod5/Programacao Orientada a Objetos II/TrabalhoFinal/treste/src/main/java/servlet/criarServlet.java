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
 * Servlet implementation class criarServlet
 */
@WebServlet("/criarServlet")
public class criarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public criarServlet() {
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
		String matricula = request.getParameter("Matricula");
		String telefone = request.getParameter("Telefone");
		
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setMatricula(matricula);
		aluno.setTelefone(telefone);
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		StringBuilder resposta = new StringBuilder();
		
		AlunoDAO dao = new AlunoDAO();
		
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		try {
			dao.cadastra(aluno);
			//dao.exclui(aluno);
			//dao.update(aluno);
			//lista = dao.buscaTodos();

		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 0; i< lista.size();i++) {
			//System.out.println(lista.get(i).getNome()+" "+lista.get(i).getTelefone());
			resposta.append("<h1>Nome = "+lista.get(i).getNome()+"Matricula"+lista.get(i).getMatricula()+
					" Telefone = "+lista.get(i).getTelefone()+"</h1>");
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