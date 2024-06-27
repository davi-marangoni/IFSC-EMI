import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	ArrayList<Contato> listaContato = new ArrayList<Contato>();
	
	int op;
	int op1;
	String nome;
	int telefone;
	
		
	while(true) {
		
		System.out.println("========================");
		System.out.println("MENU PRINCIPAL");
		System.out.println("1 - Fila");
		System.out.println("2 - Pilha");
		System.out.println("3 - Sair");
		System.out.println("========================");
		
		Scanner leia = new Scanner(System.in);
		op = leia.nextInt();	
		
		if (op == 3) {
			 
			System.out.println("Fim do Programa");
			break;
		}
		if (op == 2) {
		 
			System.out.println("Não é possivel acessar opção, pois a matricula não é par!!!");
		}
		if (op == 1) {
			System.out.println("========================");
			System.out.println("MENU INTERNO FILA");
			System.out.println("1 - Inserir");
			System.out.println("2 - Remover");
			System.out.println("3 - Mostrar");
			System.out.println("4 - Tamanho Array");
			System.out.println("5 - Sair");
			System.out.println("========================");
			op1 = leia.nextInt();	
			
			if (op1 == 1){
				Contato c = new Contato();
				System.out.println("Nome");
				nome = leia.next();
				System.out.println("Telefone");
				telefone = leia.nextInt();
				
				c.setNome(nome);
				c.setTelefone(telefone);
				
				listaContato.add(c);
			}else if (op1 == 2){
				if(listaContato.size() == 0) { 
					System.out.println("Lista Vazia!");
				}else {
					listaContato.remove(0);
					System.out.println("EXCLUIDO");
			}		
			}else if (op1 == 3){
				if(listaContato.size() == 0) {
					System.out.println("Lista Vazia");
				}else {
					for(int i = 0; i<listaContato.size(); i++) {
						System.out.println(listaContato.get(i).getNome());
						System.out.println(listaContato.get(i).getTelefone());
					}
				}	
			}else if (op1 == 4){
				if(listaContato.size() == 0) {
					System.out.println("Lista Vazia");
				}else {
						System.out.println(listaContato.size());
				}	
			}else if (op1 == 5){
				// Retorna pro primeiro menu
			}
			}
		
		
	}
	}
}
