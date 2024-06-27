import java.util.Scanner;

public class CalculosMatematicos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira o primeiro número:");
        float nNum1 = teclado.nextFloat();
        float nRaizQ = (float) Math.sqrt(nNum1);
        System.out.println("A raiz quadrada do primeiro número é: " + nRaizQ);

        System.out.println("Insira o segundo número:");
        float nNum2 = teclado.nextFloat();
        float nExpo = (float) Math.pow(nRaizQ, nNum2);
        System.out.println("A exponenciação da raiz quadrada pelo segundo número é: " + nExpo);

        float nRaizCubo = (float) Math.cbrt(nExpo);
        System.out.println("A raiz cúbica do resultado anterior é: " + nRaizCubo);

        float nArredondaBaixo = (float) Math.floor(nRaizCubo);
        System.out.println("A raiz cúbica arredondada para baixo é: " + nArredondaBaixo);

        float nArredondaCima = (float) Math.ceil(nRaizCubo);
        System.out.println("A raiz cúbica arredondada para cima é: " + nArredondaCima);

        float nArredondaArit = (float) Math.round(nRaizCubo);
        System.out.println("A raiz cúbica arredondada aritmeticamente é: " + nArredondaArit);

        float nValAbsoluta = (float) Math.abs(nRaizCubo);
        System.out.println("O valor absoluto da raiz cúbica é: " + nValAbsoluta);

        teclado.close();
    }
}
