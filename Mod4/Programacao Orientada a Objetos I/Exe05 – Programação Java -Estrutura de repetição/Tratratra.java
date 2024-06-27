import java.util.Scanner;

public class Tratratra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 10;
        int v[] = new int[n];
        int i;

        for (i = 0; i < n; i++) {
            System.out.println("Digite 10 números: ");
            v[i] = teclado.nextInt();
        }

        int menor = v[0];
        int maior = v[0];
        int dif = 0;

        for (i = 0; i < n; i++) {
            if (v[i] < menor)
                menor = v[i];
            if (v[i] > maior)
                maior = v[i];
        }
        dif = maior - menor;

        for (i = 0; i < n; i++) {
            if (v[i] == menor)
                System.out.printf("v[%d] = %2d <--- menor valor\n", i, v[i]);
            else if (v[i] == maior)
                System.out.printf("v[%d] = %2d <--- maior valor\n", i, v[i]);
        }

        System.out.printf("\nDiferença entre o maior e o menor = %d\n", dif);

        teclado.close();
    }
}
