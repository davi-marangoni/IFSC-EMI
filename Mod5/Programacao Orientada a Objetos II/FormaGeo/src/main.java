public class main {

	public static void main(String[] args) {
		
		Quadrado q = new Quadrado("Quadrado", 6);
		System.out.println(q.calculaArea());
		
		Triangulo t = new Triangulo("Triangulo", 3 , 4);
		System.out.println(t.calculaArea());
	}

}