import java.util.Scanner;

public class Aaaaaa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos na classe: ");
        int n = teclado.nextInt();
        int v[] = new int[n];
        int i;
        float soma = 0;

        for (i = 0; i < n; i++) {
            System.out.println("Digite a nota do aluno: ");
            v[i] = teclado.nextInt();
            soma += v[i];
        }

        float media = soma / n;
        System.out.printf("\nA média da turma foi = %.2f\n", media);

        teclado.close();
    }
}
