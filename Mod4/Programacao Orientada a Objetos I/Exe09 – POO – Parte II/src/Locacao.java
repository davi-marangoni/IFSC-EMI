////////////////////////////////////////////////////////////////////////
////			   TODOS OS DIREITOS RESERVADOS A 					////				
////				    TINY BOOTS DEVELOPER©						////
////																////
////				   COPIA SUJEITO A PAULADA						////
////////////////////////////////////////////////////////////////////////																
import java.util.Scanner;
public class Locacao {
	Scanner teclado = new Scanner(System.in);
	private String placa;
	private float cpf;
	private float datloc;
	private float datdev;
	private float tot;
	private Carro Carro;
	private Cliente Cliente;
	public Locacao(String p,String m,String vd,String d,float v,Carro ca,Cliente cli)
	{
		this.placa=p;
		this.cpf=1;
		this.datloc=1;
		this.datdev=1;
		this.tot=1;
		this.Carro=ca;
		this.Cliente=cli;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCpf() {
		return Cliente.getCpf();
	}
	public void setCpf(float cpf) {
		this.cpf = cpf;
	}
	public float getDatloc() {
		return datloc;
	}
	public void setDatloc(float datloc) {
		this.datloc = datloc;
	}
	public float getDatdev() {
		return datdev;
	}
	public void setDatdev(float datdev) {
		this.datdev = datdev;
	}
	public float getTot() {
		return tot;
	}
	public void setTot(float tot) {
		this.tot = tot;
	}
	public void IncluirLocacao()
	{
		System.out.println("qual a data de locação ?");
		this.setDatloc(teclado.nextInt());
		System.out.println("qual a data de devolução ?");
		this.setDatdev(teclado.nextInt());
		System.out.println("quantos dias o carro sera locado ?");
		int dia=teclado.nextInt();
		if((Carro.getDisponivel())&&(Cliente.getHabilitado()))
		{
			setTot(Carro.getValdiaria()*dia);
			System.out.println("o total a pagar é : "+getTot());
			Carro.setDisponivel(false);
		}
		else if(Carro.getDisponivel()){System.out.println("o motorista não esta hablitado");}
		else if(Cliente.getHabilitado()){System.out.println("o carro não esta disponivel");}
	}
	public void AtualixaDataDev()
	{
		System.out.println("qual a data de devolução ?");
		this.setDatdev(teclado.nextInt());
		System.out.println("quantos dias o carro sera alugado ?");
		int dianovo=teclado.nextInt();
		setTot(Carro.getValdiaria()*dianovo);
		System.out.println("o total a pagar é : "+getTot());
	}
	public void VisualizaLocacao(){
		
		System.out.println("Placa: "+ this.getPlaca());
		System.out.println("CPF: "+ this.getCpf());
		System.out.println("Data da Locação: "+ this.getDatloc());
		System.out.println("Data da Devolução: "+ this.getDatdev());	
		System.out.println("Valor Total: "+ this.getTot());		
	}
}