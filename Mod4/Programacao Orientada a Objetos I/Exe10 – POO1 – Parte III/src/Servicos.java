import java.util.Scanner;

public class Servicos {
	private Animal Animal; //atributos
	private int data;
	private int Servico;
	private float valor;
	private boolean pagto;
	Scanner teclado = new Scanner(System.in);
	private Object cliente;
	// metodo construtor
	public Servicos ( Animal Animal, int data, int Servico, float valor,boolean pagto)
	{
		this.Animal= Animal;
		this.data = data;
		this.Servico = Servico;
		this.valor = valor;
		this.pagto = pagto;
	}
	public Animal getAnimal() {
		return Animal;
	}
	public void setAnimal(Animal animal) {
		Animal = animal;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getServico() {
		return Servico;
	}
	public void setServico(int servico) {
		Servico = servico;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public boolean isPagto() {
		return pagto;
	}
	public void setPagto(boolean pagto) {
		this.pagto = pagto;
	}
	
	public void incluiServico (Cliente cliente, Animal animal, int data, int Servico, double valor,boolean pagto ) {
		
		if (cliente.getSaldo()>15) {
			this.pagto = pagto;
		if (this.pagto == true){
			this.pagto = true;
			System.out.println("Serviço pago com sucesso..:\n");
		}

		int opSer=1;
		int setopSer;
		double setValAux; 

		while(opSer==1)
		{
			System.out.println(" Qual o tipo de serviço deseja\n");
			System.out.println(" 1 - Banho = R$ 20,00\n");		
			System.out.println(" 2 - Tosa = R$ 15,00\n");			
			System.out.println(" 3 - Diaria = R$ 80,00\n");
			System.out.println(" 4 - Vacina = R$ 50,00\n");
			System.out.println(" 5 - Sair\n");			
			int escolha = teclado.nextInt();
			switch(escolha)
			{
			case 1: 
				
				if(cliente.getSaldo()>=20){
				cliente.setSaldo(cliente.getSaldo() - 20);
				System.out.println("Banho pago com sucesso\n");
				}else {
					System.out.println("Voce nao possui dinheiro para este servico\n");
				}					
			break;
			case 2: 
				if(cliente.getSaldo()>=15){
					cliente.setSaldo(cliente.getSaldo() - 15);
					System.out.println("Tosa paga com sucesso\n");
				}else {
					System.out.println("Voce nao possui dinheiro para este servico\n");
				}		
			break;
			case 3: 	
				if(cliente.getSaldo()>=80){
				System.out.println("Diaria paga com sucesso\n");
				cliente.setSaldo(cliente.getSaldo() - 80);
			break;
				}else {
					System.out.println("Voce nao possui dinheiro para este servico\n");
				}	
			case 4: 
				
				if(animal.isStatus() == false){
					if(cliente.getSaldo()>=50){
						cliente.setSaldo(cliente.getSaldo() - 50);
						System.out.println("Vacina paga com sucesso\n");
						animal.vacina();
				}
					else {
						System.out.println("O bicho ja esta vacinado, pokas\n");
					}		
				}
				else{
					System.out.println("Voce nao possui dinheiro para este servico\n");
				}
			break;
			case 5: 
				opSer=2;		
			break;
			default:
				System.out.println("opcao invalida\n");			
			}
		}
		}
		else{
			System.out.println("Voce nao possui dinheiro para nenhum servico\n");
		}

	}
}
