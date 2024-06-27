
public class Main {

	public static void main(String[] args) {
		Bolsista b1 = new Bolsista();
		b1.setNome("Davi");
		b1.setMatricula("1234567");
		b1.setDisciplina("Prog Orientada a Objetos");
		b1.setProjeto("Implanção de dados");
		
		System.out.println(b1.getDisciplina());
	}

}
