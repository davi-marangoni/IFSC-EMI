import java.util.Scanner;

public class Circunferencia {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o raio:");
        double raio = teclado.nextDouble();
        double area = Math.PI * (raio * raio);
        System.out.println("Área desejada: " + area);
        teclado.close();
    }
}
