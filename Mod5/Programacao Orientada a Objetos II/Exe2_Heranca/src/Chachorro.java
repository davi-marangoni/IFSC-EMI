
public class Chachorro {
	private String nome;
	private int idade;
	private String raca;
	
	public Chachorro(String nome) {
		System.out.println("Construtor1");
		this.setNome(nome);
	}
	public Chachorro(String nome, int idade) {
		System.out.println("Construtor2");
		this.setNome(nome);
		this.setIdade(idade);
	}
	public Chachorro(String nome, int idade, String raca) {
		System.out.println("Construtor3");
		this.setNome(nome);
		this.setIdade(idade);
		this.setRaca(raca);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
}