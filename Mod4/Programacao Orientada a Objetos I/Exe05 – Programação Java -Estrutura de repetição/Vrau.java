package shuashuashua;
import java.util.Scanner;

public class Vrau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y, i;

        System.out.print("Digite o valor do primeiro número: ");
        x = scan.nextInt();

        System.out.print("Digite o valor do segundo número: ");
        y = scan.nextInt();

        if ((x + 1) < y) {
            System.out.println("Números que estão entre " + x + " e " + y + " são:");
            for (i = (x + 1); i < y; i++) {
                System.out.println("- " + i);
            }
        } else {
            System.out.print("Os valores informados não têm intervalo inteiro ou positivo.");
        }

        scan.close();
    }
}
