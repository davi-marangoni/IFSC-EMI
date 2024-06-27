package kk;
import java.util.Scanner;

public class Fiun {
    public static void main(String[] args) {
        double n1, n2, n3, n4;
        double Cont, Cont1;
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Informe o primeiro número: ");
        n1 = teclado.nextDouble();

        System.out.printf("Informe o segundo número: ");
        n2 = teclado.nextDouble();

        System.out.printf("Informe o terceiro número: ");
        n3 = teclado.nextDouble();

        System.out.printf("Informe o quarto número: ");
        n4 = teclado.nextDouble();

        Cont = (((n1 * 2) + (n2 / 2)) * n3) / n4;
        Cont1 = (((n4 * 2) + (n3 / 2)) * n2) / n1;

        if (Cont < Cont1) {
            System.out.printf("O cálculo 1,2,3,4 é menor que o cálculo 4,3,2,1");
        } else if (Cont == Cont1) {
            System.out.printf("O cálculo 1,2,3,4 é igual ao cálculo 4,3,2,1");
        } else {
            System.out.printf("O cálculo 1,2,3,4 é maior que o cálculo 4,3,2,1");
        }

        teclado.close();
    }
}
