import java.util.Scanner;
public class CarWash {
	    public static void main(String[] args) {
	        try (Scanner teclado = new Scanner(System.in)) {
				Carro carro = new Carro("10", 1,"Honda", 1 );
				Cliente cliente = new Cliente("12213132910", "JUBILEU", "32273122",100, false);
				Servico servico = new Servico ("1", "10", carro, true, 100, false, 100);
				while (true)
				{
				    System.out.println("Digite a operação\n");
				    System.out.println("1 - Atualizar cliente\n");
				    System.out.println("2 - Atualizar saldo do cliente\n");
				    System.out.println("3 - Alterar status \n");
				    System.out.println("4 - Atualizar carro\n");
				    System.out.println("5 - Alterar Tipo Carro \n");
				    System.out.println("6 - Requisitar serviço\n");
				    System.out.println("7 - Concluir serviço\n");
				    System.out.println("8 - Consultar cliente\n");
				    System.out.println("..:");

				    int nOpcao = teclado.nextInt();
				    switch(nOpcao)
				    {
				    case 1: cliente.NovoCliente();
				    break;
				    case 2: cliente.AlteraSaldo();
				    break;
				    case 3: cliente.AlteraStatus();
				    break;
				    case 4: carro.NovoCarro();
				    break;
				    case 5: carro.AlteraTipo();
				    break;
				    case 6: servico.incluiServico(cliente,cliente,carro,0,0,false);
				    break;
				    case 7: servico.ConcluiServico();
				    break;
				    case 8: cliente.ConsultaCliente();;
				    break;
				    
				    
				    default: System.out.println("Opção invalida\n");
				    }
				}
			}
		}
}