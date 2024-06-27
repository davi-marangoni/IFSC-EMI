
public class Contato {
    private String Nome;
    private int telefone;
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Contato(String nome, int telefone) {
        this.Nome = nome;
        this.telefone = telefone;
    }
    public Contato() {
        // TODO Auto-generated constructor stub
    }
}
