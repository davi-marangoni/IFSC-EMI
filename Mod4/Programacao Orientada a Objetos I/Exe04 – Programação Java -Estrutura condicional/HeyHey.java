package kk;
import java.util.Scanner;

public class HeyHey {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nNum1, nNum2, Opera;
        int Op;

        System.out.println("Informe um número: ");
        nNum1 = teclado.nextFloat();

        System.out.println("Informe um número: ");
        nNum2 = teclado.nextFloat();

        System.out.println("Informe qual a operação que você deseja fazer: 1 = +, 2 = -, 3 = *, 4 = / ");
        Op = teclado.nextInt();

        switch (Op) {
            case 1:
                Opera = nNum1 + nNum2;
                System.out.println("A soma é " + Opera + ".");
                break;
            case 2:
                Opera = nNum1 - nNum2;
                System.out.println("A subtração é " + Opera + ".");
                break;
            case 3:
                Opera = nNum1 * nNum2;
                System.out.println("A multiplicação é " + Opera + ".");
                break;
            case 4:
                Opera = nNum1 / nNum2;
                System.out.println("A divisão é " + Opera + ".");
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }

        teclado.close();
    }
}
