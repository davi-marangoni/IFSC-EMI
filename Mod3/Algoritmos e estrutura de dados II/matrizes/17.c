// 17) Faça um programa para auxiliá-lo na geração de orçamentos para a construção de 10 casas.
//
// Para cada orçamento o sistema deve solicitar e armazenar em uma matriz (10 x 5) os seguintes dados:
//     - Código do Orçamento;
//     - Custos com material;
//     - Custos com taxas; (R$);
//     - Custo com a mão-de-obra. (R$ x m²) ; Obs: Para o custo de mão de obra o usuário deve
//       informar o valor do metro quadrado(R$) da mão-de-obra e quantos metros quadrados possui a casa.
//     - Total do orçamento (material + taxas + mão de obra);
//
// Ao terminar de carregar os 10 orçamentos:
// a) Mostre todos os dados da matriz;
// b) Qual orçamento foi o mais caro (imprima o código do orçamento e o valor total);
// c) O valor total de todos os orçamentos e a média geral dos orçamentos.

#include <stdio.h>
main()
{
    int nCont, y;
    float nOrca[10][5], nTotal, nMaior, nTotTodos, nMedia, nCodMaior, valor, mquadrado;
    nMaior = nTotTodos = 0;
    for (nCont = 0; nCont < 10; nCont++)
    {
        printf("Informe o codigo do orcamento\n");
        scanf("%f", &nOrca[nCont][0]);
        printf("Informe o custo com material\n");
        scanf("%f", &nOrca[nCont][1]);
        printf("Informe o custo com taxas\n");
        scanf("%f", &nOrca[nCont][2]);
        printf("Informe o metro quadrado\n");
        scanf("%f", &mquadrado);
        printf("Informe o valor do metro quadrado");
        scanf("%f", &valor);
        nOrca[nCont][3] = mquadrado * valor;
        nOrca[nCont][4] = nOrca[nCont][1] + nOrca[nCont][2] + nOrca[nCont][3];
        if (nOrca[nCont][4] > nMaior)
        {
            nMaior = nOrca[nCont][4];
            nCodMaior = nOrca[nCont][0];
        }
        nTotTodos += nOrca[nCont][4];
    }
    nMedia = nTotTodos / 10;
    for (nCont = 0; nCont < 10; nCont++)
    {
        printf("Codigo\n%f", nOrca[nCont][0]);
        printf("Mão de obra\n%f", nOrca[nCont][3]);
        printf("Material\n%f", nOrca[nCont][1]);
        printf("Taxa\n%f", nOrca[nCont][2]);
    }
    printf("O Mais caro %f com %f\n", nCodMaior, nMaior);
    printf("Total de todos os orcamentos %f e a media geral %f", nTotTodos, nMedia);
}