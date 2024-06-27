// 10) Faça um programa para auxiliá-lo na geração de orçamentos para a construção de 5 casas.
// Para cada orçamento o sistema deve solicitar os seguintes dados:
// - Código do Orçamento;
// - Custos com material;
// - Custos com taxas;
// - Custo com a mão-de-obra. Obs: Para o custo de mão de obra o usuário deve informar o valor do metro quadrado da
// mão-de-obra e quantos metros quadrados possui a casa.
//
// Imprima o total do orçamento (material + taxas + mão de obra);
// Ao terminar de carregar os 10 orçamentos:
// a) Mostre quantos orçamentos tiveram custo de material maior que R$ 50.000,00
// e custo de mão de obra maior que R$ 80.000,00;
// b) Qual orçamento foi o mais caro (imprima o código do orçamento e o valor total);
// c) O valor total de todos os orçamentos e a média geral dos orçamentos.
// d) Com relação ao orçamento mais caro, quantos porcento corresponde ao total de todos os orçamentos.

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a, h, gg;
    float b, c, d, e, f, g, i, j, k;

    i = 0;
    h = 0;

    while (h < 3)
    {
        printf("Insira o codigo do Orçamento \n");
        scanf("%d", &a);
        printf("Insira os custos com material \n");
        scanf("%f", &b);
        printf("Insira o custo com taxas \n");
        scanf("%f", &c);
        printf("Insira o valor do trabalho por metro quadrado \n");
        scanf("%f", &d);
        printf("Insira o tamanho da obra em metros quadrados \n");
        scanf("%f", &e);

        f = d * e;
        g = b + c + f;
        i = i + g;

        printf("\n O valor do orcamento e %f\n", g);
        printf("\n \n");

        h++;
    }

    j = i / 3;

    if (b > 50000 || f > 80000)
    {
        printf("\n Os orcamentos com o custo de materias maior que 50000 e os orcamentos com mao de obra maior que 80000 sao %d \n", a);
    }

    if (h == 0)
    {
        gg = g;
    }

    if (g > gg)
    {
        printf("\n O Orcamento mais caro foi %d \n", a);
    }

    printf("\n O valor de todos os orcamentos e %f e a media e %f \n", i, j);

    k = (gg / i);

    printf("O orcamento mais caro corresponde a %f do total \n \n", k);
}