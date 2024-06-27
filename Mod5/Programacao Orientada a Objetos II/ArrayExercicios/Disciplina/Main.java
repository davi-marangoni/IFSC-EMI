import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Disciplina> listaDisciplinas = new ArrayList<Disciplina>();
		int op;
		int CH;
		String nome;
		
		while(true) {
			System.out.println("MENU");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar todas");
			System.out.println("3 - Buscar");
			System.out.println("4 - Alterar");
			System.out.println("5 - Excluir");
			System.out.println("6 - Excluir Todos");
			System.out.println("7 - Sair");
			
			
			Scanner leia = new Scanner(System.in);
			op = leia.nextInt();
			
			if (op == 1) {
				Disciplina d = new Disciplina();
				System.out.println("Digite o nome da diciplina");
				nome = leia.next();
				System.out.println("Digite a carga horaria da diciplina");
				CH = leia.nextInt();
				d.setCH(CH);
				d.setNome(nome);
				listaDisciplinas.add(d);
			}
			else if (op == 2){
					if(listaDisciplinas.size() == 0) {
						System.out.println("Lista Vazia");
					}else {
						for(int i = 0; i<listaDisciplinas.size(); i++) {
							System.out.println(listaDisciplinas.get(i).getNome());
						}
					}
			}
			else if (op == 3) {
				if(listaDisciplinas.size() == 0) 
					System.out.println("Lista Vazia!");
				else
					System.out.println("Digite o nome da disciplina a ser buscada: ");
					nome = leia.next();
					for(int i = 0; i < listaDisciplinas.size();i++)
						if(listaDisciplinas.get(i).getNome().equals(nome)){
							System.out.println("Disciplina encontrada!");
						}else {
							System.out.println("Disciplina n�o encontrada!");
						}
			}
			else if (op == 4){
				if(listaDisciplinas.size() == 0) 
					System.out.println("Lista Vazia!");
				else
					System.out.println("Digite o nome da disciplina a ser alterada: ");
					nome = leia.next();
					for(int i = 0; i < listaDisciplinas.size();i++)
						if(listaDisciplinas.get(i).getNome().equals(nome)){
							System.out.print("Qual o novo nome:");
							nome = leia.next();
							listaDisciplinas.get(i).setNome(nome);
						}
			}
			else if (op == 5)
			{
				System.out.println("Qual Diciplina � para excluir");
				nome = leia.next();
				for(int i = 0; i<listaDisciplinas.size(); i++) {
					if(listaDisciplinas.get(i).getNome().equals(nome)){
						listaDisciplinas.remove(i);
						System.out.print("EXCLUIDO");
				}
				}		
			}
			else if (op == 6)
			{
				listaDisciplinas.clear();
			}
			else if (op == 7)
			{
				break;
			}
		}
	}

}