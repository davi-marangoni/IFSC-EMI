package davi;

import java.util.Scanner;


public class ControleR {
	static Scanner teclado =new Scanner(System.in);
	public static void main(String[] args) {
		Pilha p1=new Pilha("Duracell", "Laranja", 20, 1);
		Controle c1=new Controle("Panasonic", 15, 1, "Preto", 1);


		while(true){
			System.out.println("01 - LIGA/DESLIGA");
			System.out.println("02 - Avanca canal");
			System.out.println("03 - Volta canal");
			System.out.println("04 - Aumenta volume");
			System.out.println("05 - Abaixa volume");
			System.out.println("06 - Ver status do controle");	
			System.out.println("07 - Trocar pilha");

			int nOpcao=teclado.nextInt();

			switch(nOpcao){
			case 1: if(p1.getCargaP()>=10){ 
				c1.ligadesliga();
				p1.perdecarga();
			}
			else{
				System.out.println("Troque a bateria");
			}
			break;			
			case 2: if(p1.getCargaP()>=10){ 
				c1.canalMais();
				p1.perdecarga();
			}
			else{
				System.out.println("Troque a bateria");
			}
			break;			
			case 3: if(p1.getCargaP()>=10){ 
				c1.canalMenos();
				p1.perdecarga();
			}
			else{
				System.out.println("Troque a bateria");
			}
			break;			
			case 4: if(p1.getCargaP()>=10){ 
				c1.VolumeMais();
				p1.perdecarga();
			}
			else{
				System.out.println("Troque a bateria");
			}
			break;			
			case 5:if(p1.getCargaP()>=10){ 
				c1.VolumeMenos();
				p1.perdecarga();
			}
			else{
				System.out.println("Troque a bateria");
			}
			break;		
			case 6:	if(p1.getCargaP()>=10){
				c1.status();
				p1.statusbateria();
				p1.perdecarga();
			}
			else{
				System.out.println("Troque a bateria");
			}
			break;
			case 7: p1.mudaCargaP();


			}
			System.out.print ("Para continuar o programa pressione qualquer tecla\n");
			System.out.print ("Para encerrar o programa pressione 0\n");
			nOpcao = teclado.nextInt();
			if (nOpcao == 0)
			{
				System.out.println("Programa encerrado.");
				break;
			}

		}
	}

}

