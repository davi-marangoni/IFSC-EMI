import java.util.Scanner; 

public class Carro { Scanner teclado = new Scanner(System.in); 

private String Codigo; private int Modelo; private String Fabricante; private int TipoCar;

public Carro(String cod,int modelo,String fabricante,int tipocar){ 
	this.Codigo=cod; 
	this.Modelo=modelo; 
	this.Fabricante=fabricante; 
	this.TipoCar=tipocar; 
 }

public String getCodigo() {
	return Codigo;
}

public void setCodigo(String codigo) {
	Codigo = codigo;
}

public int getModelo() {
	return Modelo;
}

public void setModelo(int modelo) {
	Modelo = modelo;
}

public String getFabricante() {
	return Fabricante;
}

public void setFabricante(String fabricante) {
	Fabricante = fabricante;
}

public int getTipoCar() {
	return TipoCar;
}

public void setTipoCar(int tipocar) {
	TipoCar = tipocar;
} 
public void NovoCarro(){ 
	System.out.println("Informe o Codigo\n"); 
	this.setCodigo(teclado.nextLine()); 
	System.out.println("Informe o Modelo\n"); 
	this.setModelo(teclado.nextInt()); 
	System.out.println("Informe o Fabricante\n"); 
	this.setFabricante(teclado.nextLine()); 
	System.out.println("Informe o Tipo\n"); 
	this.setTipoCar(teclado.nextInt()); 
} 
public void AlteraTipo(){ 
	System.out.println("Informe o Tipo\n"); 
	this.setTipoCar(teclado.nextInt()); 
} 

}