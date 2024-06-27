package ContaCorrente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cliente cli = new Cliente("Marcelo", "87987", "0127454241", "marcelinho", "Porto Alegre", "87987", "Chapeco", "SC");
        ContaCorrente cta = new ContaCorrente("Bradesco", 8798, 87987, "1234566-10", 9999999999.00F, true, cli);
        Scanner teclado = new Scanner(System.in);
        int nOpcao;

        while (true) {
            System.out.println("Sistema Bancario");
            System.out.println("Digite a opção: ");
            System.out.println("01 - Visializar dados do cliente");
            System.out.println("02 - Alterar dados do cliente");
            System.out.println("03 - Alterar endereço do cliente");
            System.out.println("04 - Alterar telefone do cliente");
            System.out.println("05 - Alterar cidade e estado do cliente");
            System.out.println("06 - Alterar senha do cliente");
            System.out.println("07 - Visializar dados da conta corrente");
            System.out.println("08 - Abrir conta corrente");
            System.out.println("09 - Fechar conta corrente");
            System.out.println("10 - Alterar dados da conta corrente");
            System.out.println("11 - Debitar saldo da conta corrente");
            System.out.println("12 - Creditar saldo da conta corrente");

            nOpcao = teclado.nextInt();
            switch (nOpcao) {
                case 1:
                    cli.visualizaCliente();
                    break;
                case 2:
                    cli.alteraCliente();
                    break;
                case 3:
                    cli.alteraEndereco();
                    break;
                case 4:
                    cli.alteraFone();
                    break;
                case 5:
                    cli.alteraCidadeEstado();
                    break;
                case 6:
                    cli.alteraSenha();
                    break;
                case 7:
                    cta.visualizaConta();
                    break;
                case 8:
                    cta.abrirConta();
                    break;
                case 9:
                    cta.fecharConta();
                    break;
                case 10:
                    cta.alteraConta();
                    break;
                case 11:
                    cta.debitaSaldo();
                    break;
                case 12:
                    cta.creditaSaldo();
                    break;
                default:
                    System.out.println("Opção Invalida");
            }
            System.out.println("Deseja realizar outra opção: 1-sim, 0-não");
            nOpcao = teclado.nextInt();
            if (nOpcao == 0) {
                System.out.println("Programa encerrado.");
                break;
            }
        }
        teclado.close();
    }
}
