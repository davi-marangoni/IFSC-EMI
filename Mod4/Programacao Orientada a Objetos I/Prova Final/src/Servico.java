import java.util.Scanner;

public class Servico {

	private Scanner teclado;
	private String CodServico; 
	private String TipoServico; 
	private Carro TipoCar;
	private boolean Status; 
	private float Saldo;
	private float Valor; 
	private boolean Pagto;
	
	public Servico ( String codservico, String tiposervico, Carro tipocar, boolean status, float valor, boolean pagto, float saldo)
	{
		this.teclado = new Scanner(System.in); 
		this.CodServico= codservico;
		this.TipoServico = tiposervico;
		this.TipoCar = tipocar;
		this.Status = status;
		this.Saldo = saldo;
		this.Valor = valor;
		this.Pagto = pagto;
	}

	public String getCodServico() {
		return CodServico;
	}

	public void setCodServico(String codServico) {
		CodServico = codServico;
	}

	public String getTipoServico() {
		return TipoServico;
	}

	public void setTipoServico(String tipoServico) {
		TipoServico = tipoServico;
	}
	public Carro getTipoCar() {
		return TipoCar;
	}

	public void setTipoCar(Carro tipocar) {
		TipoCar = tipocar;
	}
	public boolean getClienteStatus() {
		return Status;
	}

	public void setClienteStatus(boolean status) {
		Status = status;
	}
	
	public float getClienteSaldo() {
		return Saldo;
	}

	public void setClienteSaldo(float saldo) {
		Saldo = saldo;
	}
	public float getValor() {
		return Valor;
	}

	public void setValor(float valor) {
		Valor = valor;
	}

	public boolean isPagto() {
		return Pagto;
	}

	public void setPagto(boolean pagto) {
		Pagto = pagto;
	}
	public void incluiServico (Cliente saldo, Cliente status, Carro tipocar, int Servico, float valor,boolean pagto ) {
		
		int opSer=1;
		float ValorQueSoma=0;
		
		while(opSer==1)
		{
			System.out.println(" Qual o tipo de serviço deseja\n");
			System.out.println(" 1 - Lavação externa R$ 25,00\n");		
			System.out.println(" 2 - Lavação Completa R$ 50,00\n");			
			System.out.println(" 3 - Lavação com Cera R$ 70,00\n");
			System.out.println(" 4 - Deseja pagar adiantado??\n");	
			System.out.println(" 5 - Sair\n");			
			int escolha = teclado.nextInt();
			switch(escolha)
		{
		case 1: 	
			if(saldo.getSaldo()-valor>=25 &&  saldo.getSaldo()>=25){
				if(tipocar.getTipoCar() == 1){
					ValorQueSoma = 25;
				}
				if(tipocar.getTipoCar() == 2){
					ValorQueSoma = (float) (25*1.5);
				}
				if(tipocar.getTipoCar() == 3){
					ValorQueSoma = (float) (25*0.8);
				}
				if(tipocar.getTipoCar() == 4){
					ValorQueSoma = 25*2;
				}
				valor = valor+ValorQueSoma;
				}					
				break;
		case 2: 	
			if(saldo.getSaldo()-valor>=50 &&  saldo.getSaldo()>=50){
				if(tipocar.getTipoCar() == 1){
					ValorQueSoma = 50;
				}
				if(tipocar.getTipoCar() == 2){
					ValorQueSoma = (float) (50*1.5);
				}
				if(tipocar.getTipoCar() == 3){
					ValorQueSoma = (float) (50*0.8);
				}
				if(tipocar.getTipoCar() == 4){
					ValorQueSoma = 50*2;
				}
				valor = valor+ValorQueSoma;
				}	
				break;
		case 3: 	
			if(saldo.getSaldo()-valor>=70 &&  saldo.getSaldo()>=70){
				if(tipocar.getTipoCar() == 1){
					ValorQueSoma = 70;
				}
				if(tipocar.getTipoCar() == 2){
					ValorQueSoma = (float) (70*1.5);
				}
				if(tipocar.getTipoCar() == 3){
					ValorQueSoma = (float) (70*0.8);
				}
				if(tipocar.getTipoCar() == 4){
					ValorQueSoma = 70*2;
				}
				valor = valor+ValorQueSoma;
				}	
				break;
		case 4:
			ConcluiServico();
			break;
		case 5:	
			opSer = 2;
				}
			}
		}
		public void ConcluiServico() {
			if(isPagto() == false){
				float saldofinal =0;
				saldofinal = this.Saldo - this.Valor;
				setClienteSaldo(saldofinal);
				System.out.println("Servico pago com sucesso\n");
				setPagto(true);
			}
		}	
	}