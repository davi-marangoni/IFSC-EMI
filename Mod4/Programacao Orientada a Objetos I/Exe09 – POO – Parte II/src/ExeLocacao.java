////////////////////////////////////////////////////////////////////////
////			   TODOS OS DIREITOS RESERVADOS A 					////				
////				    TINY BOOTS DEVELOPER©						////
////																////
////				   COPIA SUJEITO A PAULADA						////
////////////////////////////////////////////////////////////////////////	
import java.util.Scanner;
public class ExeLocacao {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner (System.in)) {
			Carro car = new Carro("MBQ2982","camaro", 1,true);
			Cliente Cli1 = new Cliente("11751878967", "Junior", true );
			Locacao loc1 = new Locacao("MBQ2982", "11751878967", "15/02/2019",
					"18/02/2019", 200000f, car,Cli1);
			while(true)
			{
				System.out.println("Locacao de veiculos");
				System.out.println("Digite a opção: ");
				System.out.println("01 - Alterar Devoluçao veiculo");
				System.out.println("02 - Atualizar a diaria de um veiculo");
				System.out.println("03 - Habilitar do cliente");
				System.out.println("04 - Desabilitar do cliente");
				System.out.println("05 - Atualizar dados do cliente");
				System.out.println("06 - Incluir uma locação");
				System.out.println("07 - Atualizar data locação");
				System.out.println("08 - Visualizar informações do Carro");
				System.out.println("09 - Visualizar informações da Locação");
				System.out.println("10 - Visualizar informações do Cliente");
				int nOpcao=teclado.nextInt();
				nOpcao = teclado.nextInt();
				switch(nOpcao)
				{
				case 1: car.devolucaoveiculo();
				break;
				case 2: car.AtualizarDiaria();
				break;
				case 3: Cli1.habilitacliente();
				break;
				case 4: Cli1.desabilitacliente();
				break;
				case 5: Cli1.AtualizaCliente();
				break;
				case 6: loc1.IncluirLocacao();
				break;
				case 7: loc1.AtualixaDataDev();
				break;
				case 8: car.VisualizaCarro();
				break;
				case 9: loc1.VisualizaLocacao();
				break;
				case 10: Cli1.VisualizaCliente();
				break;			
				}
				System.out.print ("Para continuar o programa pressione qualquer tecla\n");
				System.out.print ("Para encerrar o programa pressione 0\n");
				nOpcao = teclado.nextInt();
				if (nOpcao == 0)
				{
					System.out.println("Programa encerrado.");
					break;
				}
		} } }}