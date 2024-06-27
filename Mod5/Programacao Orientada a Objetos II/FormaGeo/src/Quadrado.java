public class Quadrado extends FormaGeo{
	private float lado;
	
	public Quadrado(String nome, float lado) {
		super(nome);
		this.lado = lado;
	} 
	
	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	@Override
	public float calculaArea(){
		return this.lado*this.lado;
	}
	
}