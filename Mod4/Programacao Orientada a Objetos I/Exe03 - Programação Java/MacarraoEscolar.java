import java.util.Scanner;

public class MacarraoEscolar {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de alunos:");
        float nAlunos = teclado.nextFloat();
        float nQtd = (float) (nAlunos * 0.3);
        float nDesc = (float) (nQtd - (nQtd * 0.05));

        float qtdCincoKg = (float) Math.ceil(nDesc / 5);
        float custoCincoKg = qtdCincoKg * 15.00f;
        System.out.printf("Quantidade de sacos de 5 kg: %.1f, Custo: R$ %.2f\n", qtdCincoKg, custoCincoKg);

        float qtdUmEMeioKg = (float) Math.ceil(nDesc / 1.5);
        float custoUmEMeioKg = qtdUmEMeioKg * 5.50f;
        System.out.printf("Quantidade de pacotes de 1,5 kg: %.1f, Custo: R$ %.2f\n", qtdUmEMeioKg, custoUmEMeioKg);

        double resto = nDesc % 5;
        double custoMisto = 0;

        if (resto > 0) {
            float qtdExtraCincoKg = (float) Math.floor(resto / 5);
            float qtdExtraUmEMeioKg = (float) Math.ceil((resto % 5) / 1.5);
            custoMisto = (qtdCincoKg - qtdExtraCincoKg) * 15.00f + qtdExtraUmEMeioKg * 5.50f;
        } else {
            custoMisto = custoCincoKg;
        }

        System.out.printf("Custo misto para menor preço: R$ %.2f\n", custoMisto);

        teclado.close();
    }
}
