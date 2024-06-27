public class Triangulo extends FormaGeo{
	private float lado1;
	private float lado2;
	
	public Triangulo(String nome, float lado1, float lado2) {
		super(nome);//usará o construtor da classe mãe para receber o atributo nome
		this.setLado1(lado1);
		this.setLado2(lado2);
	}

	public float getLado1() {
		return lado1;
	}

	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}

	@Override
	public float calculaArea() {
		return (this.lado1*this.lado2)/2;
	}
	
}