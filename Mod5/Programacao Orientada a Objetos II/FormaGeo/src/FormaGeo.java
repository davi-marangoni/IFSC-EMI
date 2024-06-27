public abstract class FormaGeo {
	private String nome;
	
	public FormaGeo(String nome) {
		super();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public abstract float calculaArea();
}