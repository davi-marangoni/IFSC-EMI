package kk;
import java.util.Scanner;

public class Yal {
    public static void main(String[] args) {
        int nNum1, nNum2, nNum3, Aux = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Informe um número: ");
        nNum1 = teclado.nextInt();

        System.out.printf("Informe um número: ");
        nNum2 = teclado.nextInt();

        System.out.printf("Informe um número: ");
        nNum3 = teclado.nextInt();

        if (nNum1 == nNum2 && nNum2 == nNum3) {
            System.out.println("Os números são iguais!");
        } else if (nNum1 == nNum2 || nNum2 == nNum3 || nNum1 == nNum3) {
            System.out.println("Apenas dois números são iguais!");
        } else {
            System.out.println("Todos diferentes!");
        }

        if (nNum2 > nNum3) {
            Aux = nNum2;
            nNum2 = nNum3;
            nNum3 = Aux;
        }

        if (nNum1 > nNum2) {
            Aux = nNum1;
            nNum1 = nNum2;
            nNum2 = Aux;
        }

        if (nNum2 > nNum3) {
            Aux = nNum2;
            nNum2 = nNum3;
            nNum3 = Aux;
        }

        System.out.println("A ordem é assim: " + nNum1 + " > " + nNum2 + " > " + nNum3 + ".");

        teclado.close();
    }
}
