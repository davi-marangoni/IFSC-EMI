// 2) Uma conta telefônica é composta dos seguintes custos: R$ 32,00 a assinatura mensal
// incluindo 90 chamadas para telefone fixo. R$ 0,09 por chamada para telefone fixo que exceder as 90 chamadas inclusas
// na assinatura mensal. R$0,35 por chamada para telefone móvel. Escreva um programa que monte a fórmula
// para calcular o valor da conta para 254 chamadas para fixo e 23 chamadas para móvel imprimindo o resultado obtido.

#include <stdio.h>
#include <stdlib.h>

main()
{
    float fixo, fixoamais, movel, movelpagar, formula;
    printf("quantas chamadas para telefone movel foram feitas? ");
    scanf("%f", &movel);
    movelpagar = movel * 0.35;

    printf("quantas ligaçoes para fixo foram feitas? ");
    scanf("%f", &fixo);

    if (fixo > 90)
    {
        fixoamais = (fixo * 0.09) - 8.10;
    }

    formula = fixoamais + movelpagar + 32;
    printf("voce tem que pagar: %f", formula);
}