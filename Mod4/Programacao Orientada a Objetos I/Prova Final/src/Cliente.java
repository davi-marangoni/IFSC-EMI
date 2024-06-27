import java.util.Scanner; 

public class Cliente { 
	
	private Scanner teclado;
	private String Cpf; private String NomeD; private String Fone; private float Saldo; private boolean Status;

	public Cliente(String cpf,String nome,String fone,float saldo, boolean status){ 
		teclado = new Scanner(System.in); 
		
		this.Cpf=cpf; 
		this.NomeD=nome; 
		this.Fone=fone; 
		this.Saldo=saldo; 
		this.Status=status;
	} 

	public String getCpf() { 
		return Cpf; 
	} 

	public void setCpf(String cpf) { 
		Cpf = cpf; 
	} 

	public String getNomeD() {
		return NomeD; 
	} 

	public void setNomeD(String nome) { 
		NomeD = nome; 
	} 

	public String getFone() { 
		return Fone; 
	} 

	public void setFone(String fone) { 
		Fone = fone; 
	} 

	public float getSaldo() { 
		return Saldo; 
	} 

	public void setSaldo(float saldo) { 
		Saldo = saldo; 
	} 
	
	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}
	public void NovoCliente(){ 
		System.out.println("Informe o CPF\n"); 
		this.setCpf(teclado.nextLine()); 
		System.out.println("Informe o Nome\n"); 
		this.setNomeD(teclado.nextLine()); 
		System.out.println("Informe o Fone\n"); 
		this.setFone(teclado.nextLine()); 
	} 
	public void AlteraSaldo(){ 
		System.out.println("Informe o Saldo\n"); 
		this.setSaldo(teclado.nextFloat()); 
	} 
	public void AlteraStatus(){ 
		System.out.println("Informe o Status, Digita true, Digite false\n"); 
		this.setStatus(teclado.nextBoolean()); 		
	} 
	public void ConsultaCliente(){
		System.out.println("Nome: "+ this.getNomeD());
		System.out.println("CPF: "+ this.getCpf());
		System.out.println("Fone: "+ this.getFone());
		System.out.println("Saldo"+ this.getSaldo());
	}
	
}