import java.util.Scanner;

public class Gfya {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1 = 0, n2 = 0, n3 = 0, n4 = 0;
        int cont = 0;

        while (cont < 4) {
            System.out.println("Informe sua opinião sobre a loja: 1 - Muito Satisfeito, 2 - Satisfeito, 3 - Pouco Satisfeito, 4 – Insatisfeito");
            int val = teclado.nextInt();

            switch (val) {
                case 1:
                    n1 += 1;
                    break;
                case 2:
                    n2 += 1;
                    break;
                case 3:
                    n3 += 1;
                    break;
                case 4:
                    n4 += 1;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            cont++;
        }

        double mn1 = (n1 / 4) * 100;
        double mn2 = (n2 / 4) * 100;
        double mn3 = (n3 / 4) * 100;
        double mn4 = (n4 / 4) * 100;

        System.out.printf("O resultado é: 1 - %.2f%%, 2 - %.2f%%, 3 - %.2f%%, 4 - %.2f%%%n", mn1, mn2, mn3, mn4);

        teclado.close();
    }
}
