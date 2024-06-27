import java.util.ArrayList;

public class Aluno {
	private String nome;
	private int matricula;
	
	public Aluno(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public static void main(String args[]) {
		ArrayList<Aluno> ListaAluno = new ArrayList<Aluno>();
		Aluno a1 = new Aluno("Joao", 202021);
		ListaAluno.add(a1);
		Aluno a2 = new Aluno("Marcio", 191919);
		ListaAluno.add(a2);
		Aluno a3 = new Aluno("Marcelo", 181818);
		ListaAluno.add(a3);
		Aluno a4 = new Aluno("Augusto", 171717);
		ListaAluno.add(a4);
		
		
		for(int c=0;c<ListaAluno.size(); c++) {
			if(ListaAluno.get(c).getMatricula() % 2 ==0) {
				ListaAluno.remove(c);
				System.out.print("Remoção da primeira matricula par feita com sucesso\n");
				break;
			}else {
				continue;
			}
		} 
		
	ListaAluno.clear();
	System.out.print("Tamanho do Array: \n");
	System.out.print(ListaAluno.size());
	
	}
}
