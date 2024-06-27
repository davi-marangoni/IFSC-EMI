//Classe ExePetshop

import java.util.Scanner;
public class ExePetshop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Animal animal = new Animal("383236", "toto","husky", "Juninho P.F",17,false );
		Cliente cliente = new Cliente("156489" ,"Juninho P.F","4999534599",(float)50);
		Servicos servico1 = new Servicos (animal, 0, 0, 0, false);
		while (true)
		{
			System.out.println("Digite a opção\n");
			System.out.println("1 - Atualizar cliente\n");
			System.out.println("2 - Atualizar saldo do cliente\n");
			System.out.println("3 - Ver status de vacinacao do Animal\n");
			System.out.println("4 - Atualizar data vacina\n");
			System.out.println("5 - Cadastrar novo Serviço\n");
			System.out.println("6 - Informacoes do Animal\n");
			System.out.println("7 - Informacoes do Cliente\n");
			System.out.println("..:");
			
			int nOpcao = teclado.nextInt();
			switch(nOpcao)
			{
			case 1: cliente.AtualizaCliente();
			break;
			case 2: cliente.AtualizaSaldo();
			break;
			case 3: animal.StatusAnimal();
			break;
			case 4: animal.AtualizaDataVacina();
			break;
			case 5: servico1.incluiServico(cliente,animal, 0, 0, 0, false);
			break;
			case 6: animal.InfoAnimal();
			break;
			case 7: cliente.InfoCliente();
			break;
			default: System.out.println("Opção invalida\n");
			}
		}
	}
}