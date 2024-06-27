////////////////////////////////////////////////////////////////////////
////			   TODOS OS DIREITOS RESERVADOS A 					////				
////				    TINY BOOTS DEVELOPER©						////
////																////
////				   COPIA SUJEITO A PAULADA						////
////////////////////////////////////////////////////////////////////////	
import java.util.Scanner;
public class Carro {
	Scanner teclado = new Scanner(System.in);
	private String placa;
	private String modelo;
	private float valdiaria;
	private boolean disponivel;
	public Carro(String p,String m, float vd,boolean d)
	{
		this.placa=p;
		this.modelo=m;
		this.valdiaria=vd;
		this.disponivel=d;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getValdiaria() {
		return valdiaria;
	}
	public void setValdiaria(float s) {
		this.valdiaria = s;
	}
	public boolean getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	public void devolucaoveiculo()
	{
		this.setDisponivel(true);
		System.out.println("O CARRO ESTA DISPONIVEL");
	}
	public void AtualizarDiaria()
	{
		System.out.println("informe o novo valor da diaria");
		this.setValdiaria(teclado.nextFloat());
	}
	public void VisualizaCarro()
	{
		System.out.println("Placa: "+ this.getPlaca());
		System.out.println("Modelo: "+ this.getModelo());
		System.out.println("Valor da diaria: "+ this.getValdiaria());
		System.out.println("Disponivel: "+ this.getDisponivel());
	}
	
}