package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import objeto.Contato;

public class ContatoDAO {
    private String url = "jdbc:postgresql://";
    private Connection connection;
    private String user = "";
    private String senha = "";

    public ContatoDAO() {
    }

    public void cadastra(Contato contato) throws ClassNotFoundException {
        String sql = "INSERT INTO Contato(nome, telefone) VALUES(?, ?)";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, senha);
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getTelefone());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void exclui(Contato contato) throws ClassNotFoundException {
        String sql = "DELETE FROM Contato WHERE nome = ?";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, senha);
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, contato.getNome());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
