package db;

import java.awt.List;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import objeto.Aluno;

public class AlunoDAO {

	String url = "jdbc:postgresql://localhost:5432/TrabalhoFinal";
    private Connection connection;
    private String user = "postgres";
    private String senha = "123";
	
    
    public AlunoDAO(){
    } //Construtor
    
    
    public void cadastra(Aluno aluno) throws ClassNotFoundException {
        String sql = "insert into alunos(nome,matricula,telefone)values(?,?,?)";
        try {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(url, user, senha);
        // prepared statement para inserção
        PreparedStatement stmt = connection.prepareStatement(sql);
        // seta os valores
        stmt.setString(1, aluno.getNome());
        stmt.setString(2, aluno.getMatricula());
        stmt.setString(3, aluno.getTelefone());
        // executa
        stmt.execute();
        stmt.close();
        } catch (SQLException e) {
        throw new RuntimeException(e);
        }
    }

    public void exclui(Aluno aluno) throws ClassNotFoundException {
        String sql = "delete from alunos where nome = ?";
        try {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(url, "postgres", "123");
        // prepared statement para exclusão
        PreparedStatement stmt = connection.prepareStatement(sql);
        // seta os valores
        stmt.setString(1, aluno.getNome());
        // executa
        stmt.execute();
        stmt.close();
        } catch (SQLException e) {
        throw new RuntimeException(e);
        }
    }

  
    public ArrayList<Aluno> consulta(Aluno aluno) throws ClassNotFoundException{
    	String sql = "select * from alunos where nome = ?";
    	try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, "postgres", "123");
            // prepared statement para exclusão
            PreparedStatement stmt = connection.prepareStatement(sql);
            // seta os valores
            stmt.setString(1, aluno.getNome());
        
            ResultSet rs = stmt.executeQuery();
            
            ArrayList<Aluno> alunos = new ArrayList<Aluno>();
            
            while(rs.next()) {
            	Aluno Aluno = new Aluno();
            	Aluno.setNome(rs.getString("nome"));
            	Aluno.setMatricula(rs.getString("matricula"));
            	Aluno.setTelefone(rs.getString("telefone"));
            	
            	alunos.add(Aluno);
            }
            rs.close();
            stmt.close();
            return alunos;
            } catch (SQLException e) {
            throw new RuntimeException(e);
            }

    }
    
    public ArrayList<Aluno> consultaTudo() throws ClassNotFoundException{
    	String sql = "select * from alunos";
    	try {
    		Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, "postgres", "123");
            
            PreparedStatement stmt = connection.prepareStatement(sql);
    		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    		

    		ResultSet rs = stmt.executeQuery();
    
    		while(rs.next()) {
    			Aluno Aluno1 = new Aluno();
            	Aluno1.setNome(rs.getString("nome"));
            	Aluno1.setMatricula(rs.getString("matricula"));
            	Aluno1.setTelefone(rs.getString("telefone"));
            	
            	alunos.add(Aluno1);
    		}
    	
    	rs.close();
        stmt.close();
		return alunos;
    	}catch (SQLException e) {
    		throw new RuntimeException(e);
        }
    	
    }
    
    
    public void update(Aluno aluno) throws ClassNotFoundException {
        String sql = "update alunos set nome = ?,matricula = ?,telefone = ? where nome = ?";
        try {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(url, user, senha);
        // prepared statement para inserção
        PreparedStatement stmt = connection.prepareStatement(sql);
        // seta os valores
        stmt.setString(4, aluno.getNome());
        stmt.setString(2, aluno.getMatricula());
        stmt.setString(3, aluno.getTelefone());
        stmt.setString(1, aluno.getNomeNovo());
        // executa
        stmt.execute();
        stmt.close();
        } catch (SQLException e) {
        throw new RuntimeException(e);
        }
    }
    
    

}