package davi;

import java.util.Scanner;

public class Pilha {

	private String MarcaP;
	private String CorP;
	private int CargaP;
	private int PesoP;
	static Scanner teclado =new Scanner(System.in);

	// metodo construtor

	public Pilha (String MarcaP, String CorP, int CargaP, int PesoP) {

		this.MarcaP = MarcaP;
		this.CorP = CorP;
		this.CargaP = CargaP;
		this.PesoP = PesoP;

	}

	public String getMarcaP() {	
		return MarcaP;
	}
	public void setMarcaP(String marcaP) {
		MarcaP = marcaP;	
	}
	public String getCorP() {	
		return CorP;
	}
	public void setCorP(String corP) {
		CorP = corP;	
	}
	public int getCargaP() {
		return CargaP;
	}
	public void setCargaP(int cargaP) {
		CargaP=cargaP;
	}
	public int getPesoP() {
		return PesoP;
	}
	public void setPesoP(int pesoP) {
		PesoP=pesoP;
	}
	public void mudaCargaP(){
		this.CargaP=100;	
		System.out.println("BIP BOP! Pilha trocada!");
	}
	public void perdecarga(){
		this.CargaP-=3;
	}
	public void statusbateria(){
		System.out.print("Bateria: " + this.CargaP + "\n");
		this.bateriafraca();
	}
	public void bateriafraca(){
		if(CargaP<=10){
			System.out.print("BIP BOP Bateria fraca BIP\n");
			
		}
	}
}