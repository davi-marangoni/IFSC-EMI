import java.util.Scanner; 

public class Animal { Scanner teclado = new Scanner(System.in); 

private String Codigo; private String Nome; private String Raca; private String Dono; private int Datavc; private static boolean Status; 

public Animal(String cod,String nome,String raca,String dono,int dat,boolean stats){ 
	this.Codigo=cod; 
	this.Nome=nome; 
	this.Raca=raca; 
	this.Dono=dono; 
	this.Datavc=dat; 
	this.Status=stats; } 

public String getCodigo() { 
	return Codigo; } 

public void setCodigo(String codigo) { 
	Codigo = codigo; } 

public String getNome() { 
	return Nome; } 

public void setNome(String nome) { 
	Nome = nome; } 

public String getRaca() {
	return Raca; } 

public void setRaca(String raca) { 
	Raca = raca; } 

public String getDono() {
	return Dono; } 

public void setDono(String dono) {
	Dono = dono; } 

public int getDatavc() { 
	return Datavc; } 

public void setDatavc(int datavc) {
	Datavc = datavc; } 

public boolean isStatus() { 
	return Status; } 

public void setStatus(boolean status){ 
	Status = status; }

public void vacina() {	
	this.Status = true;
}
public void AtualizaDataVacina(){ 
	System.out.println("informe a nova data\n"); 
	this.setDatavc(teclado.nextInt()); 
	} 


public void StatusAnimal()
{
	if(Status == true){
		System.out.println("O animal esta vacinado\n");
	}else {
		
		System.out.println("O animal nao esta vacinado\n");
		
	}
		
}

public void InfoAnimal() {
	System.out.println("Nome: "+ this.getNome());
	System.out.println("Nome do Dono: "+ this.getDono());
	System.out.println("Raca: "+ this.getRaca());
	System.out.println("Data da proxima vacina: "+ this.getDatavc());	
}
}