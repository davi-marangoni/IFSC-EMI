package abc;

import java.util.Scanner;

public class ControleRemoto {
        public String marca;
        public int volume;
        public int canal;
        public String cor;
        public int power;
        static Scanner teclado =new Scanner(System.in);

    public static void main(String[] args) {

        ControleRemoto c1=new ControleRemoto();
            c1.marca= "Panasonic";
            c1.volume= 17;
            c1.canal= 1;
            c1.cor= "preto";
            c1.power= 1;
						
			while(true){
				System.out.println("01 - LIGA/DESLIGA");
				System.out.println("02 - Avanca Canal");
				System.out.println("03 - Volta Canal");
				System.out.println("04 - Aumenta Volume");
				System.out.println("05 - Abaixa Volume");
				System.out.println("06 - Ver status do controle");		
				
				int nOpcao=teclado.nextInt();
				switch(nOpcao)
				{
					case 1: c1.ligadodesliga();
					break;
					case 2: c1.canalMais();
					break;
					case 3: c1.canalMenos();
					break;
					case 4: c1.VolumeMais();
					break;
					case 5: c1.VolumeMenos();
					break;
					case 6: c1.status();
					break;					
				}
				System.out.print ("Deseja realizar outra opção: 1-sim, 0-não \n");
					nOpcao = teclado.nextInt();
					if (nOpcao == 0)
				{
				System.out.println("Programa encerrado.");
				break;
				}}
    }
    public void ligadodesliga(){
        if(power == 0){
          System.out.println("Você ligou a TV");
          power=1;
        }
        else{
          System.out.println("Você desligou a TV");
          power=0;
        }
    }
    public void canalMais(){
        canal+=1;
        if(canal > 99) {
        	canal=1;
        }
        System.out.println("Você está no canal:"+canal+"!");
    }
    public void canalMenos(){
        canal-=1;
        if(canal == 0) {
        	canal=99;
        }
        System.out.println("Você está no canal:"+canal+"!");
    }
    public void  VolumeMais(){
        volume+=1;
        System.out.println("Você está no volume:"+volume+"!");
    }
    public void VolumeMenos(){
        volume-=1;
        System.out.println("Você está no volume:"+volume+"!");
    }
    public void cor(){
        System.out.println("A cor é:"+cor+"!");
    }
    public void status(){
           System.out.print("Marca: " + this.marca + "\n");
           System.out.print("Volume: " + this.volume + "\n");
           System.out.print("Canal: " + this.canal + "\n");
           System.out.print("Cor: " + this.cor + "\n");
           System.out.print("Power: " + this.power + "\n");
        }
    }