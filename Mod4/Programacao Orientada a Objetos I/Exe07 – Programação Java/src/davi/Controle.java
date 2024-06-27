package davi;

import java.util.Scanner;

public class Controle {
	private String Marca;
	private int Volume;
	private int Canal;
	private String Cor;
	private int Power;
	static Scanner teclado =new Scanner(System.in);

	// metodo construtor

	public Controle (String Marca, int Volume,int Canal, String Cor, int Power) {

		this.Marca = Marca;
		this.Volume = Volume;
		this.Canal = Canal;
		this.Cor = Cor;
		this.Power = Power;
	}
	public String getMarca() {	
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;	
	}
	public int getVolume() {
		return Volume;
	}
	public void setVolume(int volume) {
		Volume=volume;
	}
	public int getCanal() {
		return Canal;
	}
	public void setCanal(int canal) {
		Canal=canal;
	}    	
	public String getCor() {
		return Cor;
	}       
	public void setCor(String cor) {
		Cor=cor;
	}   
	public int getPower() {
		return Power;
	}        
	public void setPower(int power) {
		Power=power;
	}      
	
	public void ligadesliga(){
		if(Power == 0){
			System.out.println("Você ligou a TV");
			setPower(1);
		}
		else{
			System.out.println("Você desligou a TV");
			setPower(0);
		}
	}
	public void canalMais(){
		if(Power == 0) {       	
			System.out.println("A TV TA DESLIGADA BURRO!");
		}
		else{
			setCanal(Canal+1);
			if(Canal > 99) {
				setCanal(1);
			}
			System.out.println("Você está no canal:"+Canal+"!");
		}

	}
	public void canalMenos(){

		if(Power == 0) {       	
			System.out.println("A TV TA DESLIGADA BURRO!");
		}
		else{
			setCanal(Canal-1);
			if(Canal == 0) {
				setCanal(100);
			}
			System.out.println("Você está no canal:"+Canal+"!");
		}
	}
	public void  VolumeMais(){

		if(Power == 0) {       	
			System.out.println("A TV TA DESLIGADA BURRO!");
		}
		else {
			setVolume(Volume+1);
			System.out.println("Você está no volume:"+Volume+"!");
		}
	}
	public void VolumeMenos(){

		if(Power == 0) {       	
			System.out.println("A TV TA DESLIGADA BURRO!");
		}
		else {
			setVolume(Volume-1);
			System.out.println("Você está no volume:"+Volume+"!");
		}
	}
	public void cor(){
		System.out.println("A cor é:"+Cor+"!");
	}
	public void status(){
		System.out.print("Marca: " + this.Marca + "\n");
		System.out.print("Volume: " + this.Volume + "\n");
		System.out.print("Canal: " + this.Canal + "\n");
		System.out.print("Cor: " + this.Cor + "\n");
		System.out.print("Power: " + this.Power + "\n");
	}




}