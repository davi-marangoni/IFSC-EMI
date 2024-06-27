////////////////////////////////////////////////////////////////////////
////			   TODOS OS DIREITOS RESERVADOS A 					////				
////				    TINY BOOTS DEVELOPER©						////
////																////
////				   COPIA SUJEITO A PAULADA						////
////////////////////////////////////////////////////////////////////////	
import java.util.Scanner;
public class Cliente {
	Scanner teclado = new Scanner(System.in);
	private String cpf;
	private String nome;
	private boolean habilitado;
	public Cliente(String p,String m,boolean d)
	{
		this.cpf=p;
		this.nome=m;
		this.habilitado=d;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	public void habilitacliente() {
	if(this.getHabilitado()== true){
		System.out.println("CLIENTE JA ESTA HABILITADO");
	}
	if(this.getHabilitado()== false){
		this.setHabilitado(true);
		System.out.println("CLIENTE HABILITADO");
	}		
	}
	public void desabilitacliente() {
	if(this.getHabilitado()== false){
		System.out.println("CLIENTE JA ESTA DESABILITADO");
	}
	if(this.getHabilitado()== true){
		this.setHabilitado(false);
		System.out.println("CLIENTE DESABILITADO");
	}		
	}
	public void AtualizaCliente()
	{
		System.out.println("informe o CPF");
		this.setCpf(teclado.nextLine());
		System.out.println("informe o nome");
		this.setNome(teclado.nextLine());
		this.setHabilitado(true);
	}
	public void VisualizaCliente(){
		System.out.println("Nome do Cliente: "+ this.getNome());
		System.out.println("CPF: "+ this.getCpf());
		System.out.println("Habilitado: "+ this.getHabilitado());	
	}
}