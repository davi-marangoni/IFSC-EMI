import java.util.Scanner; 

public class Cliente { 
	
	private Scanner teclado;
	private String Cpf; private String NomeD; private String Fone; private float Saldo; 

	public Cliente(String cpf,String nome,String fone,float saldo){ 
		teclado = new Scanner(System.in); 
		
		this.Cpf=cpf; 
		this.NomeD=nome; 
		this.Fone=fone; 
		this.Saldo=saldo; 
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
	
	public void AtualizaSaldo(){ 
		System.out.println("informe o novo saldo\n"); 
		this.setSaldo(teclado.nextFloat()); 
		}
	
	public void AtualizaCliente(){ 
		System.out.println("informe o cpf\n"); 
		this.setCpf(teclado.nextLine()); 
		System.out.println("informe o fone\n"); 
		this.setFone(teclado.nextLine()); 
		System.out.println("informe o saldo\n"); 
		this.setSaldo(teclado.nextFloat()); } 

public void InfoCliente() {
	System.out.println("Nome: "+ this.getNomeD());
	System.out.println("CPF: "+ this.getCpf());
	System.out.println("Fone: "+ this.getFone());	
	System.out.println("Saldo: "+ this.getSaldo());		
}
}